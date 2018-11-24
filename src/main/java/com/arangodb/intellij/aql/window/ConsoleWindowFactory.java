
package com.arangodb.intellij.aql.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class ConsoleWindowFactory implements ToolWindowFactory {


    @Override
    public void createToolWindowContent(@NotNull final Project project, @NotNull final ToolWindow toolWindow) {
        final ConsoleWindow dataWindow = new ConsoleWindow(project, toolWindow);
        final ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        final Content content = contentFactory.createContent(dataWindow.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);
    }


}
