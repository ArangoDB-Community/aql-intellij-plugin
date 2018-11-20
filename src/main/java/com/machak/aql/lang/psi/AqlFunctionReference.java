package com.machak.aql.lang.psi;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveResult;
import com.machak.aql.lang.AqlPsiReferenceContributor;

public class AqlFunctionReference extends AqlPsiReference {


    public AqlFunctionReference(final PsiElement element, final TextRange rangeInElement) {
        super(element, rangeInElement);
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(final boolean incompleteCode) {
        return new ResolveResult[0];
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }
}
