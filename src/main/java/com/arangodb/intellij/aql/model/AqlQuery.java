package com.arangodb.intellij.aql.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AqlQuery {

    private String name;
    private String query;
    private Map<String, Object> parameters;

    public AqlQuery() {
    }

    public AqlQuery(final String name, final String query) {
        this.name = name;
        this.query = query;
    }

    public AqlQuery(final String name, final String query, final Map<String, Object> parameters) {
        this.name = name;
        this.query = query;
        this.parameters = parameters;
    }

    public void addParameter(final String key, final Object value) {
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

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(final Map<String, Object> parameters) {
        this.parameters = parameters;
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
        return Objects.equals(name, aqlQuery.name) &&
                Objects.equals(query, aqlQuery.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, query);
    }
}
