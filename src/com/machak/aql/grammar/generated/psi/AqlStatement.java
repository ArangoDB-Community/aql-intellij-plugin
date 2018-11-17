// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface AqlStatement extends PsiElement {

  @Nullable
  AqlComment getComment();

  @Nullable
  AqlKeywordStatements getKeywordStatements();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlPropertyName getPropertyName();

  @Nullable
  AqlSequence getSequence();

}
