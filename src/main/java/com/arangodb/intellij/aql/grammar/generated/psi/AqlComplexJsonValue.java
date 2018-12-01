// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

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
