// This is a generated file. Not intended for manual editing.
package com.machak.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface AqlStatement extends PsiElement {

  @Nullable
  AqlComment getComment();

    @Nullable
    AqlIntegerType getIntegerType();

    @Nullable
    AqlKeywordFunctions getKeywordFunctions();

  @Nullable
  AqlKeywordStatements getKeywordStatements();

  @Nullable
  AqlLimitOffset getLimitOffset();

  @Nullable
  AqlObjectExpression getObjectExpression();

  @Nullable
  AqlObjectVariable getObjectVariable();

  @Nullable
  AqlOperatorStatements getOperatorStatements();

  @Nullable
  AqlPropertyName getPropertyName();

  @Nullable
  AqlSequence getSequence();

  @Nullable
  AqlStringType getStringType();

}
