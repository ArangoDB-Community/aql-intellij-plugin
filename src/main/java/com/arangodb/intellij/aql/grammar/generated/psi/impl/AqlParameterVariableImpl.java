// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;
import com.arangodb.intellij.aql.grammar.custom.psi.impl.AqParameterVariableMixin;
import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlPsiUtil;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.navigation.ItemPresentation;

public class AqlParameterVariableImpl extends AqParameterVariableMixin implements AqlParameterVariable {

  public AqlParameterVariableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitParameterVariable(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AqlPropertyName getPropertyName() {
    return findNotNullChildByClass(AqlPropertyName.class);
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
