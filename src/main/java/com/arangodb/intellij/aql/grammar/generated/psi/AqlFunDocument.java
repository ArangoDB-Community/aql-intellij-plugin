// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlFunDocument extends PsiElement {

  @Nullable
  AqlArrayRef getArrayRef();

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
  PsiElement getFDocument();

}
