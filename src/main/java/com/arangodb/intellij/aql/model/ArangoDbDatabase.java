package com.arangodb.intellij.aql.model;

public class ArangoDbDatabase {


    private String name;

    public ArangoDbDatabase() {
    }

    public ArangoDbDatabase(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }


}

