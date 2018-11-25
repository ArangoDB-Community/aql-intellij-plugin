package com.arangodb.intellij.aql.ui.windows;

import com.arangodb.intellij.aql.actions.ActionBusEvent;
import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.ui.actions.*;
import com.arangodb.intellij.aql.ui.renderers.AqlNodeModel;
import com.arangodb.intellij.aql.ui.renderers.AqlNodeRenderer;
import com.arangodb.intellij.aql.util.log;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.ActionToolbarPosition;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.CheckedTreeNode;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.treeStructure.Tree;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;
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
        toolbarDecorator.addExtraAction(new AddServerAction(project));
        toolbarDecorator.addExtraAction(new RefreshSchemeAction(this));
        toolbarDecorator.addExtraAction(new ExpandAllAction(schemaTree));
        toolbarDecorator.addExtraAction(new CollapseAllAction(schemaTree));
        toolbarDecorator.addExtraAction(new SetActiveAction(this));
        schemePanel.add(toolbarDecorator.createPanel());

        //schemePanel.add(toolbarDecorator.createPanel());
        fillTree();

        AqlDataService
                .with(project)
                .subscribeSchemeRefresh(data -> {
                    fillTree();
                })
                .subscribe(ActionBusEvent.AQL_SYSTEM_ACTIVE_DATABASE_SET, data -> {
                    final CheckedTreeNode[] selectedNodes = schemaTree.getSelectedNodes(CheckedTreeNode.class,
                            node -> {
                                final Object userObject = node.getUserObject();
                                return (userObject instanceof AqlNodeModel && ((AqlNodeModel) userObject).getType() == AqlNodeModel.Type.DATABASE);
                            });
                    if (selectedNodes.length == 0) {
                        log.error("Please select one database node");
                        return;
                    }
                    if (selectedNodes.length > 1) {
                        log.error("Please select only one database node");
                        return;
                    }
                    final AqlNodeModel selectedNode = (AqlNodeModel) selectedNodes[0].getUserObject();
                    AqlDataService.with(project).setActiveDatabase(selectedNode);

                });


    }

    private void fillTree() {
        schemaTree.setCellRenderer(new AqlNodeRenderer());

        //@SuppressWarnings("unchecked")
        //final StructureTreeModel treeModel = new StructureTreeModel(treeStructure);

        schemaTree.setRootVisible(true);
        schemaTree.setShowsRootHandles(true);
        final ArangoDbServer server = AqlDataService.with(project).server();
        final DefaultTreeModel treeModel = AqlDataService.with(project).populateTree(server);
        schemaTree.setModel(treeModel);


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

    public Project getProject() {
        return project;
    }
}
