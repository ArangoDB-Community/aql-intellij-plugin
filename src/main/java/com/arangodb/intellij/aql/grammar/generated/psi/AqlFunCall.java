// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlFunCall extends PsiElement {

  @NotNull
  List<AqlAnyType> getAnyTypeList();

  @Nullable
  AqlStringType getStringType();

  @NotNull
  PsiElement getFCall();

}
