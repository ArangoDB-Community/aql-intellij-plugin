package com.machak.aql.editor;

import com.google.common.collect.Sets;
import com.intellij.codeInsight.lookup.LookupElement;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public final class AqlKeywords {

    public static final Collection<String> KEYWORDS = Sets.newHashSet(
            "FOR", "RETURN", "DESC", "ASC", "LIMIT", "SORT"
    );

    public static final List<LookupElement> KEYWORD_LOOKUP_ELEMENTS = KEYWORDS.stream()
            .map(AqlKeywordElement::new)
            .map(AqlKeywordElement::getLookupElement)
            .collect(Collectors.toList());

    private AqlKeywords() {
    }
}
