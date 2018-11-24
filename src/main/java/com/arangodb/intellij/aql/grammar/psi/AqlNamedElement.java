package com.arangodb.intellij.aql.grammar.psi;

import com.intellij.psi.PsiNameIdentifierOwner;
import org.jetbrains.annotations.NotNull;

public interface AqlNamedElement extends PsiNameIdentifierOwner {

    @NotNull
    AqlMixinType getAqlType();
}
