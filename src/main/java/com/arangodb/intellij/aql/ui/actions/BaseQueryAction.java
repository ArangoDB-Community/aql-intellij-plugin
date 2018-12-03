package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.model.AqlQuery;
import com.arangodb.intellij.aql.ui.renderers.AqlQueryModel;
import com.intellij.openapi.project.Project;
import com.intellij.ui.AnActionButton;
import com.intellij.ui.CheckedTreeNode;
import com.intellij.ui.treeStructure.Tree;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public abstract class BaseQueryAction extends AnActionButton {


    public BaseQueryAction(final String name, final String description, final Icon iconDelete) {
      super(name, description, iconDelete);
    }

    @Nullable
    protected AqlQuery getSelectedQuery(final Project project, final Tree tree) {

        final TreeSelectionModel selectionModel = tree.getSelectionModel();
        if (selectionModel != null) {
            final TreePath selectionPath = selectionModel.getSelectionPath();
            if (selectionPath != null && selectionPath.getLastPathComponent() instanceof CheckedTreeNode) {
                final CheckedTreeNode component = (CheckedTreeNode) selectionPath.getLastPathComponent();
                final Object userObject = component.getUserObject();
                if (userObject instanceof AqlQueryModel) {
                    final String name = ((AqlQueryModel) userObject).getName();
                    return AqlDataService.with(project).getExistingQueryForName(name);
                }
            }
        }
        return null;
    }

}
