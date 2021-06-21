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

public class AqlComplexJsonValueImpl extends ASTWrapperPsiElement implements AqlComplexJsonValue {

  public AqlComplexJsonValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AqlVisitor visitor) {
    visitor.visitComplexJsonValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AqlVisitor) accept((AqlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AqlAnalyzerType getAnalyzerType() {
    return findChildByClass(AqlAnalyzerType.class);
  }

  @Override
  @Nullable
  public AqlArrayRef getArrayRef() {
    return findChildByClass(AqlArrayRef.class);
  }

  @Override
  @Nullable
  public AqlArrayType getArrayType() {
    return findChildByClass(AqlArrayType.class);
  }

  @Override
  @Nullable
  public AqlBooleanType getBooleanType() {
    return findChildByClass(AqlBooleanType.class);
  }

  @Override
  @NotNull
  public List<AqlExpressionType> getExpressionTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, AqlExpressionType.class);
  }

  @Override
  @Nullable
  public AqlJsonType getJsonType() {
    return findChildByClass(AqlJsonType.class);
  }

  @Override
  @Nullable
  public AqlNamedFunctions getNamedFunctions() {
    return findChildByClass(AqlNamedFunctions.class);
  }

  @Override
  @Nullable
  public AqlNamedKeywordStatements getNamedKeywordStatements() {
    return findChildByClass(AqlNamedKeywordStatements.class);
  }

  @Override
  @Nullable
  public AqlNumberType getNumberType() {
    return findChildByClass(AqlNumberType.class);
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

}
