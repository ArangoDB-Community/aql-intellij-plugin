// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.AqlOperatorStatements;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;

public class AqlOperatorStatementsImpl extends ASTWrapperPsiElement implements AqlOperatorStatements {

    public AqlOperatorStatementsImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitOperatorStatements(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof AqlVisitor) {
            accept((AqlVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

}
