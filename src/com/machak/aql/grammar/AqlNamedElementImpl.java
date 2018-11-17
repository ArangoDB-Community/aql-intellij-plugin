package com.machak.aql.grammar;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.ContributedReferenceHost;
import org.jetbrains.annotations.NotNull;

public abstract class AqlNamedElementImpl extends ASTWrapperPsiElement implements AqlNamedElement, ContributedReferenceHost {

    public AqlNamedElementImpl(@NotNull final ASTNode node) {
        super(node);
    }
}
