package com.arangodb.intellij.aql.grammar.psi.impl;

import com.arangodb.intellij.aql.grammar.psi.AqlMixinType;
import com.arangodb.intellij.aql.grammar.psi.AqlNamedElementImpl;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class AqlFunctionMixin extends AqlNamedElementImpl {
    public AqlFunctionMixin(@NotNull final ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public AqlMixinType getAqlType() {
        return AqlMixinType.FUNCTION;
    }
}
