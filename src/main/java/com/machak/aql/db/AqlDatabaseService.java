package com.machak.aql.db;

import com.machak.aql.window.ArangoDbDataSource;

import java.util.Set;

public interface AqlDatabaseService {

    Set<String> getSearchViews();

    Set<String> getCollections();

    void refresh(ArangoDbDataSource databaseSettings);
}
