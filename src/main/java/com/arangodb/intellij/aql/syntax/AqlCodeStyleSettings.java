package com.arangodb.intellij.aql.syntax;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class AqlCodeStyleSettings extends CustomCodeStyleSettings {
    public AqlCodeStyleSettings(final CodeStyleSettings settings) {
        super("AqlCodeStyleSettings", settings);
    }
}
