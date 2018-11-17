

// This is a generated file. Not intended for manual editing.
package com.machak.aql.gramamr.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.gramamr.generated.psi.Expr;
import com.machak.aql.gramamr.generated.psi.Visitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.machak.aql.gramamr.generated.GeneratedTypes.*;


public class ExprImpl extends ASTWrapperPsiElement implements Expr {

    public ExprImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull Visitor visitor) {
        visitor.visitExpr(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof Visitor) {
            accept((Visitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @Nullable
    public PsiElement getId() {
        return findChildByType(ID);
    }

}
