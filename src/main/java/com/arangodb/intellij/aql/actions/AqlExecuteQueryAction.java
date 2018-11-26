package com.arangodb.intellij.aql.actions;

import com.arangodb.intellij.aql.ui.windows.AqlConsoleWindow;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import org.jetbrains.annotations.NotNull;

public class AqlExecuteQueryAction extends AqlQueryAction {


    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        final Project project = getEventProject(anActionEvent);
        if (!canExecute(project, anActionEvent)) {
            return;
        }
        
      /*  final Set<String> names = AqlUtils.extractParameterNames(charsSequence, project);
        for (String name : names) {
            log.info("name {}", name);
        }*/
        final CharSequence charSequence = extractQuery(project, anActionEvent);
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
