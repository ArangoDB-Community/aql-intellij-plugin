// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.AqlPsiUtil;
import com.machak.aql.grammar.generated.psi.AqlKeywordStatements;
import com.machak.aql.grammar.generated.psi.AqlNamedKeywordStatements;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import com.machak.aql.grammar.psi.AqlNamedElement;
import com.machak.aql.grammar.psi.impl.AqlKeywordMixin;
import org.jetbrains.annotations.NotNull;

public class AqlNamedKeywordStatementsImpl extends AqlKeywordMixin implements AqlNamedKeywordStatements {

    public AqlNamedKeywordStatementsImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitNamedKeywordStatements(this);
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
    public AqlKeywordStatements getKeywordStatements() {
        return findNotNullChildByClass(AqlKeywordStatements.class);
    }

    public String getName() {
        return AqlPsiUtil.getName(this);
    }

    public AqlNamedElement setName(String newName) {
        return AqlPsiUtil.setName(this, newName);
    }

}
