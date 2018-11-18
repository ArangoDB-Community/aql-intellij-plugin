package com.machak.aql.editor;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.machak.aql.file.AqlFileType;

public final class AqlKeywordElement {

    private final String keyword;

    public AqlKeywordElement(String keyword) {
        this.keyword = keyword;
    }

    public LookupElement getLookupElement() {
        return LookupElementBuilder
                .create(keyword)
                .withCaseSensitivity(false)
                .withIcon(AqlFileType.ICON)
                .bold();
    }
}
