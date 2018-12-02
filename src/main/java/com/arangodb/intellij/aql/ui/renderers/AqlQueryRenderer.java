package com.arangodb.intellij.aql.ui.renderers;

import com.google.common.base.Strings;
import com.intellij.ui.ColoredTreeCellRenderer;
import com.intellij.ui.SimpleTextAttributes;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

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
        if (userObject instanceof AqlNodeModel) {
            final AqlNodeModel model = (AqlNodeModel) userObject;

            final String name = extractName(model);
            append(name, model.getStyle(), true);
            setIcon(model.getIcon());
            setToolTipText(model.getType().name());

        } else {
            append(tree.convertValueToText(value, selected, expanded, leaf, row, hasFocus), SimpleTextAttributes.REGULAR_ATTRIBUTES);
        }
    }


    private String extractName(final AqlNodeModel model) {
        final String name = model.getName();
        final boolean emptyName = Strings.isNullOrEmpty(name);
        if (emptyName) {
            return model.getDisplayName();
        }
        return name + " :" + model.getDisplayName();
    }

}
