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

public class AqlLineCommentImpl extends ASTWrapperPsiElement implements AqlLineComment {

  public AqlLineCommentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitLineComment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getLComment() {
    return findNotNullChildByType(L_COMMENT);
  }

}
