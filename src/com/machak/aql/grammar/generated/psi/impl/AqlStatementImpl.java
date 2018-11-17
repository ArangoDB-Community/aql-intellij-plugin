// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.AqlObjectExpression;
import com.machak.aql.grammar.generated.psi.AqlStatement;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.machak.aql.grammar.generated.psi.AqlTypes.*;

public class AqlStatementImpl extends ASTWrapperPsiElement implements AqlStatement {

    public AqlStatementImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitStatement(this);
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
    public AqlObjectExpression getObjectExpression() {
        return findChildByClass(AqlObjectExpression.class);
    }

    @Override
    @Nullable
    public PsiElement getFor() {
        return findChildByType(FOR);
    }

    @Override
    @Nullable
    public PsiElement getIn() {
        return findChildByType(IN);
    }

    @Override
    @Nullable
    public PsiElement getReturn() {
        return findChildByType(RETURN);
    }

    @Override
    @Nullable
    public PsiElement getId() {
        return findChildByType(ID);
    }

}
