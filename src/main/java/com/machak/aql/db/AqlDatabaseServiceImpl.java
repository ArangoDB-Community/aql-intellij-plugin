package com.machak.aql.db;

import com.arangodb.ArangoDB;
import com.arangodb.ArangoDatabase;
import com.arangodb.Protocol;
import com.arangodb.entity.CollectionEntity;
import com.arangodb.entity.CollectionType;
import com.arangodb.entity.GraphEntity;
import com.arangodb.entity.ViewEntity;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.project.Project;
import com.machak.aql.editor.AqlKeywordElement;
import com.machak.aql.exc.AqlPluginException;
import com.machak.aql.util.DataSourceWindowCallback;
import com.machak.aql.util.Icons;
import com.machak.aql.util.log;
import com.machak.aql.window.ArangoDbDataSource;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/**
 * TODO implement
 */
public class AqlDatabaseServiceImpl implements AqlDatabaseService {

    public static final String KEY_COLLECTIONS = "collections";
    public static final String KEY_VIEWS = "views";
    public static final String KEY_GRAPHS = "graph";

    final Cache<String, Collection<LookupElement>> collectionsCache = CacheBuilder.newBuilder()
            .expireAfterWrite(10, TimeUnit.DAYS)
            .maximumSize(10)
            .build();

    @Override
    public Collection<LookupElement> getAll() {
        final Collection<LookupElement> lookupElements = getCollections();
        lookupElements.addAll(getSearchViews());
        lookupElements.addAll(getGraphs());
        return lookupElements;
    }

    @Override
    public Collection<LookupElement> getSearchViews() {
        return getLookupElements(KEY_VIEWS);
    }

    @Override
    public Collection<LookupElement> getCollections() {
        return getLookupElements(KEY_COLLECTIONS);
    }

    @Override
    public Collection<LookupElement> getGraphs() {
        return getLookupElements(KEY_GRAPHS);
    }

    @NotNull
    private Collection<LookupElement> getLookupElements(final String keyViews) {
        final Collection<LookupElement> ifPresent = collectionsCache.getIfPresent(keyViews);
        return ifPresent == null ? Collections.emptyList() : ifPresent;
    }


    @Override
    public void refresh(final ArangoDbDataSource settings, final Project project) {
        try {
            // always cleanup cache
            collectionsCache.cleanUp();
            final ArangoDatabase db = getDatabase(settings, project);
            final Collection<CollectionEntity> collections = db.getCollections();
            final Collection<ViewEntity> views = db.getViews();
            final Collection<GraphEntity> graphs = db.getGraphs();

            // view
            final Collection<LookupElement> viewSet = new HashSet<>();
            for (ViewEntity view : views) {
                viewSet.add(new AqlKeywordElement(view.getName(), Icons.ICON_VIEW).createLookupElement());
            }
            collectionsCache.put(KEY_VIEWS, viewSet);
            // collections
            final Collection<LookupElement> collectionSet = new HashSet<>();
            for (CollectionEntity entity : collections) {
                final Icon icon = entity.getType() == CollectionType.EDGES ? Icons.ICON_EDGE : Icons.ICON_COLLECTION;
                final String name = entity.getName();
                // skip system collections  if defined
                if (settings.isExcludeSystemCollections() && name.startsWith("_")) {
                    continue;
                }
                collectionSet.add(new AqlKeywordElement(name, icon).createLookupElement());
            }

            collectionsCache.put(KEY_COLLECTIONS, collectionSet);
            final Collection<LookupElement> graphSet = new HashSet<>();
            for (GraphEntity graph : graphs) {
                graphSet.add(new AqlKeywordElement(graph.getName(), Icons.ICON_GRAPH).createLookupElement());
            }
            collectionsCache.put(KEY_GRAPHS, graphSet);
            log.info("Successfully refreshed ArangoDB database:", settings.getDatabase());
        } catch (AqlPluginException e) {
            log.error("Invalid ArangoDB datasource", e.getMessage());
        }
    }

    @Override
    public ArangoDatabase getDatabase(final ArangoDbDataSource settings, final Project project) throws AqlPluginException {
        try {
            final String user = settings.getUser();
            final String database = settings.getDatabase();
            checkEmpty("user", project, user);
            checkEmpty("database", project, database);
            return new ArangoDB
                    .Builder()
                    .host(settings.getHost(), settings.getPort())
                    .user(user)
                    // TODO...make configurable?
                    .useProtocol(Protocol.HTTP_JSON)
                    .password(settings.getPassword())
                    .build().db(database);
        } catch (Exception e) {
            throw new AqlPluginException(e);
        }
    }

    private void checkEmpty(final String name, final Project project, final String user) throws AqlPluginException {
        if (user == null || user.trim().isEmpty()) {
            final String message = "No " + name + " set for ArangoDB data source";
            log.errorAction(message, "Fix ArangoDB data source", new DataSourceWindowCallback(project));
            throw new AqlPluginException(message);
        }
    }
}
