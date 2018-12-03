// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.*;

public class AqlFunPositionImpl extends ASTWrapperPsiElement implements AqlFunPosition {

  public AqlFunPositionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunPosition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlBooleanType getBooleanType() {
    return findChildByClass(AqlBooleanType.class);
  }

  @Override
  @Nullable
  public AqlExpressionType getExpressionType() {
    return findChildByClass(AqlExpressionType.class);
  }

  @Override
  @Nullable
  public AqlJsonType getJsonType() {
    return findChildByClass(AqlJsonType.class);
  }

  @Override
  @Nullable
  public AqlNumberType getNumberType() {
    return findChildByClass(AqlNumberType.class);
  }

  @Override
  @NotNull
  public List<AqlObjectExpression> getObjectExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlObjectExpression.class);
  }

  @Override
  @NotNull
  public List<AqlParameterVariable> getParameterVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlParameterVariable.class);
  }

  @Override
  @Nullable
  public AqlPropertyName getPropertyName() {
    return findChildByClass(AqlPropertyName.class);
  }

  @Override
  @NotNull
  public List<AqlQueryItem> getQueryItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlQueryItem.class);
  }

  @Override
  @NotNull
  public List<AqlVariablePlaceHolder> getVariablePlaceHolderList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlVariablePlaceHolder.class);
  }

  @Override
  @NotNull
  public PsiElement getFPosition() {
    return findNotNullChildByType(F_POSITION);
  }

}
