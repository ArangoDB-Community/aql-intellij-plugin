package com.machak.aql.settings;

import com.intellij.openapi.components.BaseComponent;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ApplicationSettingsComponent extends BaseConfig implements BaseComponent, Configurable {

    private PluginConfiguration configPane;

    public ApplicationSettingsComponent() {
        this.state = StorageState.getInstance();
    }

    @Override
    public void initComponent() {
    }

    @Override
    public void disposeComponent() {
    }

    @NotNull
    @Override
    public String getComponentName() {
        return "ApplicationSettingsComponent";
    }


    @Nls
    @Override
    public String getDisplayName() {
        return "ArangoDb (Global)";
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return null;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        if (configPane == null) {
            configPane = new PluginConfiguration();
        }
        return configPane.createComponent();
    }

    @Override
    public boolean isModified() {
        return configPane != null && configPane.isModified(getState());
    }

    @Override
    public void apply() throws ConfigurationException {
        if (configPane != null) {
            configPane.setData(state);
        }
    }

    @Override
    public void reset() {
        if (configPane != null) {
            configPane.getData(getState());
        }
    }

    @Override
    public void disposeUIResources() {
        configPane = null;
    }


}
