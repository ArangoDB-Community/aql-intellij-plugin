package com.arangodb.intellij.aql.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class AqlExecuteQueryAction extends AqlQueryAction {


    @Override
    public void actionPerformed(@NotNull final AnActionEvent event) {
        runQueryAction(event, AqlDataService.QueryType.QUERY);
    }




}
