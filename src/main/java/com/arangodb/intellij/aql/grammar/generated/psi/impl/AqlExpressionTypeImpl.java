// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlExpressionTypeImpl extends ASTWrapperPsiElement implements AqlExpressionType {

    public AqlExpressionTypeImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitExpressionType(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof AqlVisitor) {
            accept((AqlVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @Nullable
    public AqlArrayType getArrayType() {
        return findChildByClass(AqlArrayType.class);
    }

    @Override
    @Nullable
    public AqlBooleanType getBooleanType() {
        return findChildByClass(AqlBooleanType.class);
    }

    @Override
    @Nullable
    public AqlFunctionExpression getFunctionExpression() {
        return findChildByClass(AqlFunctionExpression.class);
    }

    @Override
    @Nullable
    public AqlIntegerType getIntegerType() {
        return findChildByClass(AqlIntegerType.class);
    }

    @Override
    @Nullable
    public AqlObjectExpression getObjectExpression() {
        return findChildByClass(AqlObjectExpression.class);
    }

    @Override
    @Nullable
    public AqlParameterVariable getParameterVariable() {
        return findChildByClass(AqlParameterVariable.class);
    }

    @Override
    @Nullable
    public AqlPropertyName getPropertyName() {
        return findChildByClass(AqlPropertyName.class);
    }

    @Override
    @Nullable
    public AqlStringType getStringType() {
        return findChildByClass(AqlStringType.class);
    }

    @Override
    @Nullable
    public AqlSystemProperty getSystemProperty() {
        return findChildByClass(AqlSystemProperty.class);
    }

    @Override
    @Nullable
    public AqlVariablePlaceHolder getVariablePlaceHolder() {
        return findChildByClass(AqlVariablePlaceHolder.class);
    }

}
