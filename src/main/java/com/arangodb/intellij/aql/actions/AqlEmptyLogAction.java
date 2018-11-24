package com.arangodb.intellij.aql.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.util.messages.MessageBus;
import org.jetbrains.annotations.NotNull;

public class AqlEmptyLogAction extends AnAction {


    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        final Project project = getEventProject(anActionEvent);
        if (project == null) {
            return;
        }
        final MessageBus messageBus = project.getMessageBus();
        final ActionBusEvent event = messageBus.syncPublisher(ActionBusEvent.AQL_SYSTEM_EMPTY_LOG);
        event.onEvent(ActionEventData.EMPTY);
    }


}
