// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlFunLength extends PsiElement {

  @Nullable
  AqlJsonType getJsonType();

  @NotNull
  List<AqlNumberType> getNumberTypeList();

  @NotNull
  List<AqlObjectExpression> getObjectExpressionList();

  @NotNull
  List<AqlParameterVariable> getParameterVariableList();

  @NotNull
  List<AqlPropertyName> getPropertyNameList();

  @Nullable
  AqlStringType getStringType();

  @NotNull
  List<AqlTupleType> getTupleTypeList();

  @NotNull
  List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

  @Nullable
  PsiElement getFLength();

}
