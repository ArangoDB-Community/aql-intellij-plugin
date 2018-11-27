// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunRemoveValue extends PsiElement {

    @Nullable
    AqlExpressionType getExpressionType();

    @Nullable
    AqlIntegerType getIntegerType();

    @NotNull
    List<AqlNumberType> getNumberTypeList();

    @NotNull
    List<AqlObjectExpression> getObjectExpressionList();

    @NotNull
    List<AqlParameterVariable> getParameterVariableList();

    @NotNull
    List<AqlPropertyName> getPropertyNameList();

    @NotNull
    List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

    @NotNull
    PsiElement getFRemoveValue();

}
