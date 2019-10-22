// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunLog;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlNumberType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlObjectExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlParameterVariable;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVariablePlaceHolder;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_LOG;

public class AqlFunLogImpl extends ASTWrapperPsiElement implements AqlFunLog {

  public AqlFunLogImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunLog(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlNumberType getNumberType() {
    return findChildByClass(AqlNumberType.class);
  }

  @Override
  @Nullable
  public AqlObjectExpression getObjectExpression() {
    return findChildByClass(AqlObjectExpression.class);
  }

  @Override
  @Nullable
  public AqlParameterVariable getParameterVariable() {
    return findChildByClass(AqlParameterVariable.class);
  }

  @Override
  @Nullable
  public AqlVariablePlaceHolder getVariablePlaceHolder() {
    return findChildByClass(AqlVariablePlaceHolder.class);
  }

  @Override
  @NotNull
  public PsiElement getFLog() {
    return findNotNullChildByType(F_LOG);
  }

}
