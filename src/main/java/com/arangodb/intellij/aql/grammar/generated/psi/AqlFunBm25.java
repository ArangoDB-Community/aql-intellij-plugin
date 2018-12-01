// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunBm25 extends PsiElement {

    @Nullable
    AqlBooleanType getBooleanType();

    @Nullable
    AqlJsonType getJsonType();

    @Nullable
    AqlNumberType getNumberType();

    @NotNull
    List<AqlObjectExpression> getObjectExpressionList();

    @NotNull
    List<AqlParameterVariable> getParameterVariableList();

    @Nullable
    AqlPropertyName getPropertyName();

    @NotNull
    List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

    @NotNull
    PsiElement getFBm25();

}
