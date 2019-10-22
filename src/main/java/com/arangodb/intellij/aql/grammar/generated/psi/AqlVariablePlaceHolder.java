// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;

public interface AqlVariablePlaceHolder extends PsiElement {

  @NotNull
  AqlObjectExpression getObjectExpression();

  String getName();

  AqlNamedElement setName(String newName);

  ItemPresentation getPresentation();

}
