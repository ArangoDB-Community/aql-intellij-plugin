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

public class AqlExecuteQueryAction extends AnAction {


    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        final Project project = getEventProject(anActionEvent);
        final Editor editor = anActionEvent.getData(CommonDataKeys.EDITOR_EVEN_IF_INACTIVE);
        if (project == null || editor == null) {
            return;
        }
        final PsiFile psiFile = anActionEvent.getData(CommonDataKeys.PSI_FILE);
        if (psiFile == null) {
            return;
        }
        final String id = psiFile.getLanguage().getID();
        if (!AqlConst.AQL_LANGUAGE_ID.equals(id)) {
            return;
        }
        // TODO remove this....(see below)
        final ToolWindow window = ToolWindowManager.getInstance(project).getToolWindow(AqlConsoleWindow.WINDOW_ID);
        if (window == null) {
            return;
        }

        final Document document = editor.getDocument();
        final CharSequence charsSequence = extractText(editor, document);
      /*  final Set<String> names = AqlUtils.extractParameterNames(charsSequence, project);
        for (String name : names) {
            log.info("name {}", name);
        }*/
        AqlDataService.with(project).executeQuery(charsSequence.toString());
      /*  final String title = "";
        CommandProcessor.getInstance().executeCommand(project, () -> {
            final Runnable action = () -> {

            };
            ApplicationManager.getApplication().runWriteAction(action);
        }, title, null);*/
        // TODO add parameters
        // TODO move window itself
        window.activate(null, true);


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
