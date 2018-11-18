package com.machak.aql.window;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

public class DataWindow {

    private JButton refreshToolWindowButton;
    private JButton hideToolWindowButton;
    private JPanel myToolWindowContent;

    public DataWindow(final ToolWindow toolWindow) {
        hideToolWindowButton.addActionListener(e -> toolWindow.hide(null));
        refreshToolWindowButton.addActionListener(e -> {
            // refresh data sources
        });

    }

    public JPanel getContent() {
        return myToolWindowContent;
    }
}
