// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlExpressionType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunIpv4FromNumber;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_IPV4_FROM_NUMBER;

public class AqlFunIpv4FromNumberImpl extends ASTWrapperPsiElement implements AqlFunIpv4FromNumber {

  public AqlFunIpv4FromNumberImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunIpv4FromNumber(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlExpressionType getExpressionType() {
    return findChildByClass(AqlExpressionType.class);
  }

  @Override
  @NotNull
  public PsiElement getFIpv4FromNumber() {
    return findNotNullChildByType(F_IPV4_FROM_NUMBER);
  }

}
