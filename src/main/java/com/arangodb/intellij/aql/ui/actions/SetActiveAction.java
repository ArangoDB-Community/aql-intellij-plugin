package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.ui.windows.AqlServerToolWindow;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.AnActionButton;
import org.jetbrains.annotations.NotNull;

public class SetActiveAction extends AnActionButton {

    private final AqlServerToolWindow serverToolWindow;

    public SetActiveAction(final AqlServerToolWindow serverToolWindow) {
        super("Set active", "Set ArangoDB database", Icons.ICON_SELECTED);
        this.serverToolWindow = serverToolWindow;
    }

    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        AqlDataService.with(serverToolWindow.getProject()).setActiveDatabase();
    }
}