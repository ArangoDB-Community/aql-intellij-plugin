package com.machak.aql.window;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.JBTabsPaneImpl;
import com.intellij.ui.border.CustomLineBorder;
import com.intellij.ui.components.JBTabbedPane;
import com.intellij.ui.tabs.TabInfo;
import com.intellij.ui.tabs.impl.JBTabsImpl;
import com.intellij.util.ui.JBEmptyBorder;
import com.intellij.util.ui.JBUI;
import com.machak.aql.actions.ActionBusEvent;
import com.machak.aql.actions.ActionEventData;
import com.machak.aql.util.log;
import com.machak.aql.window.panel.JsonPanel;

public class ConsoleWindow implements Disposable {
    public static final String WINDOW_ID = "ArangoDB Console";

    private JPanel panel;
    private JBTabbedPane tabContainer;
    private JPanel jsonResults;
    private JPanel jsonTabPanel;
    private JBTabsImpl consoleTabs;

    private JBTabsPaneImpl tabPanel;
    private JsonPanel jsonPanel;
    private final Project project;


    public ConsoleWindow(final Project project, final ToolWindow toolWindow) {
        this.project = project;
        final JBEmptyBorder border = JBUI.Borders.empty();
        jsonResults.setBorder(border);
        jsonPanel = new JsonPanel(project);
        jsonResults.add(jsonPanel.getEditor(), BorderLayout.CENTER);
        // TODO
        //tabContainer.setVisible(false);
        project.getMessageBus().connect().subscribe(ActionBusEvent.AQL_QUERY_RESULT, this::processQuery);
        final ActionGroup consoleActionGroup = (ActionGroup) ActionManager.getInstance().getAction(ActionBusEvent.ACTION_CONSOLE);
        final ActionToolbar consoleToolbar = ActionManager.getInstance().createActionToolbar(WINDOW_ID, consoleActionGroup, false);
        jsonTabPanel.add(consoleToolbar.getComponent(), BorderLayout.CENTER);
        jsonTabPanel.setBorder(new CustomLineBorder(0, 0, 0, 1));
        jsonTabPanel.validate();
    }

    private void processQuery(final ActionEventData data) {
        jsonPanel.onMessage(data, project);
        log.info("query {}", data.get(ActionEventData.KEY_QUERY));
    }


    private void createUIComponents() {
        tabPanel = new JBTabsPaneImpl(null, SwingConstants.TOP, this);
        consoleTabs = (JBTabsImpl) tabPanel.getTabs();
    }

    public JComponent getContent() {
        return panel;
    }

    @Override
    public void dispose() {
        // TODO
    }

}
