// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqPlaceholderVariableMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlObjectExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVariablePlaceHolder;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class AqlVariablePlaceHolderImpl extends AqPlaceholderVariableMixin implements AqlVariablePlaceHolder {

  public AqlVariablePlaceHolderImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitVariablePlaceHolder(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AqlObjectExpression getObjectExpression() {
    return findNotNullChildByClass(AqlObjectExpression.class);
  }

  public String getName() {
    return AqlPsiUtil.getName(this);
  }

  public AqlNamedElement setName(String newName) {
    return AqlPsiUtil.setName(this, newName);
  }

}
