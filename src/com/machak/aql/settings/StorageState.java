package com.machak.aql.settings;

import com.intellij.openapi.components.*;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

@State(
        name = "ArangoDbProjectConfig",
        storages = {
                @Storage(value = "ArangoDbProjectConfig.xml"),
                @Storage(value = "ArangoDbProjectConfig.xml", scheme = StorageScheme.DIRECTORY_BASED)})
public class StorageState implements PersistentStateComponent<StorageState> {


    private String database;
    private String user;
    private String password;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(final String database) {
        this.database = database;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Nullable
    @Override
    public StorageState getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull StorageState state) {
        XmlSerializerUtil.copyBean(state, this);
    }

    @Nullable
    public static StorageState getInstance() {
        return ServiceManager.getService(StorageState.class);
    }

    @Nullable
    public static StorageState getInstance(Project project) {
        return ServiceManager.getService(project, StorageState.class);
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final StorageState that = (StorageState) o;
        return Objects.equals(database, that.database) &&
                Objects.equals(user, that.user) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, user, password);
    }
}
