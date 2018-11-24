package com.machak.aql.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.machak.aql.util.AqlConst;
import com.machak.aql.util.Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import static com.machak.aql.lang.AqlLanguage.*;

public class AqlFileType extends LanguageFileType {
    public static final AqlFileType INSTANCE = new AqlFileType();

    private AqlFileType() {
        super(AQL_LANGUAGE);
    }

    @NotNull
    @Override
    public String getName() {
        return AqlConst.AQL_FILE_NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return AqlConst.AQL_FILE_DESCRIPTION;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return AqlConst.AQL_FILE_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.ICON_ARANGO_SMALL;
    }
}

