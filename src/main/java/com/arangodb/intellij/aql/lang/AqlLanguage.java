package com.arangodb.intellij.aql.lang;

import com.arangodb.intellij.aql.util.AqlConst;
import com.intellij.lang.Language;

public class AqlLanguage extends Language {
    public static final AqlLanguage AQL_LANGUAGE = new AqlLanguage();

    protected AqlLanguage() {
        super(AqlConst.AQL_LANGUAGE_ID);
    }

}
