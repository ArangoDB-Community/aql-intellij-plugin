// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunValues extends PsiElement {

  @Nullable
  AqlArrayType getArrayType();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlParameterVariable getParameterVariable();

  @NotNull
  List<AqlStringType> getStringTypeList();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

  @Nullable
  PsiElement getFValues();

}
