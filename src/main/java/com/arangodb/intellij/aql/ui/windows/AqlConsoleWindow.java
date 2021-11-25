package com.arangodb.intellij.aql.ui.windows;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.tree.DefaultTreeModel;

import com.arangodb.intellij.aql.actions.ActionBusEvent;
import com.arangodb.intellij.aql.actions.ActionEventData;
import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.ui.actions.CollapseAllAction;
import com.arangodb.intellij.aql.ui.actions.DeleteQueryAction;
import com.arangodb.intellij.aql.ui.actions.EditQueryAction;
import com.arangodb.intellij.aql.ui.actions.ExecuteQueryAction;
import com.arangodb.intellij.aql.ui.actions.ExpandAllAction;
import com.arangodb.intellij.aql.ui.actions.ExplainQueryAction;
import com.arangodb.intellij.aql.ui.panels.JsonPanel;
import com.arangodb.intellij.aql.ui.renderers.AqlQueryRenderer;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionToolbarPosition;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.JBTabsPaneImpl;
import com.intellij.ui.ToolbarDecorator;
import com.intellij.ui.border.CustomLineBorder;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.tabs.impl.JBTabsImpl;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.ui.JBEmptyBorder;
import com.intellij.util.ui.JBUI;


public class AqlConsoleWindow implements Disposable {
    public static final String WINDOW_ID = "ArangoDB Console";

    private JPanel panel;
    private JBTabbedPane tabContainer;
    private JPanel jsonResults;
    private JPanel jsonTabPanel;
    private JPanel queryHistory;
    private JPanel graphPanel;
    private Tree queryTree;
    private JBTabsImpl consoleTabs;

    private JBTabsPaneImpl tabPanel;
    private JsonPanel jsonPanel;
    private final Project project;
    private ToolbarDecorator toolbarDecorator;

    public AqlConsoleWindow(final Project project, final ToolWindow toolWindow) {
        this.project = project;
        final JBEmptyBorder border = JBUI.Borders.empty();
        jsonResults.setBorder(border);
        jsonPanel = new JsonPanel(project);

        jsonResults.add(jsonPanel, BorderLayout.CENTER);
        // TODO
        //tabContainer.setVisible(false);
        project.getMessageBus().connect().subscribe(ActionBusEvent.AQL_QUERY_RESULT, this::processQuery);
        project.getMessageBus().connect().subscribe(ActionBusEvent.AQL_SYSTEM_EMPTY_LOG, this::emptyLog);
        project.getMessageBus().connect().subscribe(ActionBusEvent.AQL_QUERY_TREE_CHANGE, this::fillTree);
        final ActionGroup consoleActionGroup = (ActionGroup) ActionManager.getInstance().getAction(ActionBusEvent.ACTION_CONSOLE);
        final ActionToolbar consoleToolbar = ActionManager.getInstance().createActionToolbar(WINDOW_ID, consoleActionGroup, false);
        jsonTabPanel.add(consoleToolbar.getComponent(), BorderLayout.NORTH);
        jsonTabPanel.setBorder(new CustomLineBorder(0, 0, 0, 1));
        jsonTabPanel.validate();
        toolbarDecorator = ToolbarDecorator.createDecorator(queryTree);
        toolbarDecorator.setPanelBorder(BorderFactory.createEmptyBorder());
        toolbarDecorator.setToolbarPosition(ActionToolbarPosition.TOP);
        toolbarDecorator.addExtraAction(new ExpandAllAction(queryTree));
        toolbarDecorator.addExtraAction(new CollapseAllAction(queryTree));
        toolbarDecorator.addExtraAction(new DeleteQueryAction(project, queryTree));
        toolbarDecorator.addExtraAction(new EditQueryAction(project, queryTree));
        toolbarDecorator.addExtraAction(new ExplainQueryAction(project, queryTree));
        toolbarDecorator.addExtraAction(new ExecuteQueryAction(project, queryTree));
        queryHistory.add(toolbarDecorator.createPanel());
        fillTree(null);
    }

    private void fillTree(final ActionEventData empty) {
        queryTree.setCellRenderer(new AqlQueryRenderer());
        queryTree.setRootVisible(true);
        queryTree.setShowsRootHandles(false);
        final AqlDataService service = AqlDataService.with(project);
        final DefaultTreeModel treeModel = service.populateQueryTree();
        queryTree.setModel(treeModel);

    }


    private void emptyLog(final ActionEventData actionEventData) {
        jsonPanel.onClean(project);
    }

    private void processQuery(final ActionEventData data) {
        jsonPanel.onMessage(data, project);
    }


    private void createUIComponents() {
        tabPanel = new JBTabsPaneImpl(null, SwingConstants.TOP, this);
        consoleTabs = (JBTabsImpl) tabPanel.getTabs();
        // TODO upgrade check
        //Disposer.register(this, consoleTabs);
    }

    public JComponent getContent() {
        return panel;
    }

    @Override
    public void dispose() {
        /*if (consoleTabs != null) {
            consoleTabs.dispose();
        }*/

        if (jsonPanel != null) {
            jsonPanel.dispose();
        }
    }

}
