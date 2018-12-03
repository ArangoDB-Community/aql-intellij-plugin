package com.arangodb.intellij.aql.ui.dialogs;

import com.arangodb.intellij.aql.util.AqlUtils;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.openapi.util.Disposer;
import com.intellij.psi.PsiElement;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.JBDimension;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class AqlParameterDialog extends DialogWrapper {


    private static final Pattern PATTERN_AT = Pattern.compile("@");
    private final Project project;
    private JPanel panel;

    private JBTabbedPane tabbedPane;
    private JPanel contentPanel;
    private Map<String, JBTextField> fields;

    public AqlParameterDialog(final Project project, final Set<String> names, final PsiElement element) {
        super(project);
        this.project = project;
        fields = new HashMap<>();
        tabbedPane.removeAll();
        for (String name : names) {
            final JPanel panel = new JPanel();
            final JBTextField text = new JBTextField(AqlUtils.guessValueForParameter(name,element));
            text.setPreferredSize(new JBDimension(200, 24));
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

    public Map<String, String> getData() {
        final Map<String, String> map = new HashMap<>();
        for (Map.Entry<String, JBTextField> entry : fields.entrySet()) {
            final String text = entry.getValue().getText();
            map.put(PATTERN_AT.matcher(entry.getKey()).replaceFirst(""), text);
        }
        return map;
    }


    @Override
    protected void dispose() {
        //fields = null;
        super.dispose();
    }
}
