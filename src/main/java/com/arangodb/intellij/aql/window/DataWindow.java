package com.arangodb.intellij.aql.window;

import com.arangodb.intellij.aql.db.AqlDatabaseService;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

public class DataWindow implements Disposable {
    public static final String WINDOW_ID = "ArangoDB";


    private JPanel myToolWindowContent;
    private JButton refreshButton;
    private JToolBar toolbar;
    private JTextField textUser;             
    private JTextField textHost;
    private JPasswordField passwordField;
    private JSpinner portField;
    private JTextField textDatabase;
    private JButton saveButton;
    private JCheckBox excludeCheckBox;
    private AqlDatabaseService service;
    private DataWindowState dataWindowState;

    public DataWindow(final Project project, final ToolWindow toolWindow) {

        portField.setValue(ArangoDbDataSource.DEFAULT_PORT);
        dataWindowState = project.getComponent(DataWindowState.class);
        service = ServiceManager.getService(project, AqlDatabaseService.class);
        final ArangoDbDataSource oldState = dataWindowState.getState();
        service.refresh(oldState, project);
        textDatabase.setText(oldState.getDatabase());
        textHost.setText(oldState.getHost());
        passwordField.setText(oldState.getPassword());
        portField.setValue(oldState.getPort());
        excludeCheckBox.setSelected(oldState.isExcludeSystemCollections());
        textUser.setText(oldState.getUser());

        refreshButton.addActionListener(e -> {
            final ArangoDbDataSource state = dataWindowState.getState();
            service.refresh(state, project);
        });
        saveButton.addActionListener(e -> {
            final ArangoDbDataSource state = dataWindowState.getState();
            state.setDatabase(textDatabase.getText());
            state.setUser(textUser.getText());
            state.setPassword(String.valueOf(passwordField.getPassword()));
            state.setHost(textHost.getText());
            state.setExcludeSystemCollections(excludeCheckBox.isSelected());
            final Integer value = (Integer) portField.getValue();
            state.setPort(value);
            service.refresh(state, project);
        });

    }

    public JPanel getContent() {
        return myToolWindowContent;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    @Override
    public void dispose() {

    }
}
