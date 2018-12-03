package com.arangodb.intellij.aql.util;

import com.arangodb.entity.AqlExecutionExplainEntity;
import com.arangodb.intellij.aql.file.AqlFile;
import com.arangodb.intellij.aql.file.AqlFileType;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlParameterVariable;
import com.arangodb.intellij.aql.model.AqlQuery;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Ints;
import com.intellij.json.JsonFileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.intellij.util.indexing.ID;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static com.arangodb.intellij.aql.util.log.*;


public final class AqlUtils {


    private AqlUtils() {
    }

    public static Object convertToBindVariable(final String value) {
        if (value == null) {
            return "";
        }
        final Integer integer = Ints.tryParse(value);
        if (integer != null) {
            return integer;
        }
        return value;
    }

    public static String createFileName(final String name, final Map<String, AqlQuery> existing) {
         AqlQuery aqlQueryModel = existing.get(name);
        if (aqlQueryModel != null) {
            // check if 
            int idx = 1;
            String newName = name + idx;
            aqlQueryModel = existing.get(newName);
            while (aqlQueryModel != null) {
                idx++;
                newName = name + idx;
                aqlQueryModel = existing.get(newName);
            }
            return newName;
        }
        return name;

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

    public static void popupDataSourceFix(final String message, final Project project) {
        errorAction(message, "Fix ArangoDB data source", new DataSourceWindowCallback(project));
    }

    @NotNull
    public static String createHash(final Project project, final String query, final Map<String, Object> data) {
        final String clean = CharMatcher.whitespace().removeFrom(query);
        return Hashing.sha256().newHasher().putString(clean, Charsets.UTF_8).hash().toString();
    }

    public static List<AqlNamedElement> findNamedElements(final Project project) {
        final Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance()
                .getContainingFiles(ID.create("filetypes"),
                        AqlFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        final List<AqlNamedElement> result = new ArrayList<>();
        for (final VirtualFile virtualFile : virtualFiles) {
            final AqlFile aqlFile = (AqlFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (aqlFile != null) {
                final AqlNamedElement[] elements = PsiTreeUtil.getChildrenOfType(aqlFile, AqlNamedElement.class);
                if (elements != null) {
                    Collections.addAll(result, elements);
                }
            }
        }
        return result;

    }

    public static List<AqlNamedElement> findNamedElements(final Project project, final String name) {
        final Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance()
                .getContainingFiles(ID.create("filetypes"),
                        AqlFileType.INSTANCE,
                        GlobalSearchScope.allScope(project));
        final List<AqlNamedElement> result = new ArrayList<>();
        for (final VirtualFile virtualFile : virtualFiles) {
            final AqlFile aqlFile = (AqlFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (aqlFile != null) {
                final AqlNamedElement[] elements = PsiTreeUtil.getChildrenOfType(aqlFile, AqlNamedElement.class);
                if (elements != null) {
                    for (AqlNamedElement element : elements) {
                        if (name.equals(element.getName())) {
                            result.add(element);
                        }
                    }

                }
            }
        }
        return result;
    }

    public static String guessValueForParameter(final String name, final PsiElement element) {
        //TODO find context in PSI tree and guess type (limit, sequence etc)
        //PsiTreeUtil
        if (name.indexOf("limit") > 0 || name.indexOf("count") > 0) {
            return "10";
        }
        return "";
    }
}
