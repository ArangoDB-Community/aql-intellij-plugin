package com.arangodb.intellij.aql.model;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AqlQuery {

    private String name;
    private String query;
    private String hash;
    private Map<String, String> parameters;

    public AqlQuery() {
    }

    public AqlQuery(final String name, final String query) {
        this.name = name;
        this.query = query;
    }

    public AqlQuery(final String name, final String query, final Map<String, String> parameters) {
        this.name = name;
        this.query = query;
        this.parameters = parameters;
    }

    public void addParameter(final String key, final String value) {
        if (parameters == null) {
            parameters = new HashMap<>();
        }
        parameters.put(key, value);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(final String query) {
        this.query = query;
    }

    @NotNull
    public Map<String, String> getParameters() {
        if (parameters == null) {
            return new HashMap<>();
        }
        return parameters;
    }

    public void setParameters(final Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(final String hash) {
        this.hash = hash;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final AqlQuery aqlQuery = (AqlQuery) o;
        return Objects.equals(hash, aqlQuery.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }
}
