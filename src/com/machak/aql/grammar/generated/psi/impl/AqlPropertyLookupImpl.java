// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.AqlPropertyLookup;
import com.machak.aql.grammar.generated.psi.AqlPropertyName;
import com.machak.aql.grammar.generated.psi.AqlSystemProperty;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlPropertyLookupImpl extends ASTWrapperPsiElement implements AqlPropertyLookup {

  public AqlPropertyLookupImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitPropertyLookup(this);
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
  public AqlPropertyName getPropertyName() {
      return findChildByClass(AqlPropertyName.class);
  }

    @Override
    @Nullable
    public AqlSystemProperty getSystemProperty() {
        return findChildByClass(AqlSystemProperty.class);
  }

}
