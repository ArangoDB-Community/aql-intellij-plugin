package com.machak.aql.window;

import com.intellij.openapi.project.Project;
import com.machak.aql.actions.ActionEventData;

public interface MessageView {


    void onMessage(ActionEventData data, Project project);
}
