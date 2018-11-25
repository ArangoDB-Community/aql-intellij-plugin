package com.arangodb.intellij.aql.ui.renderers;

import com.intellij.ui.ColoredTreeCellRenderer;
import com.intellij.ui.SimpleTextAttributes;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class AqlNodeRenderer extends ColoredTreeCellRenderer {
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
            final String name = model.getName() + ": " + model.getDisplayName();
            append(name, SimpleTextAttributes.REGULAR_BOLD_ATTRIBUTES, true);
            setIcon(model.getIcon());
        } else {
            append(tree.convertValueToText(value, selected, expanded, leaf, row, hasFocus), SimpleTextAttributes.REGULAR_ATTRIBUTES);
        }
    }

}
