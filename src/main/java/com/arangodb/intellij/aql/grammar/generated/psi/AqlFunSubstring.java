// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunSubstring extends PsiElement {

    @NotNull
    List<AqlIntegerType> getIntegerTypeList();

    @NotNull
    List<AqlObjectExpression> getObjectExpressionList();

    @NotNull
    List<AqlParameterVariable> getParameterVariableList();

    @Nullable
    AqlStringType getStringType();

    @NotNull
    List<AqlVariablePlaceHolder> getVariablePlaceHolderList();

    @NotNull
    PsiElement getFSubstring();

}
