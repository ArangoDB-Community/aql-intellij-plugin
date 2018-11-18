package com.machak.aql.db;

import com.intellij.codeInsight.lookup.LookupElement;
import com.machak.aql.window.ArangoDbDataSource;

import java.util.Collection;

public interface AqlDatabaseService {

    Collection<LookupElement> getSearchViews();

    Collection<LookupElement> getCollections();

    Collection<LookupElement> getGraphs();

    void refresh(ArangoDbDataSource databaseSettings);

    Collection<LookupElement> getAll();
}
