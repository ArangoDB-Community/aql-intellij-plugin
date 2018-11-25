package com.arangodb.intellij.aql.model;

import java.util.HashSet;
import java.util.Set;

public class ArangoDbServer {

    public static final int DEFAULT_PORT = 8529;
    private int port = DEFAULT_PORT;
    private boolean excludeSystemCollections = true;
    private String host = "127.0.0.1";
    private String password;
    private String user;
    private Set<ArangoDbDatabase> databases;
    private ArangoDbDatabase selectedDatabase;
    private String name;


    public ArangoDbServer() {
    }

    public ArangoDbServer(final String user, final String password) {
        this.password = password;
        this.user = user;
    }

    public ArangoDbServer(final String user, final String password, final String host) {
        this.password = password;
        this.user = user;
        this.host = host;
    }

    public boolean isExcludeSystemCollections() {
        return excludeSystemCollections;
    }

    public void setExcludeSystemCollections(final boolean excludeSystemCollections) {
        this.excludeSystemCollections = excludeSystemCollections;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }


    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public void addDatabase(final ArangoDbDatabase database) {
        if (databases == null) {
            databases = new HashSet<>();
        }
        databases.add(database);
    }

    public Set<ArangoDbDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(final Set<ArangoDbDatabase> databases) {
        this.databases = databases;
    }

    public ArangoDbDatabase getSelectedDatabase() {
        return selectedDatabase;
    }

    public void setSelectedDatabase(final ArangoDbDatabase selectedDatabase) {
        this.selectedDatabase = selectedDatabase;
    }

    public String getSelectedDatabaseName() {
        return selectedDatabase == null ? "No database selected" : selectedDatabase.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}

