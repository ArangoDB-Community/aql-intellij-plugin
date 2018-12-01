// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface AqlObjectExpression extends PsiElement {

  @NotNull
  List<AqlPropertyLookup> getPropertyLookupList();

  @NotNull
  AqlPropertyName getPropertyName();

  String getName();

  AqlNamedElement setName(String newName);

}
