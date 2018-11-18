package com.machak.aql.editor;

import com.google.common.collect.Sets;
import com.intellij.codeInsight.lookup.LookupElement;
import com.machak.aql.util.Icons;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public final class AqlKeywords {

    public static final Collection<String> KEYWORDS = Sets.newHashSet(
            "SEARCH",
            "PHRASE",
            "SHORTEST_PATH",
            "REPLACE",
            "ASC",
            "AGGREGATE",
            "FILTER",
            "DESC",
            "IN",
            "INTO",
            "LIMIT",
            "UPDATE",
            "SORT",
            "GRAPH",
            "FOR",
            "LET",
            "COLLECT",
            "WITH",
            "DISTINCT",
            "RETURN",
            "UPSERT",
            "REMOVE",
            "INSERT",
            "INTERSECTION",
            "F_INTERSECTION",
            "OUTBOUND",
            "INBOUND",
            "ANY",
            "ALL",
            "NULL",
            "AND",
            "_key",
            "_id",
            "_from",
            "_to"
    );
    public static final Collection<String> FUNCTIONS = Sets.newHashSet(
            "HAS",
            "LENGTH",
            "COLLECTIONS",
            "COUNT",
            "UNION",
            "UNION_DISTINCT",
            "FIRST",
            "LAST",
            "NTH",
            "REMOVE_NTH",
            "REMOVE_VALUE",
            "REMOVE_VALUES",
            "POP",
            "PUSH",
            "SHIFT",
            "UNSHIFT",
            "SLICE",
            "SORTED",
            "SORTED_UNIQUE",
            "POSITION",
            "REVERSE",
            "MINUS",
            "COUNT_DISTINCT",
            "COUNT_UNIQUE",
            "UNIQUE",
            "INTERSECTION"
    );

    public static final List<LookupElement> KEYWORD_LOOKUP_ELEMENTS = KEYWORDS.stream()
            .map(AqlKeywordElement::new)
            .map(AqlKeywordElement::createLookupElement)
            .collect(Collectors.toList());
    public static final List<LookupElement> FUNCTION_LOOKUP_ELEMENTS = KEYWORDS.stream()
            .map(name -> {
                return new AqlKeywordElement(name, Icons.ICON_FUNCTION);
            })
            .map(AqlKeywordElement::createLookupElement)
            .collect(Collectors.toList());
    public static final List<LookupElement> ALL = KEYWORD_LOOKUP_ELEMENTS;

    static {
        ALL.addAll(FUNCTION_LOOKUP_ELEMENTS);
    }

    private AqlKeywords() {

    }
}
