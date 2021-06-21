// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

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
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlOperatorStatements getOperatorStatements();

  @NotNull
  List<AqlQueryItem> getQueryItemList();

  @Nullable
  AqlSequence getSequence();

  @Nullable
  AqlStringType getStringType();

  @Nullable
  AqlSystemProperty getSystemProperty();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

}
