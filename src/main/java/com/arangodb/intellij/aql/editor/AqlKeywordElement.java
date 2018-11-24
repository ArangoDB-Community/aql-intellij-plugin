package com.arangodb.intellij.aql.editor;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;

import javax.swing.*;

import static com.arangodb.intellij.aql.util.Icons.*;

public class AqlKeywordElement implements AqlCompletionElement {

    private final String keyword;
    private final Icon icon;

    public AqlKeywordElement(final String keyword, final Icon icon) {
        this.keyword = keyword;
        this.icon = icon;
    }

    public AqlKeywordElement(String keyword) {
        this.keyword = keyword;
        this.icon = ICON_ARANGO_SMALL;
    }

    public LookupElement createLookupElement() {
        return LookupElementBuilder
                .create(keyword)
                .withCaseSensitivity(false)
                .withIcon(icon)
                .bold();
    }
}
