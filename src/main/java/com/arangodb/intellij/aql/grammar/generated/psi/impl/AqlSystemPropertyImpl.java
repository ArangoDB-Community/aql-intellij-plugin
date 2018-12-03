// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlSystemPropertyMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlSystemProperty;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlSystemPropertyImpl extends AqlSystemPropertyMixin implements AqlSystemProperty {

  public AqlSystemPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitSystemProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getFAttributes() {
    return findChildByType(F_ATTRIBUTES);
  }

  public String getName() {
    return AqlPsiUtil.getName(this);
  }

  public AqlNamedElement setName(String newName) {
    return AqlPsiUtil.setName(this, newName);
  }

  public ItemPresentation getPresentation() {
    return AqlPsiUtil.getPresentation(this);
  }

}
