package com.machak.aql.grammar.psi;

import org.jetbrains.annotations.NotNull;

import com.intellij.psi.PsiNameIdentifierOwner;

public interface AqlPsiNamedIdentifier extends PsiNameIdentifierOwner {
    AqlPsiNamedIdentifier setName(@NotNull String newName);
}
