// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface AqlStatement extends PsiElement {

    @Nullable
    AqlArrayType getArrayType();

    @Nullable
    AqlBooleanType getBooleanType();

  @Nullable
  AqlComment getComment();

  @Nullable
  AqlExpressionType getExpressionType();

    @Nullable
    AqlFunAbs getFunAbs();

    @Nullable
    AqlFunConcatSeparator getFunConcatSeparator();

    @Nullable
    AqlFunctionExpression getFunctionExpression();

  @Nullable
  AqlIntegerType getIntegerType();

  @Nullable
  AqlJsonType getJsonType();

    @Nullable
    AqlNamedKeywordStatements getNamedKeywordStatements();

  @Nullable
  AqlOperatorStatements getOperatorStatements();

  @Nullable
  AqlSequence getSequence();

  @Nullable
  AqlStringType getStringType();

    @Nullable
    AqlVariablePlaceHolder getVariablePlaceHolder();

}
