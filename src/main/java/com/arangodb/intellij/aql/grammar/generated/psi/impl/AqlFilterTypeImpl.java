// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;

public class AqlFilterTypeImpl extends ASTWrapperPsiElement implements AqlFilterType {

  public AqlFilterTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFilterType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlExpressionType> getExpressionTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlExpressionType.class);
  }

  @Override
  @NotNull
  public PsiElement getTFilter() {
    return findNotNullChildByType(T_FILTER);
  }

}
