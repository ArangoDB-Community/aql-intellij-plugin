// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlQueryItem;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlStatement;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlQueryItemImpl extends ASTWrapperPsiElement implements AqlQueryItem {

  public AqlQueryItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitQueryItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlStatement getStatement() {
    return findChildByClass(AqlStatement.class);
  }

}
