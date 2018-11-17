// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.AqlPropertyKeyName;
import com.machak.aql.grammar.generated.psi.AqlPropertyName;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;

public class AqlPropertyKeyNameImpl extends ASTWrapperPsiElement implements AqlPropertyKeyName {

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
  public AqlPropertyName getPropertyName() {
    return findNotNullChildByClass(AqlPropertyName.class);
  }

}
