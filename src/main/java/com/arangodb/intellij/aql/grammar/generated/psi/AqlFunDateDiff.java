// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunDateDiff extends PsiElement {

  @NotNull
  List<AqlAnyType> getAnyTypeList();

  @Nullable
  AqlBooleanType getBooleanType();

  @Nullable
  AqlDateUnit getDateUnit();

  @NotNull
  List<AqlIntegerType> getIntegerTypeList();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlParameterVariable getParameterVariable();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

  @NotNull
  PsiElement getFDateDiff();

}
