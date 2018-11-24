package com.arangodb.intellij.aql.window;

import com.arangodb.intellij.aql.actions.ActionEventData;
import com.intellij.openapi.project.Project;

public interface MessageView {


    void onMessage(ActionEventData data, Project project);
}
