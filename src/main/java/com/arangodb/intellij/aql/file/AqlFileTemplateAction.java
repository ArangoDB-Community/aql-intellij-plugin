package com.arangodb.intellij.aql.file;

import com.arangodb.intellij.aql.util.Icons;
import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;

import java.util.Map;

public class AqlFileTemplateAction extends CreateFileFromTemplateAction implements DumbAware {

    public static final String NEW_AQL_FILE = "New AQL File";
    private static final String AQL_FILE = "AQL Template";

    public AqlFileTemplateAction() {
        super(NEW_AQL_FILE, "AQL file", Icons.ICON_ARANGO);
    }

    @Override
    protected void buildDialog(final Project project, final PsiDirectory directory, final CreateFileFromTemplateDialog.Builder builder) {
        builder.setTitle(NEW_AQL_FILE)
                .addKind(NEW_AQL_FILE, Icons.ICON_ARANGO, AQL_FILE);
    }

    @Override
    protected String getActionName(final PsiDirectory directory, final String newName, final String templateName) {
        return NEW_AQL_FILE;
    }

    @Override
    protected void postProcess(final PsiFile createdElement, final String templateName, final Map<String, String> customProperties) {
        if (createdElement instanceof AqlFile) {
            final Project project = createdElement.getProject();
            final Editor editor = FileEditorManager.getInstance(project).getSelectedTextEditor();
            if (editor == null) {
                return;
            }
            final VirtualFile virtualFile = createdElement.getContainingFile().getVirtualFile();
            if (virtualFile == null) {
                return;
            }
            final PsiElement lastChild = createdElement.getLastChild();
            if (FileDocumentManager.getInstance().getDocument(virtualFile) == editor.getDocument()) {
                editor.getCaretModel().moveToOffset(lastChild.getTextRange().getEndOffset());
            }
        }
    }
}
