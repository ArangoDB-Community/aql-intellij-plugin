package com.machak.aql.grammar;

import com.intellij.psi.tree.IElementType;
import com.machak.aql.lang.AqlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class AqlTokenType extends IElementType {

    private final String name;


    public AqlTokenType(@NotNull @NonNls String name) {
        super(name, AqlLanguage.AQL_LANGUAGE);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}