package com.arangodb.intellij.aql.db;

import com.arangodb.ArangoDatabase;
import com.arangodb.intellij.aql.exc.AqlDataSourceException;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public interface AqlDatabaseService {

    Collection<LookupElement> getSearchViews();

    Collection<LookupElement> getCollections();

    Collection<LookupElement> getGraphs();

    void refresh(ArangoDbServer databaseSettings, final Project project);

    Collection<LookupElement> getAll();

    ArangoDatabase checkServerConnection(ArangoDbServer settings, Project project) throws AqlDataSourceException;

    ArangoDatabase getDatabase(final ArangoDbServer settings, final Project project) throws AqlDataSourceException;

    @Nullable
    ArangoDbServer getServer();
}
