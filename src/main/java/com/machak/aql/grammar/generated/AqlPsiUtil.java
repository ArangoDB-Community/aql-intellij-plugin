package com.machak.aql.grammar.generated;

import com.machak.aql.grammar.psi.AqlPsiNamedIdentifier;

public final class AqlPsiUtil {
    private AqlPsiUtil() {
    }

    //############################################
    // BNF used methods
    //############################################
    public static String getName(final AqlPsiNamedIdentifier element) {
        return element.getText();
    }

    public static AqlPsiNamedIdentifier setName(final AqlPsiNamedIdentifier element, final String newName) {
        element.setName(newName);
        return element;
    }

}
