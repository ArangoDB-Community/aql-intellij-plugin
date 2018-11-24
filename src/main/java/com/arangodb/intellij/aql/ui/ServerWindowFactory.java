package com.arangodb.intellij.aql.ui;

import com.arangodb.intellij.aql.ui.windows.AqlServerToolWindow;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class ServerWindowFactory implements ToolWindowFactory {


    @Override
    public void createToolWindowContent(@NotNull final Project project, @NotNull final ToolWindow toolWindow) {
        final AqlServerToolWindow aqlServerToolWindow = new AqlServerToolWindow(project, toolWindow);
        final ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        final Content content = contentFactory.createContent(aqlServerToolWindow.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);
    }


}
