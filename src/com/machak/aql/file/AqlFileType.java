package com.machak.aql.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import static com.machak.aql.lang.AqlLanguage.*;

public class AqlFileType extends LanguageFileType {
    public static final AqlFileType INSTANCE = new AqlFileType();

    public static final Icon ICON = IconLoader.getIcon("/com/machak/aql/icons/aql-small.png");

    private AqlFileType() {
        super(AQL_LANGUAGE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Simple file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "AQL language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "aql";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ICON;
    }
}

