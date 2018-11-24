package com.arangodb.intellij.aql.ui.dialogs;

import com.arangodb.intellij.aql.util.AqlConst;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class QueryParameterDialog extends DialogWrapper {

    public QueryParameterDialog(@Nullable final Project project) {
        super(project);
        setTitle(AqlConst.TITLE_AQL_QUERY_PARAMETERS);
    }

    @Override
    protected JComponent createNorthPanel() {
        JTextPane description = new JTextPane();

        JLabel label = new JLabel();
        description.setFont(label.getFont());
        description.setForeground(label.getForeground());
        description.setBackground(UIUtil.getOptionPaneBackground());
        description.setText(AqlConst.TITLE_AQL_QUERY_PARAMETERS);

        final JPanel panel = new JPanel(new BorderLayout());
        panel.add(description);
        panel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
        return panel;
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return null;
    }
}
