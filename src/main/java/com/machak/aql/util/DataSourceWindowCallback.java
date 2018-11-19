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

package com.machak.aql.util;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.machak.aql.window.DataWindowFactory;

public class DataSourceWindowCallback implements MessageCallback {
    private final Project project;

    public DataSourceWindowCallback(final Project project) {
        this.project = project;
    }

    @Override
    public void call() {
        final ToolWindow window = ToolWindowManager.getInstance(project).getToolWindow(DataWindowFactory.ID);
        if (window != null) {
            window.activate(null, true);

        }

    }
}
