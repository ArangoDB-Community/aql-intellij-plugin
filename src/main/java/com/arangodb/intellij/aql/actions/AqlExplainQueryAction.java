package com.arangodb.intellij.aql.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class AqlExplainQueryAction extends AqlQueryAction {


    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        runQueryAction(anActionEvent, AqlDataService.QueryType.EXPLAIN_QUERY);
    }

}
