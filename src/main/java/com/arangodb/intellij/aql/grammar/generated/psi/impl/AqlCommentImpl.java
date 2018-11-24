// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlBlockComment;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlComment;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlLineComment;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AqlCommentImpl extends ASTWrapperPsiElement implements AqlComment {

  public AqlCommentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitComment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlBlockComment getBlockComment() {
    return findChildByClass(AqlBlockComment.class);
  }

  @Override
  @Nullable
  public AqlLineComment getLineComment() {
    return findChildByClass(AqlLineComment.class);
  }

}
