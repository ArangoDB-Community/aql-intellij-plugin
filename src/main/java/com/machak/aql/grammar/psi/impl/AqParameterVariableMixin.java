package com.machak.aql.grammar.psi.impl;

import com.intellij.lang.ASTNode;
import com.machak.aql.grammar.psi.AqlMixinType;
import com.machak.aql.grammar.psi.AqlNamedElementImpl;
import org.jetbrains.annotations.NotNull;

public abstract class AqParameterVariableMixin extends AqlNamedElementImpl {
    public AqParameterVariableMixin(@NotNull final ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public AqlMixinType getAqlType() {
        return AqlMixinType.VAR_PARAMETER;
    }
}
