package com.machak.aql.window;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.machak.aql.db.AqlDatabaseService;

import javax.swing.*;

public class DataWindow {


    private JPanel myToolWindowContent;
    private JButton refreshButton;
    private JToolBar toolbar;
    private JTextField textUser;
    private JTextField textHost;
    private JPasswordField passwordField;
    private JSpinner portField;
    private JTextField textDatabase;
    private JButton saveButton;
    private AqlDatabaseService service;
    private DataWindowState dataWindowState;

    public DataWindow(final Project project, final ToolWindow toolWindow) {

        portField.setValue(ArangoDbDataSource.DEFAULT_PORT);
        dataWindowState = project.getComponent(DataWindowState.class);
        service = ServiceManager.getService(project, AqlDatabaseService.class);
        refreshButton.addActionListener(e -> {
            final ArangoDbDataSource state = dataWindowState.getState();
            // refresh data sources
            service.refresh(state);
        });
        saveButton.addActionListener(e -> {
            final ArangoDbDataSource state = dataWindowState.getState();
            // refresh data sources
            service.refresh(state);
        });

    }

    public JPanel getContent() {
        return myToolWindowContent;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
