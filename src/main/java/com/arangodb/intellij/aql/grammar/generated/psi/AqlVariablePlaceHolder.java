// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.arangodb.intellij.aql.grammar.psi.AqlNamedElement;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface AqlVariablePlaceHolder extends PsiElement {

    @NotNull
    AqlObjectExpression getObjectExpression();

    String getName();

    AqlNamedElement setName(String newName);

}