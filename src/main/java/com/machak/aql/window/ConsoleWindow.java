/*
 * Copyright 2018 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.machak.aql.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.machak.aql.actions.ActionBusEvent;

import javax.swing.*;

public class ConsoleWindow {
    private JTextPane textPane;
    private JPanel panel;

    public ConsoleWindow(final Project project, final ToolWindow toolWindow) {
        // start receiving results
        // TODO add tabs/meta data/graphs
        project.getMessageBus()
                .connect()
                .subscribe(ActionBusEvent.AQL_QUERY_RESULT, (query, result) -> textPane.setText(query + '\n' + result));

    }

    public JComponent getContent() {
        return panel;
    }
}
