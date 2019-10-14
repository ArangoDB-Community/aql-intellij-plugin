

package com.arangodb.intellij.aql.editor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunctionExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlNamedFunctions;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.lang.parameterInfo.CreateParameterInfoContext;
import com.intellij.lang.parameterInfo.ParameterInfoContext;
import com.intellij.lang.parameterInfo.ParameterInfoHandler;
import com.intellij.lang.parameterInfo.ParameterInfoUIContext;
import com.intellij.lang.parameterInfo.UpdateParameterInfoContext;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiExpression;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;

// TODO implement
public class AqlParameterInfoHandler implements ParameterInfoHandler<AqlNamedFunctions, PsiExpression> {


    @Nullable
    @Override
    public AqlNamedFunctions findElementForParameterInfo(@NotNull final CreateParameterInfoContext context) {
        final PsiFile file = context.getFile();
        final int offset = context.getOffset();
        PsiElement element = file.findElementAt(offset);
        final AqlFunctionExpression expr = PsiTreeUtil.getParentOfType(element, AqlFunctionExpression.class);
        if (expr != null) {
            return expr.getNamedFunctions();
        }

        return null;

    }

    @Override
    public void showParameterInfo(@NotNull final AqlNamedFunctions element, @NotNull final CreateParameterInfoContext context) {
        int offset = element.getTextRange().getStartOffset();
        context.showHint(element, offset, this);
    }

    @Nullable
    @Override
    public AqlNamedFunctions findElementForUpdatingParameterInfo(@NotNull final UpdateParameterInfoContext context) {
        return null;
    }

    @Override
    public void updateParameterInfo(@NotNull final AqlNamedFunctions aqlNamedFunctions, @NotNull final UpdateParameterInfoContext context) {
    }

    @Override
    public void updateUI(final PsiExpression p, @NotNull final ParameterInfoUIContext context) {
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
