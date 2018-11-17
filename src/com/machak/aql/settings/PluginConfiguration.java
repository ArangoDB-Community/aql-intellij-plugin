package com.machak.aql.settings;

import com.intellij.openapi.options.BaseConfigurable;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PluginConfiguration extends BaseConfigurable {


    private JPanel mainPanel;
    private JTextField database;
    private JTextField userName;
    private JPasswordField password;


    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "ArangoDb";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return mainPanel;
    }

    @Override
    public void apply() throws ConfigurationException {

    }

    public boolean isModified(final StorageState state) {

        if (state == null) {
            return false;
        }

        final boolean db = modified(database, state.getDatabase());
        final boolean user = modified(userName, state.getDatabase());
        final boolean pass = modified(password, state.getDatabase());
        return db || user || pass;
    }

    private boolean modified(final JTextField field, final String value) {
        if (field == null) {
            return false;
        }
        final String text = field.getText();
        if (text == null) {

            return value != null;
        }
        return text.equals(value);
    }

    public void setData(final StorageState state) {
        state.setDatabase(database.getText());
        state.setUser(userName.getText());
        state.setPassword(String.valueOf(password.getPassword()));
    }

    public void getData(final StorageState state) {
        database.setText(state.getDatabase());
        userName.setText(state.getUser());
        password.setText(state.getPassword());
    }
}
