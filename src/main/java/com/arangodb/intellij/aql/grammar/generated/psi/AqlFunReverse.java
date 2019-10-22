// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.psi.PsiElement;

public interface AqlFunReverse extends PsiElement {

  @NotNull
  List<AqlNumberType> getNumberTypeList();

  @NotNull
  List<AqlObjectExpression> getObjectExpressionList();

  @NotNull
  List<AqlParameterVariable> getParameterVariableList();

  @NotNull
  List<AqlPropertyName> getPropertyNameList();

  @NotNull
  List<AqlQueryItem> getQueryItemList();

  @Nullable
  AqlStringType getStringType();

  @NotNull
  List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

  @Nullable
  PsiElement getFReverse();

}
