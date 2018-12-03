// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunMax extends PsiElement {

  @Nullable
  AqlNumberType getNumberType();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlParameterVariable getParameterVariable();

  @Nullable
  AqlPropertyName getPropertyName();

  @NotNull
  List<AqlQueryItem> getQueryItemList();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

  @NotNull
  PsiElement getFMax();

}
