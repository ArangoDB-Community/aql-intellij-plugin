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
import com.machak.aql.editor.AqlKeywordElement;
import com.machak.aql.util.Icons;
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
    private ArangoDbDataSource settings;
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
    public void refresh(final ArangoDbDataSource databaseSettings) {
        this.settings = databaseSettings;
        final ArangoDB arango = new ArangoDB
                .Builder()
                .host(settings.getHost(), settings.getPort())
                .user(settings.getUser())
                // TODO...make configurable?
                .useProtocol(Protocol.HTTP_JSON)
                .password(settings.getPassword())
                .build();
        final ArangoDatabase db = arango.db(settings.getDatabase());
        final Collection<CollectionEntity> collections = db.getCollections();
        final Collection<ViewEntity> views = db.getViews();
        final Collection<GraphEntity> graphs = db.getGraphs();
        collectionsCache.cleanUp();
        // view
        final Collection<LookupElement> viewSet = new HashSet<>();
        for (ViewEntity view : views) {
            viewSet.add(new AqlKeywordElement(view.getName()).createLookupElement());
        }
        collectionsCache.put(KEY_VIEWS, viewSet);
        // collections
        final Collection<LookupElement> collectionSet = new HashSet<>();
        for (CollectionEntity entity : collections) {
            final Icon icon = entity.getType() == CollectionType.EDGES ? Icons.ICON_EDGE : Icons.ICON_COLLECTION;
            collectionSet.add(new AqlKeywordElement(entity.getName(), icon).createLookupElement());
        }

        collectionsCache.put(KEY_COLLECTIONS, collectionSet);
        final Collection<LookupElement> graphSet = new HashSet<>();
        for (GraphEntity graph : graphs) {
            graphSet.add(new AqlKeywordElement(graph.getName(), Icons.ICON_COLLECTION).createLookupElement());
        }
        collectionsCache.put(KEY_GRAPHS, graphSet);
    }
}
