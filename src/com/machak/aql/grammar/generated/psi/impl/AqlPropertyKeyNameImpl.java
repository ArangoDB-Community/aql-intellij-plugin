// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.AqlNamedElementImpl;
import com.machak.aql.grammar.generated.psi.AqlPropertyKeyName;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;

import static com.machak.aql.grammar.generated.psi.AqlTypes.*;

public class AqlPropertyKeyNameImpl extends AqlNamedElementImpl implements AqlPropertyKeyName {

    public AqlPropertyKeyNameImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull AqlVisitor visitor) {
        visitor.visitPropertyKeyName(this);
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
