package com.machak.aql.settings;

import org.jetbrains.annotations.NotNull;


public class BaseConfig {


    protected StorageState state;


    @NotNull
    public StorageState getState() {
        if (state == null) {
            return new StorageState();
        }
        return state;
    }


    public void loadState(final StorageState storageState) {
        state = storageState;
    }
}
