package com.arangodb.intellij.aql.ui.renderers;

import com.google.common.base.Strings;
import com.intellij.ui.ColoredTreeCellRenderer;
import com.intellij.ui.SimpleTextAttributes;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Map;

public class AqlQueryRenderer extends ColoredTreeCellRenderer {
    @Override
    public void customizeCellRenderer(@NotNull JTree tree,
                                      Object value,
                                      boolean selected,
                                      boolean expanded,
                                      boolean leaf,
                                      int row,
                                      boolean hasFocus) {
        final Object userObject = ((DefaultMutableTreeNode) value).getUserObject();
        if (userObject instanceof AqlQueryModel) {
            final AqlQueryModel model = (AqlQueryModel) userObject;

            final String name = extractName(model.getName(), model.getParameters());
            append(name, model.getStyle(), true);
            setIcon(model.getIcon());
            setToolTipText(model.getType().name());

        } else {
            append(tree.convertValueToText(value, selected, expanded, leaf, row, hasFocus), SimpleTextAttributes.REGULAR_ATTRIBUTES);
        }
    }

    private String extractName(final String name, final Map<String, String> parameters) {

        if (Strings.isNullOrEmpty(name)) {
            return "<unknown>";
        }
        if (parameters.size() == 0) {
             return name;
        }
        final StringBuilder builder = new StringBuilder();
        builder.append(" (");
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                value = "";
            }
            builder.append(entry.getKey()).append(':').append(value);
        }
        builder.append(')');
        return name + builder;
    }


}
