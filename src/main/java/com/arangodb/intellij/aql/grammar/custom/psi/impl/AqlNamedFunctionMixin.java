package com.arangodb.intellij.aql.grammar.custom.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlMixinType;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElementImpl;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class AqlNamedFunctionMixin extends AqlNamedElementImpl {
    public AqlNamedFunctionMixin(@NotNull final ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public AqlMixinType getAqlType() {
        return AqlMixinType.FUNCTION;
    }
}

