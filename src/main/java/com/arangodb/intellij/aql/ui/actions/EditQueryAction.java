package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.util.Icons;
import com.arangodb.intellij.aql.util.log;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.ui.treeStructure.Tree;

public class EditQueryAction extends BaseQueryAction {

    private final Tree queryTree;
    private final Project project;

    public EditQueryAction(final Project project, final Tree queryTree) {
        super("Delete Query", "", Icons.ICON_EDIT);
        this.queryTree = queryTree;
        this.project = project;
    }

    @Override
    public void actionPerformed(final AnActionEvent e) {
        log.error("NOT IMPLEMENTED YET");
    }
}
