package com.arangodb.intellij.aql.db;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;

import com.arangodb.ArangoDB;
import com.arangodb.ArangoDBException;
import com.arangodb.ArangoDatabase;
import com.arangodb.Protocol;
import com.arangodb.entity.CollectionEntity;
import com.arangodb.entity.CollectionType;
import com.arangodb.entity.GraphEntity;
import com.arangodb.entity.ViewEntity;
import com.arangodb.intellij.aql.actions.ActionResponse;
import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.editor.AqlKeywordElement;
import com.arangodb.intellij.aql.exc.AqlDataSourceException;
import com.arangodb.intellij.aql.model.ArangoDbDatabase;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.ui.DataWindowState;
import com.arangodb.intellij.aql.util.AqlUtils;
import com.arangodb.intellij.aql.util.Icons;
import com.arangodb.intellij.aql.util.log;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.project.Project;

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
            final ArangoDatabase db = getActiveDatabase(settings, project);
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
            log.info("Successfully refreshed ArangoDB database:", settings.getName());
        } catch (ArangoDBException e) {
            final int errorNum = e.getErrorNum() == null ? -1 : e.getErrorNum();
            if (errorNum != 11) {
                AqlUtils.popupDataSourceFix(e.getErrorMessage(), project);
                return;
            }
            log.error("Invalid ArangoDB datasource", e.getMessage());
        } catch (AqlDataSourceException e) {
            log.error("Invalid ArangoDB datasource", e.getMessage());
        }
    }

    @Override
    public boolean isConnectionValid(final Project project) {
        try {
            checkServerConnection(getServer(project), project);
        } catch (AqlDataSourceException ignore) {
            return false;
        }
        return true;
    }

    @NotNull
    @Override
    public ArangoDbServer getServer(final Project project) {


        final DataWindowState stateComponent = project.getComponent(DataWindowState.class);
        final ArangoDbServer server = stateComponent.getState();
        final AqlDataService service = AqlDataService.with(project);
        final ActionResponse response = service.testServerConnection(server);
        if (response.isError()) {
            service.sendResponse(response);
            return server;
        }
        try {
            // remove existing
            final String selectedDatabaseName = server.getSelectedDatabaseName();
            server.setDatabases(new HashSet<>());
            server.setSelectedDatabase(null);
            final Collection<String> databases = getDatabase(server).getAccessibleDatabases();
            for (final String d : databases) {
                if (server.isExcludeSystemCollections() && d.startsWith("_")) {
                    continue;
                }
                final ArangoDbDatabase arangoDbDatabase = new ArangoDbDatabase(d);
                populateSchema(server, arangoDbDatabase);
                server.addDatabase(arangoDbDatabase);
                if (selectedDatabaseName.equals(d)) {
                    server.setSelectedDatabase(arangoDbDatabase);
                }
                // always select one database
                if (server.getSelectedDatabase() == null) {
                    server.setSelectedDatabase(arangoDbDatabase);
                }

            }

        } catch (Exception | AqlDataSourceException e) {
            service.sendResponse(ActionResponse.error(e.getMessage()));
        }
        return server;
    }

    private void populateSchema(final ArangoDbServer server, final ArangoDbDatabase database) {
        final ArangoDatabase db = getDatabaseForName(server, database.getName());
        final Collection<CollectionEntity> collections = db.getCollections();
        final Collection<ViewEntity> views = db.getViews();
        final Collection<GraphEntity> graphs = db.getGraphs();
        database.setCollections(collections);
        database.setViews(views);
        database.setGraphs(graphs);
    }


    @Override
    public ArangoDatabase checkServerConnection(final ArangoDbServer settings, final Project project) throws AqlDataSourceException {
        final String user = settings.getUser();
        if (user == null) {
            throw new AqlDataSourceException("No user defined");
        }
        try {

            final ArangoDatabase db = new ArangoDB
                    .Builder()
                    .host(settings.getHost(), settings.getPort())
                    .user(user)
                    .useProtocol(Protocol.HTTP_JSON)
                    .password(settings.getPassword())
                    .useSsl(settings.isUseSsl())
                    .build().db();
            db.getPermissions(user);

            return db;
        } catch (Exception e) {
            throw new AqlDataSourceException(e);
        }
    }

    @Override
    public ArangoDatabase getDatabase(final ArangoDbServer settings) throws AqlDataSourceException {
        try {
            final String user = settings.getUser();
            return new ArangoDB
                    .Builder()
                    .host(settings.getHost(), settings.getPort())
                    .user(user)
                    .useProtocol(Protocol.HTTP_JSON)
                    .password(settings.getPassword())
                    .build().db();
        } catch (Exception e) {
            throw new AqlDataSourceException(e);
        }
    }

    @Override
    public ArangoDatabase getActiveDatabase(final ArangoDbServer settings, final Project project) throws AqlDataSourceException {
        try {
            final String user = settings.getUser();
            final ArangoDbDatabase selectedDatabase = settings.getSelectedDatabase();
            final String database = selectedDatabase == null ? null : selectedDatabase.getName();
            checkEmpty("user", project, user);
            checkEmpty("database", project, database);
            return getDatabaseForName(settings, database);
        } catch (Exception e) {
            throw new AqlDataSourceException(e);
        }
    }

    private ArangoDatabase getDatabaseForName(final ArangoDbServer settings, final String database) {
        return new ArangoDB
                .Builder()
                .host(settings.getHost(), settings.getPort())
                .user(settings.getUser())
                .useSsl(settings.isUseSsl())
                // TODO...make configurable?
                .useProtocol(Protocol.HTTP_JSON)
                .password(settings.getPassword())
                .build()
                .db(database);
    }

    private void checkEmpty(final String name, final Project project, final String value) throws AqlDataSourceException {
        if (value == null || value.trim().isEmpty()) {
            final String message = "No " + name + " set for ArangoDB data source";
            AqlUtils.popupDataSourceFix(message, project);
            throw new AqlDataSourceException(message);
        }
    }


}
