// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.intellij.navigation.ItemPresentation;

public interface AqlPropertyLookup extends PsiElement {

  @Nullable
  AqlExpressionType getExpressionType();

  @Nullable
  AqlParameterVariable getParameterVariable();

  @Nullable
  AqlPropertyName getPropertyName();

  @Nullable
  AqlSystemProperty getSystemProperty();

  @Nullable
  AqlVariablePlaceHolder getVariablePlaceHolder();

  String getName();

  AqlNamedElement setName(String newName);

  ItemPresentation getPresentation();

}
