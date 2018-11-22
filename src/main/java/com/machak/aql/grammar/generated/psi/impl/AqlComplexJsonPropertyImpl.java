// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.machak.aql.grammar.generated.psi.AqlArrayType;
import com.machak.aql.grammar.generated.psi.AqlComplexJsonProperty;
import com.machak.aql.grammar.generated.psi.AqlExpressionType;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AqlComplexJsonPropertyImpl extends ASTWrapperPsiElement implements AqlComplexJsonProperty {

    public AqlComplexJsonPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
      visitor.visitComplexJsonProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlArrayType getArrayType() {
      return findChildByClass(AqlArrayType.class);
  }

  @Override
  @NotNull
  public List<AqlExpressionType> getExpressionTypeList() {
      return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlExpressionType.class);
  }

}
