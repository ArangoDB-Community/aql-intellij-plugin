package com.arangodb.intellij.aql.actions;

import com.arangodb.intellij.aql.ui.windows.AqlConsoleWindow;
import com.arangodb.intellij.aql.util.AqlConst;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public abstract class AqlQueryAction extends AnAction {

    boolean canExecute(final Project project, @NotNull final AnActionEvent anActionEvent) {

        final Editor editor = anActionEvent.getData(CommonDataKeys.EDITOR_EVEN_IF_INACTIVE);
        if (project == null || editor == null) {
            return false;
        }
        final PsiFile psiFile = anActionEvent.getData(CommonDataKeys.PSI_FILE);
        if (psiFile == null) {
            return false;
        }
        final String id = psiFile.getLanguage().getID();
        if (!AqlConst.AQL_LANGUAGE_ID.equals(id)) {
            return false;
        }
        // TODO remove this....(see below)
        final ToolWindow window = ToolWindowManager.getInstance(project).getToolWindow(AqlConsoleWindow.WINDOW_ID);
        if (window == null) {
            return false;
        }

        return true;
    }

    public CharSequence extractQuery(final Project project, @NotNull final AnActionEvent anActionEvent) {
        final Editor editor = anActionEvent.getData(CommonDataKeys.EDITOR_EVEN_IF_INACTIVE);
        assert project != null;
        assert editor != null;
        final Document document = editor.getDocument();
        return extractText(editor, document);
    }

    /**
     * Execute selection only if there is one, document otherwise
     */
    private CharSequence extractText(final Editor editor, final Document document) {
        final Caret caret = editor.getCaretModel().getPrimaryCaret();
        if (caret.hasSelection()) {
            return caret.getSelectedText();
        }
        return document.getCharsSequence();
    }
}
