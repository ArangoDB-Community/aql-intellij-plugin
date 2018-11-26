// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlObjectExpressionMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AqlObjectExpressionImpl extends AqlObjectExpressionMixin implements AqlObjectExpression {

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
  public List<AqlPropertyLookup> getPropertyLookupList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlPropertyLookup.class);
  }

  @Override
  @NotNull
  public AqlPropertyName getPropertyName() {
    return findNotNullChildByClass(AqlPropertyName.class);
  }

    @Override
    @NotNull
    public List<AqlSystemProperty> getSystemPropertyList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlSystemProperty.class);
    }

  public String getName() {
    return AqlPsiUtil.getName(this);
  }

  public AqlNamedElement setName(String newName) {
    return AqlPsiUtil.setName(this, newName);
  }

}
