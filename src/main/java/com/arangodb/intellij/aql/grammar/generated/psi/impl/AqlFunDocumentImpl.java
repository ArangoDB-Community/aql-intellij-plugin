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

public class AqlFunDocumentImpl extends ASTWrapperPsiElement implements AqlFunDocument {

    public AqlFunDocumentImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitFunDocument(this);
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
    public AqlArrayRef getArrayRef() {
        return findChildByClass(AqlArrayRef.class);
    }

    @Override
    @Nullable
    public AqlArrayType getArrayType() {
        return findChildByClass(AqlArrayType.class);
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
    @NotNull
    public List<AqlStringType> getStringTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlStringType.class);
    }

    @Override
    @Nullable
    public AqlVariablePlaceHolder getVariablePlaceHolder() {
        return findChildByClass(AqlVariablePlaceHolder.class);
    }

    @Override
    @Nullable
    public PsiElement getFDocument() {
        return findChildByType(F_DOCUMENT);
    }

}
