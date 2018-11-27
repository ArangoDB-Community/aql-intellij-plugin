// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlArrayRef;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlExpressionType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlObjectExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class AqlArrayRefImpl extends ASTWrapperPsiElement implements AqlArrayRef {

    public AqlArrayRefImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitArrayRef(this);
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
    public AqlExpressionType getExpressionType() {
        return findNotNullChildByClass(AqlExpressionType.class);
    }

    @Override
    @NotNull
    public AqlObjectExpression getObjectExpression() {
        return findNotNullChildByClass(AqlObjectExpression.class);
    }

}
