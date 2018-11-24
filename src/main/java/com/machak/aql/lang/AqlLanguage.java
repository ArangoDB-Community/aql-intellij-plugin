package com.machak.aql.lang;

import com.intellij.lang.Language;
import com.machak.aql.util.AqlConst;

public class AqlLanguage extends Language {
    public static final AqlLanguage AQL_LANGUAGE = new AqlLanguage();

    protected AqlLanguage() {
        super(AqlConst.AQL_LANGUAGE_ID);
    }

}
