
package com.arangodb.intellij.aql.ui.actions;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.AnActionButton;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CollapseAllAction extends AnActionButton {

    private final JTree tree;

    public CollapseAllAction(JTree tree) {
        super("Collapse All", "", AllIcons.Actions.Collapseall);
        this.tree = tree;
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        int row = tree.getRowCount() - 1;
        while (row >= 0) {
            tree.collapseRow(row);
            row--;
        }
    }


}
