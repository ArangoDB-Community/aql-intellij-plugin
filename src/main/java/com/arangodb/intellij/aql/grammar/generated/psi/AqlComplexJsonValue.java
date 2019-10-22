// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.psi.PsiElement;

public interface AqlComplexJsonValue extends PsiElement {

  @Nullable
  AqlAnalyzerType getAnalyzerType();

  @Nullable
  AqlArrayRef getArrayRef();

  @Nullable
  AqlArrayType getArrayType();

  @Nullable
  AqlBooleanType getBooleanType();

  @NotNull
  List<AqlExpressionType> getExpressionTypeList();

  @Nullable
  AqlJsonType getJsonType();

  @Nullable
  AqlNamedFunctions getNamedFunctions();

  @Nullable
  AqlNamedKeywordStatements getNamedKeywordStatements();

  @Nullable
  AqlNumberType getNumberType();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlParameterVariable getParameterVariable();

  @Nullable
  AqlStringType getStringType();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

}
