// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlReturnType extends PsiElement {

  @NotNull
  List<AqlExpressionType> getExpressionTypeList();

  @Nullable
  AqlJsonType getJsonType();

  @NotNull
  PsiElement getTReturn();

}
