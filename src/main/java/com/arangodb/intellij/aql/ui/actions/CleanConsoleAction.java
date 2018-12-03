/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arangodb.intellij.aql.ui.actions;

import com.arangodb.intellij.aql.actions.ActionBusEvent;
import com.arangodb.intellij.aql.actions.ActionEventData;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.ui.AnActionButton;
import com.intellij.util.messages.MessageBus;
import org.jetbrains.annotations.NotNull;

public class CleanConsoleAction extends AnActionButton {

    public CleanConsoleAction() {
        super("Clear Console", "", Icons.ICON_DELETE);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        final Project project = getEventProject(e);
        if (project == null) {
            return;
        }
        final MessageBus messageBus = project.getMessageBus();
        final ActionBusEvent event = messageBus.syncPublisher(ActionBusEvent.AQL_SYSTEM_EMPTY_LOG);
        event.onEvent(ActionEventData.EMPTY);
    }

}
