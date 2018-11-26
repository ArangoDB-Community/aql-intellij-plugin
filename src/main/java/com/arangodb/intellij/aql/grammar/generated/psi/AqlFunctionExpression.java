// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunctionExpression extends PsiElement {

    @NotNull
    List<AqlExpressionType> getExpressionTypeList();

    @Nullable
    AqlNamedFunctions getNamedFunctions();

    @Nullable
    AqlNamedKeywordFunctions getNamedKeywordFunctions();

}
