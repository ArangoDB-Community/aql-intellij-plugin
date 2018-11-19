package com.machak.aql.actions;

import com.arangodb.ArangoCursor;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.psi.PsiFile;
import com.intellij.util.messages.MessageBus;
import com.machak.aql.db.AqlDatabaseService;
import com.machak.aql.exc.AqlPluginException;
import com.machak.aql.lang.AqlLanguage;
import com.machak.aql.util.log;
import com.machak.aql.window.ArangoDbDataSource;
import com.machak.aql.window.ConsoleWindowFactory;
import com.machak.aql.window.DataWindowState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

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
        if (!AqlLanguage.ID.equals(id)) {
            return;
        }
        // TODO remove this....(see below)
        final ToolWindow window = ToolWindowManager.getInstance(project).getToolWindow(ConsoleWindowFactory.ID);
        if (window == null) {
            return;
        }

        final Document document = editor.getDocument();
        final CharSequence charsSequence = extractText(editor, document);
        final DataWindowState component = project.getComponent(DataWindowState.class);
        final ArangoDbDataSource state = component.getState();
        final AqlDatabaseService service = ServiceManager.getService(project, AqlDatabaseService.class);
        final ArangoCursor<String> cursor;
        try {
            final String query = charsSequence.toString();
            cursor = service.getDatabase(state, project).query(query, String.class);
            final List<String> strings = cursor.asListRemaining();
            final StringBuilder builder = new StringBuilder();
            for (String serializable : strings) {
                builder.append(serializable);
            }
            final MessageBus messageBus = project.getMessageBus();
            final ActionBusEvent queryPlanEvent = messageBus.syncPublisher(ActionBusEvent.AQL_QUERY_RESULT);
            queryPlanEvent.onEvent(query, builder.toString());
            // TODO make configurable... and move to window itself...
            window.activate(null, true);
            log.info("Successfully executed query");
        } catch (Exception | AqlPluginException e) {
            log.error(e.getMessage());
        }


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
