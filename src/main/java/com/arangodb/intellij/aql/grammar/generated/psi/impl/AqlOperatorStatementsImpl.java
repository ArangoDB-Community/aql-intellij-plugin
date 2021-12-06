// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlOperatorStatements;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.T_AND;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.T_EQ;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.T_LOGICAL_AND;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.T_OR;

public class AqlOperatorStatementsImpl extends ASTWrapperPsiElement implements AqlOperatorStatements {

  public AqlOperatorStatementsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitOperatorStatements(this);
  }

  @Override
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
  public PsiElement getTEq() {
    return findChildByType(T_EQ);
  }

  @Override
  @Nullable
  public PsiElement getTLogicalAnd() {
    return findChildByType(T_LOGICAL_AND);
  }

  @Override
  @Nullable
  public PsiElement getTOr() {
    return findChildByType(T_OR);
  }

}
