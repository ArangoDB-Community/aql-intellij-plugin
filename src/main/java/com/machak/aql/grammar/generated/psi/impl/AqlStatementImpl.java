// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.machak.aql.grammar.generated.psi.*;
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
      if (visitor instanceof AqlVisitor) {
          accept((AqlVisitor) visitor);
      } else {
          super.accept(visitor);
      }
  }

  @Override
  @Nullable
  public AqlComment getComment() {
    return findChildByClass(AqlComment.class);
  }

    @Override
    @Nullable
    public AqlIntegerType getIntegerType() {
        return findChildByClass(AqlIntegerType.class);
    }

    @Override
    @Nullable
    public AqlKeywordFunctions getKeywordFunctions() {
        return findChildByClass(AqlKeywordFunctions.class);
    }

  @Override
  @Nullable
  public AqlKeywordStatements getKeywordStatements() {
    return findChildByClass(AqlKeywordStatements.class);
  }

  @Override
  @Nullable
  public AqlLimitOffset getLimitOffset() {
    return findChildByClass(AqlLimitOffset.class);
  }

  @Override
  @Nullable
  public AqlObjectExpression getObjectExpression() {
    return findChildByClass(AqlObjectExpression.class);
  }

  @Override
  @Nullable
  public AqlObjectVariable getObjectVariable() {
    return findChildByClass(AqlObjectVariable.class);
  }

  @Override
  @Nullable
  public AqlOperatorStatements getOperatorStatements() {
    return findChildByClass(AqlOperatorStatements.class);
  }

  @Override
  @Nullable
  public AqlPropertyName getPropertyName() {
    return findChildByClass(AqlPropertyName.class);
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

}
