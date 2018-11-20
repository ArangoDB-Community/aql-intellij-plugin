// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.machak.aql.grammar.generated.psi.AqlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.machak.aql.grammar.generated.psi.*;
import com.machak.aql.grammar.generated.AqlPsiUtil;

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
  public PsiElement getTAll() {
    return findChildByType(T_ALL);
  }

  @Override
  @Nullable
  public PsiElement getTAnd() {
    return findChildByType(T_AND);
  }

  @Override
  @Nullable
  public PsiElement getTAny() {
    return findChildByType(T_ANY);
  }

  @Override
  @Nullable
  public PsiElement getTInbound() {
    return findChildByType(T_INBOUND);
  }

  @Override
  @Nullable
  public PsiElement getTNull() {
    return findChildByType(T_NULL);
  }

  @Override
  @Nullable
  public PsiElement getTOutbound() {
    return findChildByType(T_OUTBOUND);
  }

}
