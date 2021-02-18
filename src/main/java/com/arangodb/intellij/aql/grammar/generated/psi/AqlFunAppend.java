// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlFunAppend extends PsiElement {

  @Nullable
  AqlBooleanType getBooleanType();

  @Nullable
  AqlExpressionType getExpressionType();

  @Nullable
  AqlJsonType getJsonType();

  @Nullable
  AqlNumberType getNumberType();

  @NotNull
  List<AqlObjectExpression> getObjectExpressionList();

  @NotNull
  List<AqlParameterVariable> getParameterVariableList();

  @Nullable
  AqlPropertyName getPropertyName();

  @NotNull
  List<AqlQueryItem> getQueryItemList();

  @NotNull
  List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

  @NotNull
  PsiElement getFAppend();

}
