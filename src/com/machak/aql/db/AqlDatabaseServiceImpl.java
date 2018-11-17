package com.machak.aql.db;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * TODO implement
 */
public class AqlDatabaseServiceImpl implements AqlDatabaseService {

    @Override
    public Set<String> getSearchViews() {
        return Sets.newHashSet("searchView");
    }


    @Override
    public Set<String> getCollections() {
        return Sets.newHashSet("myCollection");
    }
}
