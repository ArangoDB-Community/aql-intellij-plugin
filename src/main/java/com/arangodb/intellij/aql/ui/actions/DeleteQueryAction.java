package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.model.AqlQuery;
import com.arangodb.intellij.aql.util.Icons;
import com.arangodb.intellij.aql.util.log;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.ui.treeStructure.Tree;

public class DeleteQueryAction extends BaseQueryAction {

    private final Tree queryTree;
    private final Project project;

    public DeleteQueryAction(final Project project, final Tree queryTree) {
        super("Delete Query", "", Icons.ICON_DELETE);
        this.queryTree = queryTree;
        this.project = project;
    }

    @Override
    public void actionPerformed(final AnActionEvent e) {

        final AqlQuery selectedQuery = getSelectedQuery(project, queryTree);
        if (selectedQuery == null) {
            log.error("Nothing selected");
        } else {
            AqlDataService.with(project).deleteQuery(selectedQuery.getName());
        }

    }



}
