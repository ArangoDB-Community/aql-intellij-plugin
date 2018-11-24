package com.arangodb.intellij.aql.file;

import com.arangodb.intellij.aql.lang.AqlLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AqlFile extends PsiFileBase {
    public AqlFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, AqlLanguage.AQL_LANGUAGE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return AqlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Aql file: " + super.toString();
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

}
