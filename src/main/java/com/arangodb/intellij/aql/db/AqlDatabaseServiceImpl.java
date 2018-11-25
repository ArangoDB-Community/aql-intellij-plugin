package com.arangodb.intellij.aql.db;

import com.arangodb.ArangoDB;
import com.arangodb.ArangoDBException;
import com.arangodb.ArangoDatabase;
import com.arangodb.Protocol;
import com.arangodb.entity.CollectionEntity;
import com.arangodb.entity.CollectionType;
import com.arangodb.entity.GraphEntity;
import com.arangodb.entity.ViewEntity;
import com.arangodb.intellij.aql.editor.AqlKeywordElement;
import com.arangodb.intellij.aql.exc.AqlDataSourceException;
import com.arangodb.intellij.aql.model.ArangoDbDatabase;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.util.DataSourceWindowCallback;
import com.arangodb.intellij.aql.util.Icons;
import com.arangodb.intellij.aql.util.log;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    public void refresh(final ArangoDbServer settings, final Project project) {
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
            log.info("Successfully refreshed ArangoDB database:", settings.getSelectedDatabaseName());
        } catch (ArangoDBException e) {
            final int errorNum = e.getErrorNum() == null ? -1 : e.getErrorNum();
            if (errorNum != 11) {
                popupFix(e.getErrorMessage(), project);
                return;
            }
            log.error("Invalid ArangoDB datasource", e.getMessage());
        } catch (AqlDataSourceException e) {
            log.error("Invalid ArangoDB datasource", e.getMessage());
        }
    }


    @Nullable
    @Override
    public ArangoDbServer getServer() {
        // TODO implement
        ArangoDbServer server = new ArangoDbServer();
        server.setName("Server name");
        final ArangoDbDatabase database = new ArangoDbDatabase("test");
        server.addDatabase(database);
        server.setSelectedDatabase(database);
        return server;
    }


    @Override
    public ArangoDatabase checkServerConnection(final ArangoDbServer settings, final Project project) throws AqlDataSourceException {
        try {
            final String user = settings.getUser();
            final ArangoDatabase db = new ArangoDB
                    .Builder()
                    .host(settings.getHost(), settings.getPort())
                    .user(user)
                    .useProtocol(Protocol.HTTP_JSON)
                    .password(settings.getPassword())
                    .build().db();
            db.getPermissions(user);

            return db;
        } catch (Exception e) {
            throw new AqlDataSourceException(e);
        }
    }

    @Override
    public ArangoDatabase getDatabase(final ArangoDbServer settings, final Project project) throws AqlDataSourceException {
        try {
            final String user = settings.getUser();
            final ArangoDbDatabase selectedDatabase = settings.getSelectedDatabase();
            final String database = selectedDatabase == null ? null : selectedDatabase.getName();
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
            throw new AqlDataSourceException(e);
        }
    }

    private void checkEmpty(final String name, final Project project, final String value) throws AqlDataSourceException {
        if (value == null || value.trim().isEmpty()) {
            final String message = "No " + name + " set for ArangoDB data source";
            popupFix(message, project);
            throw new AqlDataSourceException(message);
        }
    }


    private void popupFix(final String message, final Project project) {
        log.errorAction(message, "Fix ArangoDB data source", new DataSourceWindowCallback(project));
    }
}
