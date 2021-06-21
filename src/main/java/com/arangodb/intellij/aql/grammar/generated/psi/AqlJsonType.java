// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface AqlJsonType extends PsiElement {

  @NotNull
  List<AqlAnyType> getAnyTypeList();

  @NotNull
  List<AqlArrayRef> getArrayRefList();

  @NotNull
  List<AqlObjectExpression> getObjectExpressionList();

  @NotNull
  List<AqlParameterVariable> getParameterVariableList();

  @NotNull
  List<AqlStringType> getStringTypeList();

  @NotNull
  List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

}
