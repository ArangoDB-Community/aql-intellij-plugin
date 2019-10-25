package com.arangodb.intellij.aql.ui.actions;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.ui.windows.AqlServerToolWindow;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.AnActionButton;

public class RefreshSchemeAction extends AnActionButton {

    private final AqlServerToolWindow serverToolWindow;

    public RefreshSchemeAction(final AqlServerToolWindow serverToolWindow) {
        super("Refresh Server", "Refresh server collections", AllIcons.Actions.Refresh);
        this.serverToolWindow = serverToolWindow;
    }

    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        AqlDataService.with(serverToolWindow.getProject()).refreshSchema();
    }
}
