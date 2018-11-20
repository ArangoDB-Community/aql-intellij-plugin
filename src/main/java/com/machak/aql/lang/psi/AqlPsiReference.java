package com.machak.aql.lang.psi;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.ResolveResult;
import com.intellij.util.IncorrectOperationException;
import com.machak.aql.grammar.psi.AqlPsiNamedIdentifier;

public abstract class AqlPsiReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {


    public AqlPsiReference(final PsiElement element, final TextRange rangeInElement) {
        super(element, rangeInElement);
    }

    @NotNull
    @Override
    public abstract ResolveResult[] multiResolve(boolean incompleteCode);

    @Nullable
    @Override
    public PsiElement resolve() {
        final ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length > 0 ? resolveResults[0].getElement() : null;
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        ((PsiNamedElement) myElement).setName(newElementName);
        return myElement;
    }

    @NotNull
    @Override
    public abstract Object[] getVariants();


}
