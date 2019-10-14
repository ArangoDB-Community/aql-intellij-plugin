

package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunctionExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlNamedFunctions;
import com.arangodb.intellij.aql.util.JSON;
import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.lang.parameterInfo.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.text.CharArrayUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO implement
public class AqlParameterInfoHandler implements ParameterInfoHandler<AqlNamedFunctions, AqlNamedFunctions> {
    private static final Logger log = LoggerFactory.getLogger(AqlParameterInfoHandler.class);
    private AqlParams params;

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
    public void updateUI(final AqlNamedFunctions p, @NotNull final ParameterInfoUIContext context) {
        // TODO implement parameter offsets etc.
        final String functionName = p.getFunctionName();
        final List<String> params = getParameters(functionName);
        boolean isDisabled = params.isEmpty();
        int startOffset = 0;
        int endOffset = 0;
        final StringBuilder builder = new StringBuilder();
        for (String param : params) {
            builder.append(param).append(',');
            if (endOffset == 0) {
                endOffset = param.length();
            }
        }
        context.setupUIComponentPresentation(builder.toString(), startOffset, endOffset, isDisabled, false, false, context.getDefaultParameterColor());
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
}
