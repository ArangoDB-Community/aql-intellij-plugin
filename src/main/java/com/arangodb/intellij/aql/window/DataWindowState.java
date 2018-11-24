package com.arangodb.intellij.aql.window;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.NotNull;

@State(name = "ArangoDB.DataSource", storages = {@Storage("ArangoDB_DataSource.xml")})
public class DataWindowState implements ProjectComponent, PersistentStateComponent<ArangoDbDataSource> {

    private ArangoDbDataSource state;

    @Override
    public void loadState(ArangoDbDataSource state) {
        this.state = state;
    }

    @NotNull
    @Override
    public ArangoDbDataSource getState() {
        if (state == null) {
            state = new ArangoDbDataSource();
        }
        return state;
    }

    @Override
    public void initComponent() {
        if (state == null) {
            state = new ArangoDbDataSource();
        }
    }

    @NotNull
    @Override
    public String getComponentName() {
        return "ArangoDB.DataSource";
    }
}
