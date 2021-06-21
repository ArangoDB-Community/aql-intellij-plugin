// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlFunPhrase extends PsiElement {

  @Nullable
  AqlNumberType getNumberType();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlParameterVariable getParameterVariable();

  @Nullable
  AqlPropertyLookup getPropertyLookup();

  @NotNull
  List<AqlPropertyName> getPropertyNameList();

  @NotNull
  List<AqlQueryItem> getQueryItemList();

  @NotNull
  List<AqlStringType> getStringTypeList();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

  @Nullable
  PsiElement getFPhrase();

}
