

package com.arangodb.intellij.aql.editor;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.lang.parameterInfo.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

// TODO implement
public class AqlParameterInfoHandler implements ParameterInfoHandler {

    @Override
    public boolean couldShowInLookup() {
        return true;
    }

    @Nullable
    @Override
    public Object[] getParametersForLookup(LookupElement item, ParameterInfoContext context) {
        return null;
    }

    @Nullable
    @Override
    public Object findElementForParameterInfo(@NotNull final CreateParameterInfoContext context) {
        return null;
    }

    @Override
    public void showParameterInfo(@NotNull final Object element, @NotNull final CreateParameterInfoContext context) {

    }

    @Nullable
    @Override
    public Object findElementForUpdatingParameterInfo(@NotNull final UpdateParameterInfoContext context) {
        return null;
    }

    @Override
    public void updateParameterInfo(@NotNull final Object o, @NotNull final UpdateParameterInfoContext context) {

    }

    @Override
    public void updateUI(final Object p, @NotNull final ParameterInfoUIContext context) {

    }

    


}
