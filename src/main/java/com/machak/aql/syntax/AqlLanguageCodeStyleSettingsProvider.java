package com.machak.aql.syntax;

import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import com.machak.aql.lang.AqlLanguage;
import org.jetbrains.annotations.NotNull;

public class AqlLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {
    @NotNull
    @Override
    public Language getLanguage() {
        return AqlLanguage.AQL_LANGUAGE;
    }

    @Override
    public String getCodeSample(@NotNull final SettingsType settingsType) {
        return "// example\n" +
                "/*  code sample*/\n" +
                "FOR doc IN collection\n" +
                "RETURN doc\n" +
                "LIMIT 1,2\n" +
                "SORT doc._from ASC\n" +
                "RETURN {document:doc}";
    }
}
