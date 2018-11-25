package com.arangodb.intellij.aql.ui.windows;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.model.ArangoDbDatabase;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.ui.actions.AddServerAction;
import com.arangodb.intellij.aql.ui.actions.CollapseAllAction;
import com.arangodb.intellij.aql.ui.actions.ExpandAllAction;
import com.arangodb.intellij.aql.ui.actions.RefreshSchemeAction;
import com.arangodb.intellij.aql.ui.renderers.AqlNodeModel;
import com.arangodb.intellij.aql.ui.renderers.AqlNodeRenderer;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.ActionToolbarPosition;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.CheckedTreeNode;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.treeStructure.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.util.Set;

public class AqlServerToolWindow implements Disposable {
    public static final String WINDOW_ID = "ArangoDB";


    private static final Logger log = LoggerFactory.getLogger(AqlServerToolWindow.class);
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
        schemePanel.add(toolbarDecorator.createPanel());

        //schemePanel.add(toolbarDecorator.createPanel());
        fillTree();

        AqlDataService.with(project).subscribeSchemeRefresh(data -> {
            fillTree();
        });

    }

    private void fillTree() {
        schemaTree.setCellRenderer(new AqlNodeRenderer());

        final DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode());
        //@SuppressWarnings("unchecked")
        //final StructureTreeModel treeModel = new StructureTreeModel(treeStructure);

        schemaTree.setModel(model);
        schemaTree.setRootVisible(true);
        schemaTree.setShowsRootHandles(true);
        final ArangoDbServer server = AqlDataService.with(project).server();
        if (server != null) {

            final AqlNodeModel userObject = new AqlNodeModel(server.getName(), server.getHost(), AqlNodeModel.Type.SERVER);
            final CheckedTreeNode root = new CheckedTreeNode(userObject);

            root.setChecked(true);
            final Set<ArangoDbDatabase> databases = server.getDatabases();
            for (ArangoDbDatabase database : databases) {
                final CheckedTreeNode databaseNode = new CheckedTreeNode();
                databaseNode.setUserObject(new AqlNodeModel(database.getName(), database.getName(), AqlNodeModel.Type.DATABASE));
                root.add(databaseNode);
            }
            schemaTree.setModel(new DefaultTreeModel(root));
        }


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
