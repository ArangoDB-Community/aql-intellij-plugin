
package com.arangodb.intellij.aql.ui;

import com.arangodb.intellij.aql.ui.windows.AqlConsoleWindow;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class ConsoleWindowFactory implements ToolWindowFactory {
    private  AqlConsoleWindow dataWindow;
    @Override
    public void createToolWindowContent(@NotNull final Project project, @NotNull final ToolWindow toolWindow) {
        dataWindow = new AqlConsoleWindow(project, toolWindow);
        final ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        final Content content = contentFactory.createContent(dataWindow.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);
        Disposer.register(project, dataWindow);
    }
    
}
