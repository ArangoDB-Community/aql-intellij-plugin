// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlIdMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.navigation.ItemPresentation;

public class AqlPropertyNameImpl extends AqlIdMixin implements AqlPropertyName {

  public AqlPropertyNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitPropertyName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

  @Override
  public String getName() {
    return AqlPsiUtil.getName(this);
  }

  @Override
  public AqlNamedElement setName(String newName) {
    return AqlPsiUtil.setName(this, newName);
  }

  @Override
  public ItemPresentation getPresentation() {
    return AqlPsiUtil.getPresentation(this);
  }

}
