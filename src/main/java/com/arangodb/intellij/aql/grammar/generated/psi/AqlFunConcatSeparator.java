// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.psi.PsiElement;

public interface AqlFunConcatSeparator extends PsiElement {

  @NotNull
  List<AqlExpressionType> getExpressionTypeList();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlParameterVariable getParameterVariable();

  @Nullable
  AqlStringType getStringType();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

  @NotNull
  PsiElement getFConcatSeparator();

}
