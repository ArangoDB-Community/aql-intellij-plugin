// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlFunAvgImpl extends ASTWrapperPsiElement implements AqlFunAvg {

    public AqlFunAvgImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitFunAvg(this);
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
    public List<AqlNumberType> getNumberTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlNumberType.class);
    }

    @Override
    @NotNull
    public List<AqlObjectExpression> getObjectExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlObjectExpression.class);
    }

    @Override
    @NotNull
    public List<AqlParameterVariable> getParameterVariableList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlParameterVariable.class);
    }

    @Override
    @NotNull
    public List<AqlVariablePlaceHolder> getVariablePlaceHolderList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlVariablePlaceHolder.class);
    }

    @Override
    @NotNull
    public PsiElement getFAvg() {
        return findNotNullChildByType(F_AVG);
    }

}