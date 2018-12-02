package com.arangodb.intellij.aql.grammar.custom.psi;

import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.NotNull;

public interface AqlNamedElement extends PsiNameIdentifierOwner, NavigatablePsiElement {

    @NotNull
    AqlMixinType getAqlType();
}
