package com.machak.aql.grammar.psi.impl;

import org.jetbrains.annotations.NotNull;

import com.intellij.lang.ASTNode;
import com.machak.aql.grammar.psi.AqlFunction;
import com.machak.aql.grammar.psi.AqlPsiNamedIdentifierImpl;

public abstract class AqlFunctionMixin extends AqlPsiNamedIdentifierImpl {
    public AqlFunctionMixin(@NotNull final ASTNode node) {
        super(node);
    }
    
}
