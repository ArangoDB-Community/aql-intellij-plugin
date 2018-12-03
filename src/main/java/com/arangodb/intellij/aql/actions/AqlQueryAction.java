package com.arangodb.intellij.aql.actions;

import com.arangodb.intellij.aql.model.AqlQuery;
import com.arangodb.intellij.aql.ui.dialogs.AqlParameterDialog;
import com.arangodb.intellij.aql.ui.windows.AqlConsoleWindow;
import com.arangodb.intellij.aql.util.AqlConst;
import com.arangodb.intellij.aql.util.AqlUtils;
import com.arangodb.intellij.aql.util.log;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public abstract class AqlQueryAction extends AnAction {

    protected void runQueryAction(@NotNull final AnActionEvent event, final AqlDataService.QueryType type) {
        final Project project = getEventProject(event);
        if (!canExecute(project, event)) {
            return;
        }

        final CharSequence charSequence = extractQuery(project, event);
        if (charSequence.length() < 1) {
            log.warn("No query found/selected");
            return;
        }
        final Set<String> names = AqlUtils.extractParameterNames(charSequence, project);
        final AqlDataService service = AqlDataService.with(project);
        final String query = charSequence.toString();
        // check existing:
        final AqlQuery existing = service.getExistingQueryForValue(query);
        if (existing != null) {
            execute(type, service, query, existing.getParameters());
            return;
        }
        final int paramsSize = names.size();

        if (paramsSize > 0) {

            final PsiElement element = event.getDataContext().getData(CommonDataKeys.PSI_ELEMENT);
            final AqlParameterDialog dialog = new AqlParameterDialog(project, names, element);

            final boolean ok = dialog.showAndGet();
            if (ok) {
                final Map<String, Object> data = dialog.getData();
                execute(type, service, query, data);
                showConsole(project);
                saveQuery(event, service, query, data);
                return;
            }
            log.error("No parameters defined");
            return;
        }

        execute(type, service, query, Collections.emptyMap());
        saveQuery(event, service, query, Collections.emptyMap());
        showConsole(project);
    }

    private void execute(final AqlDataService.QueryType type, final AqlDataService service, final String query, final Map<String, Object> data) {
        if (type == AqlDataService.QueryType.QUERY) {
            service.executeQuery(query, data);
        } else {
            service.explainQuery(query, data);
        }
    }

    protected void saveQuery(@NotNull final AnActionEvent event, final AqlDataService service, final String query, final Map<String, Object> data) {
        final VirtualFile file = event.getDataContext().getData(PlatformDataKeys.VIRTUAL_FILE);
        final String name = file == null ? "Query" : file.getName() + "_query";
        service.saveQuery(new AqlQuery(name, query, data));
    }

    protected void showConsole(final Project project) {
        assert project != null;
        final ToolWindow window = ToolWindowManager.getInstance(project).getToolWindow(AqlConsoleWindow.WINDOW_ID);
        window.activate(null, true);
    }
    
    protected boolean canExecute(final Project project, @NotNull final AnActionEvent anActionEvent) {

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
