package com.machak.aql.grammar.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.ContributedReferenceHost;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;
import com.intellij.psi.util.PsiUtil;
import com.intellij.util.IncorrectOperationException;

public abstract class AqlPsiNamedIdentifierImpl extends ASTWrapperPsiElement implements ContributedReferenceHost, AqlPsiNamedIdentifier {
    public AqlPsiNamedIdentifierImpl(@NotNull final ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public PsiReference[] getReferences() {
        return ReferenceProvidersRegistry.getReferencesFromProviders(this);
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return this;
    }

   
}
