package com.arangodb.intellij.aql.ui.dialogs;

import com.arangodb.intellij.aql.util.Icons;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.openapi.util.Disposer;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.components.JBTextField;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AqlParameterDialog extends DialogWrapper {


    private final Project project;
    private JPanel panel;

    private JBTabbedPane tabbedPane;
    private JPanel contentPanel;
    private Map<String, JBTextField> fields;

    public AqlParameterDialog(final Project project, final Set<String> names) {
        super(project);
        this.project = project;
        fields = new HashMap<>();
        tabbedPane.removeAll();
        for (String name : names) {
            final JPanel panel = new JPanel();
            final JBTextField text = new JBTextField(name);
            panel.add(text);
            tabbedPane.addTab(name, Icons.ICON_PARAMETER, panel);
            fields.put(name, text);
        }
        Disposer.register(project, myDisposable);
        init();
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



    }

    public Map<String, Object> getData() {
        final Map<String, Object> map = new HashMap<>();
        for (Map.Entry<String, JBTextField> entry : fields.entrySet()) {
            map.put(entry.getKey().replaceAll("@",""), entry.getValue().getText());
        }
        return map;
    }


    @Override
    protected void dispose() {
        //fields = null;
        super.dispose();
    }
}
