// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlAnyType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunCall;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlStringType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlFunCallImpl extends ASTWrapperPsiElement implements AqlFunCall {

    public AqlFunCallImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitFunCall(this);
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
    public List<AqlAnyType> getAnyTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlAnyType.class);
    }

    @Override
    @Nullable
    public AqlStringType getStringType() {
        return findChildByClass(AqlStringType.class);
    }

    @Override
    @NotNull
    public PsiElement getFCall() {
        return findNotNullChildByType(F_CALL);
    }

}
