// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface AqlExpressionType extends PsiElement {

    @Nullable
    AqlArrayType getArrayType();

    @Nullable
    AqlBooleanType getBooleanType();

    @Nullable
    AqlFunctionExpression getFunctionExpression();

    @Nullable
    AqlIntegerType getIntegerType();

    @Nullable
    AqlObjectExpression getObjectExpression();

    @Nullable
    AqlParameterVariable getParameterVariable();

    @Nullable
    AqlPropertyName getPropertyName();

    @Nullable
    AqlStringType getStringType();

    @Nullable
    AqlSystemProperty getSystemProperty();

    @Nullable
    AqlVariablePlaceHolder getVariablePlaceHolder();

}
