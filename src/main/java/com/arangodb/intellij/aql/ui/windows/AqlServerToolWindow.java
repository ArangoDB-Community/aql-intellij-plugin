package com.arangodb.intellij.aql.ui.windows;

import com.arangodb.intellij.aql.ui.actions.AddServerAction;
import com.arangodb.intellij.aql.ui.actions.CollapseAllAction;
import com.arangodb.intellij.aql.ui.actions.ExpandAllAction;
import com.arangodb.intellij.aql.ui.actions.RefreshSchemeAction;
import com.arangodb.intellij.aql.ui.dialogs.AqlServerDialog;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.ActionToolbarPosition;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.CheckedTreeNode;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.treeStructure.Tree;

import javax.swing.*;
import java.awt.*;

public class AqlServerToolWindow implements Disposable {
    public static final String WINDOW_ID = "ArangoDB";


    private final Project project;
    private JPanel panel;
    private Tree schemaTree;
    private JPanel schemePanel;


    private ToolbarDecorator toolbarDecorator;

    public AqlServerToolWindow(final Project project, final ToolWindow toolWindow) {
        this.project = project;
        //TreeUtil.addChildrenTo(root, nodes);
        toolbarDecorator = ToolbarDecorator.createDecorator(schemaTree);
        toolbarDecorator.setPanelBorder(BorderFactory.createEmptyBorder());
        toolbarDecorator.setToolbarPosition(ActionToolbarPosition.TOP);
        toolbarDecorator.addExtraAction(new AddServerAction(this));
        toolbarDecorator.addExtraAction(new RefreshSchemeAction(this));
        toolbarDecorator.addExtraAction(new ExpandAllAction(schemaTree));
        toolbarDecorator.addExtraAction(new CollapseAllAction(schemaTree));
        schemePanel.add(toolbarDecorator.createPanel());
        //schemePanel.add(toolbarDecorator.createPanel());
        fillTree();


    }

    private void fillTree() {

        final CheckedTreeNode root = new CheckedTreeNode(Pair.create("Server", "Server"));
        root.setChecked(true);
        //schemaTree.setModel(new GraphTreeModelImpl());
        //schemaTree.setModel(new DefaultTreeModel(root));

    }

    public JPanel getContent() {
        return panel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //serverPanel = new JPanel(new GridLayout(0, 1));
        schemePanel = new JPanel(new GridLayout(0, 1));
        //splitter = new JBSplitter("ArangoDB.splitter", 0.3f);

    }

    @Override
    public void dispose() {

    }

    public void addServerAction() {
        new AqlServerDialog(project).show();
    }
}
