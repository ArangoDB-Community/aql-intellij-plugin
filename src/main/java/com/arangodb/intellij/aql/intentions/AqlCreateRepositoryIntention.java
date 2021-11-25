package com.arangodb.intellij.aql.intentions;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.arangodb.intellij.aql.util.AqlUtils;
import com.intellij.codeInsight.daemon.impl.quickfix.CreateClassKind;
import com.intellij.codeInsight.intention.impl.CreateClassDialog;
import com.intellij.codeInsight.intention.impl.CreateSubclassAction;
import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectFileIndex;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.JavaDirectoryService;
import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiAnonymousClass;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiModifierList;
import com.intellij.psi.PsiPackage;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.psi.util.PsiUtilCore;

public class AqlCreateRepositoryIntention extends CreateSubclassAction {


    @Override
    public boolean isAvailable(@NotNull final Project project, final Editor editor, final PsiFile file) {
        final boolean isJava = file.getLanguage().equals(JavaLanguage.INSTANCE);
        if (isJava) {
            final CaretModel caretModel = editor.getCaretModel();
            final int position = caretModel.getOffset();
            final PsiElement element = file.findElementAt(position);
            final PsiClass psiClass = PsiTreeUtil.getParentOfType(element, PsiClass.class);
            if (psiClass == null || psiClass.isAnnotationType() || psiClass.isEnum() || psiClass instanceof PsiAnonymousClass) {
                return false;
            }
            final VirtualFile virtualFile = PsiUtilCore.getVirtualFile(psiClass);
            if (virtualFile == null) {
                return false;
            }

            final PsiModifierList modifierList = psiClass.getModifierList();
            if (modifierList == null) {
                return false;
            }
            final PsiAnnotation[] annotations = modifierList.getAnnotations();
            for (PsiAnnotation annotation : annotations) {
                final String name = annotation.getQualifiedName();
                if (name == null) {
                    continue;
                }
                if (name.equals("com.arangodb.springframework.annotation.Document")
                        || name.equals("com.arangodb.springframework.annotation.Edge")) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void createTopLevelClass(PsiClass psiClass) {
        final CreateClassDialog dlg = chooseSubclassToCreate(psiClass);
        if (dlg != null) {
            final String name = dlg.getClassName();
            final PsiFile file = AqlUtils.createFromTemplate(dlg.getTargetDirectory(), name, name + ".java", "SpringDataRepository.java", true, "INTERFACE_NAME", psiClass.getName());
            if (file != null) {
                final VirtualFile virtualFile = file.getVirtualFile();
                if (virtualFile != null) {
                    FileEditorManager.getInstance(file.getProject()).openFile(virtualFile, true);
                }
            }
        }
    }

    @Nullable
    public static CreateClassDialog chooseSubclassToCreate(PsiClass psiClass) {
        final PsiDirectory sourceDir = psiClass.getContainingFile().getContainingDirectory();
        ProjectFileIndex fileIndex = ProjectRootManager.getInstance(psiClass.getProject()).getFileIndex();
        final PsiPackage aPackage = sourceDir != null ? JavaDirectoryService.getInstance().getPackage(sourceDir) : null;
        final CreateClassDialog dialog = new CreateClassDialog(
                psiClass.getProject(), getTitle(psiClass),
                psiClass.getName() + "Repository",
                aPackage != null ? aPackage.getQualifiedName() : "",
                CreateClassKind.CLASS, true, ModuleUtilCore.findModuleForPsiElement(psiClass)) {
            @Override
            protected PsiDirectory getBaseDir(String packageName) {
                return sourceDir != null && fileIndex.getSourceRootForFile(sourceDir.getVirtualFile()) != null ? sourceDir : super.getBaseDir(packageName);
            }

            @Override
            protected boolean reportBaseInTestSelectionInSource() {
                return true;
            }
        };
        if (!dialog.showAndGet()) {
            return null;
        }
        final PsiDirectory targetDirectory = dialog.getTargetDirectory();
        if (targetDirectory == null) {
            return null;
        }
        return dialog;
    }


    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getText() {
        return "Create Spring Data AQL Repository Interface";
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getFamilyName() {
        return getText();
    }


}
