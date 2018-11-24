package com.arangodb.intellij.aql.ui.dialogs;

import com.arangodb.intellij.aql.util.Icons;
import com.intellij.ide.ui.UINumericRange;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.util.Disposer;
import com.intellij.ui.JBIntSpinner;
import com.intellij.ui.components.JBPasswordField;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.JBUI;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class AqlServerDialog extends DialogWrapper {


    private JPanel panel;
    private JBTextField databaseText;
    private JBTextField hostText;
    private JBTextField userText;
    private JBPasswordField passwordText;
    private JButton addServerButton;
    private JBIntSpinner portSpinner;
    private JBTabbedPane tabbedPane;


    public AqlServerDialog(Project project) {
        super(project);
        Disposer.register(project, myDisposable);
        init();


        addServerButton.addActionListener(e -> {
            JPanel popupPanel = new JPanel(new BorderLayout());
            popupPanel.setBorder(JBUI.Borders.empty(1));

            final ValidationInfo validationInfo = doValidate();
            if (validationInfo != null) {
                JLabel errorLabel = new JLabel("Connection failed: " + validationInfo.message, Icons.ICON_ERROR, JLabel.LEFT);
                popupPanel.add(errorLabel, BorderLayout.CENTER);
            } else {
            }

            JBPopupFactory.getInstance()
                    .createComponentPopupBuilder(popupPanel, this.getPreferredFocusedComponent())
                    .setTitle("Test connection")
                    .createPopup()
                    .showInCenterOf(this.getContentPanel());
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
        addServerButton = new JButton("Add Server");
    }
}
