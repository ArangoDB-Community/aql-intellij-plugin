package com.machak.aql.lang;

import com.intellij.lang.Language;

public class AqlLanguage extends Language {
    public static final AqlLanguage AQL_LANGUAGE = new AqlLanguage();
    public static final String ID = "aql";

    protected AqlLanguage() {
        super(ID);
    }
}
