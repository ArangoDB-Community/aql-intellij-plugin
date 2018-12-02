package com.arangodb.intellij.aql.ui;

import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@State(name = "ArangoDB.DataSource", storages = {@Storage("ArangoDB_DataSource.xml")})
public class DataWindowState implements ProjectComponent, PersistentStateComponent<ArangoDbServer> {

    private ArangoDbServer state;

    @Override
    public void loadState(@NotNull ArangoDbServer state) {
        this.state = state;
    }

    @NotNull
    @Override
    public ArangoDbServer getState() {
        if (state == null) {
            state = new ArangoDbServer();
        }
        return state;
    }

    @Override
    public void initComponent() {
        if (state == null) {
            state = new ArangoDbServer();
        }
    }

    @NotNull
    @Override
    public String getComponentName() {
        return "ArangoDB.DataSource";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final DataWindowState that = (DataWindowState) o;
        return Objects.equals(getState(), that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getState());
    }
}
