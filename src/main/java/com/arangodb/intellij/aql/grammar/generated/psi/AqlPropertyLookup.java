// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import org.jetbrains.annotations.Nullable;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;

public interface AqlPropertyLookup extends PsiElement {

  @Nullable
  AqlExpressionType getExpressionType();

  @Nullable
  AqlPropertyName getPropertyName();

  @Nullable
  AqlSystemProperty getSystemProperty();

  String getName();

  AqlNamedElement setName(String newName);

  ItemPresentation getPresentation();

}
