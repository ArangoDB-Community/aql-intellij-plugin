// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

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

  @Nullable
  AqlSequence getSequence();

  @Nullable
  AqlStringType getStringType();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

}
