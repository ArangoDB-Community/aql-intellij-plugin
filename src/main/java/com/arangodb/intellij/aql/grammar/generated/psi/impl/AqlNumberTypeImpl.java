// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlNumberTypeImpl extends ASTWrapperPsiElement implements AqlNumberType {

  public AqlNumberTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitNumberType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlAnyNumber getAnyNumber() {
    return findChildByClass(AqlAnyNumber.class);
  }

  @Override
  @Nullable
  public AqlIntegerType getIntegerType() {
    return findChildByClass(AqlIntegerType.class);
  }

  @Override
  @Nullable
  public AqlSignedInteger getSignedInteger() {
    return findChildByClass(AqlSignedInteger.class);
  }

}
