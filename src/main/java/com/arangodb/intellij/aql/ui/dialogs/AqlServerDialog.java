package com.arangodb.intellij.aql.ui.dialogs;

import com.arangodb.intellij.aql.actions.ActionResponse;
import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.util.log;
import com.intellij.ide.ui.UINumericRange;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.openapi.ui.popup.Balloon;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.util.Disposer;
import com.intellij.ui.JBIntSpinner;
import com.intellij.ui.awt.RelativePoint;
import com.intellij.ui.components.JBPasswordField;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.components.JBTextField;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class AqlServerDialog extends DialogWrapper {


    private final Project project;
    private JPanel panel;
    private JBTextField serverNameText;
    private JBTextField hostText;
    private JBTextField userText;
    private JBPasswordField passwordText;
    private JButton testServerButton;
    private JBIntSpinner portSpinner;
    private JBTabbedPane tabbedPane;


    public AqlServerDialog(Project project) {
        super(project);
        this.project = project;
        Disposer.register(project, myDisposable);
        init();
        testServerButton.addActionListener(e -> {
            final ActionResponse result = AqlDataService.with(project).testServerConnection(buildState());
            showTooltip(result);
            if (result.getType() == ActionResponse.Type.ERROR) {
                log.error("Server Connection:", result.getMessage());
            } else {
                log.info("Server Connection:", result.getMessage());
            }

        });

    }

    public void showTooltip(final ActionResponse response) {
        SwingUtilities.invokeLater(() -> {
            final Icon icon = response.getIcon();
            final Balloon balloon =
                    JBPopupFactory.getInstance().createHtmlTextBalloonBuilder(response.getMessage(), icon, MessageType.INFO.getPopupBackground(), null)
                            .setFadeoutTime(3000)
                            .setShowCallout(false)
                            .createBalloon();
            final Dimension size = panel.getSize();
            final RelativePoint point = new RelativePoint(panel, new Point(size.width / 2, size.height / 2));
            balloon.show(point, Balloon.Position.above);
        });
    }

    @Nullable
    @Override
    protected ValidationInfo doValidate() {
        return null;
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return panel;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        portSpinner = new JBIntSpinner(new UINumericRange(8529, 0, 65535));
    }

    private ArangoDbServer buildState() {
        final ArangoDbServer state = new ArangoDbServer();
        state.setName(serverNameText.getText());
        state.setUser(userText.getText());
        state.setPassword(String.valueOf(passwordText.getPassword()));
        state.setHost(hostText.getText());
        state.setPort(portSpinner.getNumber());
        return state;
    }

    public ArangoDbServer getData() {
        return buildState();
    }

    public void setData(final ArangoDbServer server) {
        serverNameText.setText(server.getName());
        passwordText.setText(server.getPassword());
        userText.setText(server.getUser());
        hostText.setText(server.getHost());
        portSpinner.setNumber(server.getPort());

    }
}
