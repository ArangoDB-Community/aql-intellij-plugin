package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.ui.windows.AqlServerToolWindow;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.AnActionButton;
import org.jetbrains.annotations.NotNull;

public class RefreshSchemeAction extends AnActionButton {

    private final AqlServerToolWindow serverToolWindow;

    public RefreshSchemeAction(final AqlServerToolWindow serverToolWindow) {
        super("Add Server", "Add ArangoDB server instance", AllIcons.Actions.Refresh);
        this.serverToolWindow = serverToolWindow;
    }

    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        serverToolWindow.addServerAction();
    }
}
