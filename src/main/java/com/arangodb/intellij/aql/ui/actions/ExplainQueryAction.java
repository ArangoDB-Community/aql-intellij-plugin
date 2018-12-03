package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.model.AqlQuery;
import com.arangodb.intellij.aql.util.Icons;
import com.arangodb.intellij.aql.util.log;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.ui.treeStructure.Tree;

public class ExplainQueryAction extends BaseQueryAction {

    private final Tree queryTree;
    private final Project project;

    public ExplainQueryAction(final Project project, final Tree queryTree) {
        super("Explain Query", "", Icons.ICON_PROFILE);
        this.project = project;
        this.queryTree = queryTree;
    }

    @Override
    public void actionPerformed(final AnActionEvent e) {
        final AqlQuery query = getSelectedQuery(project, queryTree);
        if (query == null) {
            log.error("Nothing selected");
            return;
        }
        AqlDataService.with(project).explainQuery(query.getQuery(), query.getParameters());
    }
}
