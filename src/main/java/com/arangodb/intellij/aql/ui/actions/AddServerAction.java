package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.ui.windows.AqlServerToolWindow;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.AnActionButton;
import org.jetbrains.annotations.NotNull;

public class AddServerAction extends AnActionButton {

    private final AqlServerToolWindow serverToolWindow;

    public AddServerAction(final AqlServerToolWindow serverToolWindow) {
        super("Add Server", "Add ArangoDB server instance", Icons.ICON_DATABASE);
        this.serverToolWindow = serverToolWindow;
    }

    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        serverToolWindow.addServerAction();
    }
}
