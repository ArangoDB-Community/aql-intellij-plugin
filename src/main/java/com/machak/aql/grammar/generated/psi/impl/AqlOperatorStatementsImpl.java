// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.AqlOperatorStatements;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.machak.aql.grammar.generated.psi.AqlTypes.*;

public class AqlOperatorStatementsImpl extends ASTWrapperPsiElement implements AqlOperatorStatements {

  public AqlOperatorStatementsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitOperatorStatements(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getTAnd() {
    return findChildByType(T_AND);
  }

  @Override
  @Nullable
  public PsiElement getTNull() {
    return findChildByType(T_NULL);
  }

}
