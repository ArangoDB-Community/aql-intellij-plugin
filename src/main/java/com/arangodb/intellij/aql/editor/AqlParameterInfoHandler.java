

package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.grammar.generated.psi.impl.AqlParameterVariableImpl;
import com.arangodb.intellij.aql.util.JSON;
import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.lang.ASTNode;
import com.intellij.lang.ReadOnlyASTNode;
import com.intellij.lang.parameterInfo.*;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.JavaTokenType;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.text.CharArrayUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;


public class AqlParameterInfoHandler implements ParameterInfoHandlerWithTabActionSupport<AqlNamedFunctions, Object, AqlParameterVariable> {
    private static final Logger log = LoggerFactory.getLogger(AqlParameterInfoHandler.class);
    private static final ASTNode[] AST_NODES = new ASTNode[0];
    private static final AqlParameterVariable[] EMPTY = new AqlParameterVariable[0];
    private AqlParams params;
    @SuppressWarnings("rawtypes")
    private static final Set<Class> CLASS_SET = Collections.singleton(AqlNamedFunctions.class);

    @SuppressWarnings("rawtypes")
    private static final Set<Class> ALLOWED_PARENT_CLASSES = ContainerUtil.newHashSet(
            AqlNamedFunctions.class, AqlExpressionType.class);

    @Nullable
    @Override
    public AqlNamedFunctions findElementForParameterInfo(@NotNull final CreateParameterInfoContext context) {
        final AqlNamedFunctions namedFunctions = getAqlNamedFunctions(context);
        if (namedFunctions != null) {
            context.setItemsToShow(new Object[]{namedFunctions});
        }
        return namedFunctions;
    }

    @Nullable
    private AqlNamedFunctions getAqlNamedFunctions(@NotNull final CreateParameterInfoContext context) {
        final PsiFile file = context.getFile();
        int offset = context.getOffset();
        final CharSequence chars = file.getViewProvider().getContents();
        if (offset >= chars.length()) {
            offset = chars.length() - 1;
        }
        int offset1 = CharArrayUtil.shiftBackward(chars, offset, " \t\n\r");
        if (offset1 < 0) {
            return null;
        }
        if (offset1 != offset) {
            offset = offset1;
        }
        final PsiElement element = file.findElementAt(offset);
        if (element == null) {
            return null;
        }


        final AqlFunctionExpression expr = PsiTreeUtil.getParentOfType(element, AqlFunctionExpression.class);
        if (expr != null) {
            return expr.getNamedFunctions();
        }

        return null;
    }

    @Override
    public void showParameterInfo(@NotNull final AqlNamedFunctions element, @NotNull final CreateParameterInfoContext context) {
        int offset = element.getTextRange().getStartOffset() + 1;
        context.showHint(element, offset, this);
    }

    @Nullable
    @Override
    public AqlNamedFunctions findElementForUpdatingParameterInfo(@NotNull final UpdateParameterInfoContext context) {
        final PsiElement parameterOwner = context.getParameterOwner();
        if (parameterOwner instanceof AqlNamedFunctions) {
            return (AqlNamedFunctions) parameterOwner;
        }
        return null;
    }

    @Override
    public void updateParameterInfo(@NotNull final AqlNamedFunctions aqlNamedFunctions, @NotNull final UpdateParameterInfoContext context) {
        if (context.getParameterOwner() == null || aqlNamedFunctions.equals(context.getParameterOwner())) {
            context.setParameterOwner(aqlNamedFunctions);
        } else {
            context.removeHint();
        }
    }

    @Override
    public void updateUI(final Object o, @NotNull final ParameterInfoUIContext context) {
        if (o instanceof AqlNamedFunctions) {
            final AqlNamedFunctions p = (AqlNamedFunctions) o;
            // TODO implement parameter offsets etc.
            final String functionName = p.getFunctionName();
            final List<String> params = getParameters(functionName);
            boolean first = true;
            final StringBuilder builder = new StringBuilder(params.size() * 20);
            builder.insert(0, "<table>");
            for (String param : params) {
                if (first) {
                    first = false;
                    builder.append("<tr><td>")
                            .append("<b>")
                            .append(param).append("</b>")
                            .append("</td></tr>");

                    continue;
                }

                builder.append("<tr><td>")
                        .append(param)
                        .append("</td></tr>");


            }
            builder.append("</table>");
            context.setupRawUIComponentPresentation(builder.toString());
        }

    }

    @NotNull
    @Override
    public AqlParameterVariable[] getActualParameters(@NotNull final AqlNamedFunctions o) {

        final List<String> parameters = getParameters(o.getFunctionName());
        final List<AqlParameterVariable> variables = new ArrayList<>();
        for (String parameter : parameters) {
            final AqlParameterVariableImpl variable = new AqlParameterVariableImpl(new VariableNode(null, 0));
            variable.setName(parameter);
            variables.add(variable);
        }
        return variables.toArray(EMPTY);
    }

    @NotNull
    @Override
    public IElementType getActualParameterDelimiterType() {
        return JavaTokenType.COMMA;
    }

    @NotNull
    @Override
    public IElementType getActualParametersRBraceType() {
        return JavaTokenType.RBRACE;
    }

    @SuppressWarnings("rawtypes")
    @NotNull
    @Override
    public Set<Class> getArgumentListAllowedParentClasses() {
        return ALLOWED_PARENT_CLASSES;
    }


    @SuppressWarnings("rawtypes")
    @NotNull
    @Override
    public Set<? extends Class> getArgListStopSearchClasses() {
        return CLASS_SET;
    }

    @NotNull
    @Override
    public Class<AqlNamedFunctions> getArgumentListClass() {
        return AqlNamedFunctions.class;
    }



    private List<String> getParameters(final String functionName) {
        if (functionName != null) {
            if (params == null) {
                try (final InputStream stream = getClass().getResourceAsStream("/AqlFunctionParameters.json")) {
                    if (stream == null) {
                        return Collections.emptyList();
                    }
                    @SuppressWarnings("UnstableApiUsage") final String string = CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
                    params = JSON.fromJson(string, AqlParams.class);
                } catch (IOException e) {
                    log.error("Error reading arguments list", e);
                }
            }
            if (params == null) {
                return Collections.emptyList();
            }
            return params.forName(functionName);
        }
        return Collections.emptyList();
    }

    @Override
    public boolean couldShowInLookup() {
        return true;
    }

    @Nullable
    @Override
    public Object[] getParametersForLookup(LookupElement item, ParameterInfoContext context) {
        return null;
    }

    private static class AqlParams {
        Map<String, List<String>> params = new HashMap<>();

        public Map<String, List<String>> getParams() {
            return params;
        }

        public void setParams(final Map<String, List<String>> params) {
            this.params = params;
        }

        public List<String> forName(final String functionName) {
            if (params != null) {
                final List<String> items = params.get(functionName);
                if (items != null) {
                    return items;
                }
            }
            return Collections.emptyList();
        }
    }

    private static class VariableNode extends ReadOnlyASTNode {

        public VariableNode(@Nullable final ReadOnlyASTNode parent, final int index) {
            super(parent, index);
        }

        @Override
        protected ASTNode[] getChildArray() {
            return AST_NODES;
        }

        @NotNull
        @Override
        public IElementType getElementType() {
            return AqlTypes.VARIABLE_PLACE_HOLDER;
        }

        @NotNull
        @Override
        public CharSequence getChars() {
            return "";
        }

        @Override
        public TextRange getTextRange() {
            return null;
        }

        @Override
        public PsiElement getPsi() {
            return null;
        }
    }
}
