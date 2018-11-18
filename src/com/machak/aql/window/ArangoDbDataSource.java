package com.machak.aql.window;

public class ArangoDbDataSource {

    public static final int DEFAULT_PORT = 8529;
    private int port = DEFAULT_PORT;
    private String host = "127.0.0.1";
    private String password;
    private String user;
    private String database;

    public ArangoDbDataSource() {
    }

    public ArangoDbDataSource(final String user, final String password) {
        this.password = password;
        this.user = user;
    }

    public ArangoDbDataSource(final String user, final String password, final String host) {
        this.password = password;
        this.user = user;
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(final int port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(final String database) {
        this.database = database;
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
}
