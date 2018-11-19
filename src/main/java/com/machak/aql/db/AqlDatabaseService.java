package com.machak.aql.db;

import com.arangodb.ArangoDatabase;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.openapi.project.Project;
import com.machak.aql.exc.AqlPluginException;
import com.machak.aql.window.ArangoDbDataSource;

import java.util.Collection;

public interface AqlDatabaseService {

    Collection<LookupElement> getSearchViews();

    Collection<LookupElement> getCollections();

    Collection<LookupElement> getGraphs();

    void refresh(ArangoDbDataSource databaseSettings, final Project project);

    Collection<LookupElement> getAll();

    ArangoDatabase getDatabase(final ArangoDbDataSource settings, final Project project) throws AqlPluginException;
}
