package com.arangodb.intellij.aql.model;

import com.arangodb.entity.CollectionEntity;
import com.arangodb.entity.GraphEntity;
import com.arangodb.entity.ViewEntity;

import java.util.Collection;
import java.util.Objects;

public class ArangoDbDatabase {


    private String name;
    private Collection<CollectionEntity> collections;
    private Collection<GraphEntity> graphs;
    private Collection<ViewEntity> views;

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


    public void setCollections(final Collection<CollectionEntity> collections) {
        this.collections = collections;
    }

    public Collection<CollectionEntity> getCollections() {
        return collections;
    }

    public void setGraphs(final Collection<GraphEntity> graphs) {
        this.graphs = graphs;
    }

    public Collection<GraphEntity> getGraphs() {
        return graphs;
    }

    public void setViews(final Collection<ViewEntity> views) {
        this.views = views;
    }

    public Collection<ViewEntity> getViews() {
        return views;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ArangoDbDatabase that = (ArangoDbDatabase) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(collections, that.collections) &&
                Objects.equals(graphs, that.graphs) &&
                Objects.equals(views, that.views);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, collections, graphs, views);
    }
}

