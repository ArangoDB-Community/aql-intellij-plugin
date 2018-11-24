package com.arangodb.intellij.aql.db;

import com.arangodb.ArangoDatabase;
import com.arangodb.intellij.aql.exc.AqlDataSourceException;
import com.arangodb.intellij.aql.ui.ArangoDbDataSource;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.project.Project;

import java.util.Collection;

public interface AqlDatabaseService {

    Collection<LookupElement> getSearchViews();

    Collection<LookupElement> getCollections();

    Collection<LookupElement> getGraphs();

    void refresh(ArangoDbDataSource databaseSettings, final Project project);

    Collection<LookupElement> getAll();

    ArangoDatabase getDatabase(final ArangoDbDataSource settings, final Project project) throws AqlDataSourceException;
}
