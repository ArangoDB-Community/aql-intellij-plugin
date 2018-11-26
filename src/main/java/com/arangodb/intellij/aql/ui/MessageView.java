package com.arangodb.intellij.aql.ui;

import com.arangodb.intellij.aql.actions.ActionEventData;
import com.intellij.openapi.project.Project;

public interface MessageView {


    void onMessage(ActionEventData data, Project project);

    void onClean(Project project);
}
