// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlIntegerType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.NUMBER_INTEGER;

public class AqlIntegerTypeImpl extends ASTWrapperPsiElement implements AqlIntegerType {

  public AqlIntegerTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitIntegerType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getNumberInteger() {
    return findNotNullChildByType(NUMBER_INTEGER);
  }

}
