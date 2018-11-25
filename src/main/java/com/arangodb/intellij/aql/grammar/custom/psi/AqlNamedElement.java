package com.arangodb.intellij.aql.grammar.custom.psi;

import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.NotNull;

public interface AqlNamedElement extends PsiNameIdentifierOwner {

    @NotNull
    AqlMixinType getAqlType();
}
