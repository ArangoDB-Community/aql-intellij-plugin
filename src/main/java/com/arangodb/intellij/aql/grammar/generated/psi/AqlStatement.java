// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlStatement extends PsiElement {

  @Nullable
  AqlAnalyzerType getAnalyzerType();

  @Nullable
  AqlArrayType getArrayType();

  @Nullable
  AqlBooleanType getBooleanType();

  @Nullable
  AqlComment getComment();

  @Nullable
  AqlExpressionType getExpressionType();

  @Nullable
  AqlFunctionExpression getFunctionExpression();

  @Nullable
  AqlJsonType getJsonType();

  @Nullable
  AqlNamedKeywordStatements getNamedKeywordStatements();

  @Nullable
  AqlNumberType getNumberType();

  @Nullable
  AqlOperatorStatements getOperatorStatements();

  @NotNull
  List<AqlQueryItem> getQueryItemList();

  @Nullable
  AqlSequence getSequence();

  @Nullable
  AqlStringType getStringType();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

}
