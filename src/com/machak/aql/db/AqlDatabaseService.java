package com.machak.aql.db;

import java.util.Set;

public interface AqlDatabaseService {

    Set<String> getSearchViews();

    Set<String> getCollections();

}
