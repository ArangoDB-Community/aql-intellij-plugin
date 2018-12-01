package com.arangodb.intellij.aql.actions;

import com.arangodb.intellij.aql.ui.dialogs.AqlParameterDialog;
import com.arangodb.intellij.aql.ui.windows.AqlConsoleWindow;
import com.arangodb.intellij.aql.util.AqlUtils;
import com.arangodb.intellij.aql.util.log;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;

public class AqlExecuteQueryAction extends AqlQueryAction {


    @Override
    public void actionPerformed(@NotNull final AnActionEvent event) {
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
        if (names.size() > 0) {
            final AqlParameterDialog dialog = new AqlParameterDialog(project, names);

            final boolean ok = dialog.showAndGet();
            if (ok) {
                log.error("ok {}");
                final Map<String, Object> data = dialog.getData();
                AqlDataService.with(project).executeQuery(charSequence.toString(), data);
            }
         return;
        }

        AqlDataService.with(project).executeQuery(charSequence.toString());
      /*  final String title = "";
        CommandProcessor.getInstance().executeCommand(project, () -> {
            final Runnable action = () -> {

            };
            ApplicationManager.getApplication().runWriteAction(action);
        }, title, null);*/
        // TODO add parameters
        // TODO move window itself
        assert project != null;
        final ToolWindow window = ToolWindowManager.getInstance(project).getToolWindow(AqlConsoleWindow.WINDOW_ID);
        window.activate(null, true);


    }


}
