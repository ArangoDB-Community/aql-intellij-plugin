// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqlPropertyLookupMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.navigation.ItemPresentation;

public class AqlPropertyLookupImpl extends AqlPropertyLookupMixin implements AqlPropertyLookup {

  public AqlPropertyLookupImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitPropertyLookup(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlExpressionType getExpressionType() {
    return findChildByClass(AqlExpressionType.class);
  }

  @Override
  @Nullable
  public AqlPropertyName getPropertyName() {
    return findChildByClass(AqlPropertyName.class);
  }

  @Override
  @Nullable
  public AqlSystemProperty getSystemProperty() {
    return findChildByClass(AqlSystemProperty.class);
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
