// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunPi;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_PI;

public class AqlFunPiImpl extends ASTWrapperPsiElement implements AqlFunPi {

  public AqlFunPiImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunPi(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getFPi() {
    return findNotNullChildByType(F_PI);
  }

}
