package com.arangodb.intellij.aql.ui.windows;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.ui.actions.AddServerAction;
import com.arangodb.intellij.aql.ui.actions.CollapseAllAction;
import com.arangodb.intellij.aql.ui.actions.ExpandAllAction;
import com.arangodb.intellij.aql.ui.actions.RefreshSchemeAction;
import com.arangodb.intellij.aql.ui.renderers.AqlNodeRenderer;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.ActionToolbarPosition;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.treeStructure.Tree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

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
