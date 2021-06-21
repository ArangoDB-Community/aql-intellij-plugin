// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlFunFlatten extends PsiElement {

  @Nullable
  AqlIntegerType getIntegerType();

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
  PsiElement getFFlatten();

}
