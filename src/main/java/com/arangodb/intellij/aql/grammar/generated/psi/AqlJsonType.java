// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlJsonType extends PsiElement {

    @NotNull
    List<AqlArrayType> getArrayTypeList();

    @Nullable
    AqlComplexJsonProperty getComplexJsonProperty();

    @NotNull
    List<AqlExpressionType> getExpressionTypeList();

    @NotNull
    List<AqlNamedKeywordStatements> getNamedKeywordStatementsList();

    @NotNull
    List<AqlObjectExpression> getObjectExpressionList();

}
