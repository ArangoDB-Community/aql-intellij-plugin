// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.psi.PsiElement;

public interface AqlFunDateTimeStamp extends PsiElement {

  @Nullable
  AqlAnyType getAnyType();

  @NotNull
  List<AqlIntegerType> getIntegerTypeList();

  @Nullable
  AqlNumberType getNumberType();

  @NotNull
  List<AqlObjectExpression> getObjectExpressionList();

  @NotNull
  List<AqlParameterVariable> getParameterVariableList();

  @Nullable
  AqlPropertyName getPropertyName();

  @NotNull
  List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

  @Nullable
  PsiElement getFDateTimestamp();

}
