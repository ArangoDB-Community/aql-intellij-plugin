package com.machak.aql.util;

import org.jetbrains.annotations.NotNull;

import com.intellij.json.JsonFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;

public class AqlUtils {
    public static PsiFile createDummyJsonFile(@NotNull CharSequence text, final Project project) {
        final String fileName = "Aql.dummy" + '.' + JsonFileType.INSTANCE.getDefaultExtension();
        final long stamp = System.currentTimeMillis();
        final PsiFileFactory factory = PsiFileFactory.getInstance(project);
        return  factory.createFileFromText(fileName, JsonFileType.INSTANCE, text, stamp, false);
    }
}
