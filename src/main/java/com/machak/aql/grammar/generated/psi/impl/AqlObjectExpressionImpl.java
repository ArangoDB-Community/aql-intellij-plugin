// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.machak.aql.grammar.generated.psi.AqlObjectExpression;
import com.machak.aql.grammar.generated.psi.AqlPropertyName;
import com.machak.aql.grammar.generated.psi.AqlSystemProperty;
import com.machak.aql.grammar.generated.psi.AqlVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AqlObjectExpressionImpl extends ASTWrapperPsiElement implements AqlObjectExpression {

  public AqlObjectExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitObjectExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<AqlPropertyName> getPropertyNameList() {
      return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlPropertyName.class);
  }

    @Override
    @NotNull
    public List<AqlSystemProperty> getSystemPropertyList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlSystemProperty.class);
  }

}
