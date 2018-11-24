// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AqlJsonTypeImpl extends ASTWrapperPsiElement implements AqlJsonType {

    public AqlJsonTypeImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitJsonType(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof AqlVisitor) {
            accept((AqlVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @NotNull
    public List<AqlArrayType> getArrayTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlArrayType.class);
    }

    @Override
    @Nullable
    public AqlComplexJsonProperty getComplexJsonProperty() {
        return findChildByClass(AqlComplexJsonProperty.class);
    }

    @Override
    @NotNull
    public List<AqlExpressionType> getExpressionTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlExpressionType.class);
    }

    @Override
    @NotNull
    public List<AqlNamedKeywordStatements> getNamedKeywordStatementsList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlNamedKeywordStatements.class);
    }

    @Override
    @NotNull
    public List<AqlObjectExpression> getObjectExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlObjectExpression.class);
    }

}
