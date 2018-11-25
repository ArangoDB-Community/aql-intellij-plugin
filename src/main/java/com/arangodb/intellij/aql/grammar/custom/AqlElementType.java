package com.arangodb.intellij.aql.grammar.custom;

import com.arangodb.intellij.aql.lang.AqlLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class AqlElementType extends IElementType {

    private final String name;


    public AqlElementType(@NotNull @NonNls String name) {
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