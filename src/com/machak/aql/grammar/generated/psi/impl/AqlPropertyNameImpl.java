// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.AqlPropertyName;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;

import static com.machak.aql.grammar.generated.psi.AqlTypes.*;

public class AqlPropertyNameImpl extends ASTWrapperPsiElement implements AqlPropertyName {

    public AqlPropertyNameImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitPropertyName(this);
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
    public PsiElement getId() {
        return findNotNullChildByType(ID);
    }

}
