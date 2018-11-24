// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlBlockComment;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlBlockCommentImpl extends ASTWrapperPsiElement implements AqlBlockComment {

  public AqlBlockCommentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitBlockComment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getBComment() {
    return findNotNullChildByType(B_COMMENT);
  }

}
