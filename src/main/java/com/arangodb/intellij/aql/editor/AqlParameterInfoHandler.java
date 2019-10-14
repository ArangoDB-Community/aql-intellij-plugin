

package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunctionExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlNamedFunctions;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.lang.parameterInfo.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.text.CharArrayUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO implement
public class AqlParameterInfoHandler implements ParameterInfoHandler<AqlNamedFunctions, AqlNamedFunctions> {


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
        // TODO implement parameter lookups
        boolean isDisabled = false;// context.getCurrentParameterIndex()
        context.setupUIComponentPresentation("TEST", 1, 1, isDisabled, false, false, context.getDefaultParameterColor());
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

}
