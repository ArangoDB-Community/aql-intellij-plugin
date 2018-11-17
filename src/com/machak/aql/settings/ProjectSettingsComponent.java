package com.machak.aql.settings;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

public class ProjectSettingsComponent extends ApplicationSettingsComponent {


    @NotNull
    @Override
    public String getComponentName() {
        return "ProjectSettingsComponent";
    }


    @Nls
    @Override
    public String getDisplayName() {
        return "ArangoDb (Global)";
    }
}
