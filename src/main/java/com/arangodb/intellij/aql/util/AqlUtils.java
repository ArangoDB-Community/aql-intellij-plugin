package com.arangodb.intellij.aql.util;

import com.arangodb.entity.AqlExecutionExplainEntity;
import com.arangodb.intellij.aql.file.AqlFileType;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlParameterVariable;
import com.intellij.json.JsonFileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;


public final class AqlUtils {
    private static final Logger log = LoggerFactory.getLogger(AqlUtils.class);

    private AqlUtils() {
    }

    public static PsiFile createDummyJsonFile(@NotNull CharSequence text, final Project project) {
        return createDummyFile(JsonFileType.INSTANCE, text, project);
    }

    public static PsiFile createDummyAqlFile(@NotNull CharSequence text, final Project project) {
        return createDummyFile(AqlFileType.INSTANCE, text, project);
    }

    public static PsiFile createDummyFile(@NotNull final LanguageFileType fileType, @NotNull CharSequence text, @NotNull final Project project) {
        final String extension = fileType.getDefaultExtension();
        final String fileName = "AQL.dummy" + '.' + extension;
        final long stamp = System.currentTimeMillis();
        final PsiFileFactory factory = PsiFileFactory.getInstance(project);
        return factory.createFileFromText(fileName, fileType, text, stamp, false);
    }

    public static Set<String> extractParameterNames(@NotNull CharSequence text, final Project project) {
        final PsiFile file = createDummyAqlFile(text, project);
        final PsiElement[] psiElements = PsiTreeUtil.collectElements(file, psiElement -> psiElement instanceof AqlParameterVariable);
        final Set<String> strings = new HashSet<>();
        for (PsiElement element : psiElements) {
            final AqlParameterVariable e = (AqlParameterVariable) element;
            strings.add(e.getName());
        }
        return strings;
    }


    public static String parseExecutionEntity(final AqlExecutionExplainEntity entity) {
        return JSON.toJson(entity);
    }
}
