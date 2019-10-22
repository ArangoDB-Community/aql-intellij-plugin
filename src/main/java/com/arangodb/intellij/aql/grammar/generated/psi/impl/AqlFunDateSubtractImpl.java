// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi.impl;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlAnyType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlDateUnit;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlFunDateSubtract;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlIntegerType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlObjectExpression;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlParameterVariable;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlStringType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVariablePlaceHolder;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes.F_DATE_SUBTRACT;

public class AqlFunDateSubtractImpl extends ASTWrapperPsiElement implements AqlFunDateSubtract {

  public AqlFunDateSubtractImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitFunDateSubtract(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlAnyType getAnyType() {
    return findChildByClass(AqlAnyType.class);
  }

  @Override
  @Nullable
  public AqlDateUnit getDateUnit() {
    return findChildByClass(AqlDateUnit.class);
  }

  @Override
  @NotNull
  public List<AqlIntegerType> getIntegerTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlIntegerType.class);
  }

  @Override
  @Nullable
  public AqlObjectExpression getObjectExpression() {
    return findChildByClass(AqlObjectExpression.class);
  }

  @Override
  @Nullable
  public AqlParameterVariable getParameterVariable() {
    return findChildByClass(AqlParameterVariable.class);
  }

  @Override
  @Nullable
  public AqlStringType getStringType() {
    return findChildByClass(AqlStringType.class);
  }

  @Override
  @Nullable
  public AqlVariablePlaceHolder getVariablePlaceHolder() {
    return findChildByClass(AqlVariablePlaceHolder.class);
  }

  @Override
  @Nullable
  public PsiElement getFDateSubtract() {
    return findChildByType(F_DATE_SUBTRACT);
  }

}
