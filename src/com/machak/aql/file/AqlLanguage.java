package com.machak.aql.file;

import com.intellij.lang.Language;

public class AqlLanguage extends Language {
    public static final AqlLanguage AQL_LANGUAGE = new AqlLanguage();

    protected AqlLanguage() {
        super("aql");
    }
}
