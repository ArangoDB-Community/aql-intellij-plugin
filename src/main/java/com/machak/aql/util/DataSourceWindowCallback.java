package com.machak.aql.util;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.machak.aql.window.DataWindow;

public class DataSourceWindowCallback implements ActionMessageCallback {
    private final Project project;
    public DataSourceWindowCallback(final Project project) {
        this.project = project;
    }

    @Override
    public void call() {
        final ToolWindow window = ToolWindowManager.getInstance(project).getToolWindow(DataWindow.WINDOW_ID);
        if (window != null) {
            window.activate(null, true);
        }
    }
}
