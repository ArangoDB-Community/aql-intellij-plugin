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

public class AqlFunLengthImpl extends ASTWrapperPsiElement implements AqlFunLength {

  public AqlFunLengthImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunLength(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlJsonType getJsonType() {
    return findChildByClass(AqlJsonType.class);
  }

  @Override
  @NotNull
  public List<AqlNumberType> getNumberTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlNumberType.class);
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
  @NotNull
  public List<AqlPropertyName> getPropertyNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlPropertyName.class);
  }

  @Override
  @Nullable
  public AqlStringType getStringType() {
    return findChildByClass(AqlStringType.class);
  }

  @Override
  @NotNull
  public List<AqlTupleType> getTupleTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlTupleType.class);
  }

  @Override
  @NotNull
  public List<AqlVariablePlaceHolder> getVariablePlaceHolderList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlVariablePlaceHolder.class);
  }

  @Override
  @Nullable
  public PsiElement getFLength() {
    return findChildByType(F_LENGTH);
  }

}
