// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlStatementImpl extends ASTWrapperPsiElement implements AqlStatement {

  public AqlStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

    @Override
    @Nullable
    public AqlAnalyzerType getAnalyzerType() {
        return findChildByClass(AqlAnalyzerType.class);
    }

  @Override
  @Nullable
  public AqlArrayType getArrayType() {
      return findChildByClass(AqlArrayType.class);
  }

  @Override
  @Nullable
  public AqlBooleanType getBooleanType() {
      return findChildByClass(AqlBooleanType.class);
  }

  @Override
  @Nullable
  public AqlComment getComment() {
      return findChildByClass(AqlComment.class);
  }

  @Override
  @Nullable
  public AqlExpressionType getExpressionType() {
      return findChildByClass(AqlExpressionType.class);
  }

  @Override
  @Nullable
  public AqlJsonType getJsonType() {
      return findChildByClass(AqlJsonType.class);
  }

  @Override
  @Nullable
  public AqlNamedKeywordStatements getNamedKeywordStatements() {
      return findChildByClass(AqlNamedKeywordStatements.class);
  }

    @Override
    @Nullable
    public AqlNumberType getNumberType() {
        return findChildByClass(AqlNumberType.class);
    }

  @Override
  @Nullable
  public AqlOperatorStatements getOperatorStatements() {
    return findChildByClass(AqlOperatorStatements.class);
  }

  @Override
  @Nullable
  public AqlSequence getSequence() {
    return findChildByClass(AqlSequence.class);
  }

  @Override
  @Nullable
  public AqlStringType getStringType() {
    return findChildByClass(AqlStringType.class);
  }

    @Override
    @Nullable
    public AqlVariablePlaceHolder getVariablePlaceHolder() {
        return findChildByClass(AqlVariablePlaceHolder.class);
    }

}
