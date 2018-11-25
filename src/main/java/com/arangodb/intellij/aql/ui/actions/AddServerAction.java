package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.ui.AnActionButton;
import org.jetbrains.annotations.NotNull;

public class AddServerAction extends AnActionButton {

    private final Project project;

    public AddServerAction(final Project project) {
        super("Add Server", "Add ArangoDB server instance", Icons.ICON_ARANGO_SMALL);
        this.project = project;
    }

    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        AqlDataService.with(project).showServerDialog();
    }
}
