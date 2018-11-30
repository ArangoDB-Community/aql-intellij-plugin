// This is a generated file. Not intended for manual editing.
package com.arangodb.intellij.aql.grammar.generated.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface AqlFunCall extends PsiElement {

    @NotNull
    List<AqlAnyType> getAnyTypeList();

    @Nullable
    AqlStringType getStringType();

    @NotNull
    PsiElement getFCall();

}
