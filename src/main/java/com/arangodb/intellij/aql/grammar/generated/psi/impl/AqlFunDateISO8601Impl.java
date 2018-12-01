// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlFunDateISO8601Impl extends ASTWrapperPsiElement implements AqlFunDateISO8601 {

    public AqlFunDateISO8601Impl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitFunDateISO8601(this);
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
    public List<AqlIntegerType> getIntegerTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlIntegerType.class);
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
    @NotNull
    public List<AqlVariablePlaceHolder> getVariablePlaceHolderList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlVariablePlaceHolder.class);
    }

    @Override
    @Nullable
    public PsiElement getFDateIso8601() {
        return findChildByType(F_DATE_ISO8601);
    }

}
