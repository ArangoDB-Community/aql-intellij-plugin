// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunMatches extends PsiElement {

    @Nullable
    AqlBooleanType getBooleanType();

    @Nullable
    AqlExpressionType getExpressionType();

    @NotNull
    List<AqlJsonType> getJsonTypeList();

    @NotNull
    List<AqlObjectExpression> getObjectExpressionList();

    @NotNull
    List<AqlParameterVariable> getParameterVariableList();

    @NotNull
    List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

    @NotNull
    PsiElement getFMatches();

}
