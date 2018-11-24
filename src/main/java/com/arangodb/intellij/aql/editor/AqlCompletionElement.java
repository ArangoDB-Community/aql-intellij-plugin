package com.arangodb.intellij.aql.editor;

import com.intellij.codeInsight.lookup.LookupElement;

public interface AqlCompletionElement {

    LookupElement createLookupElement();
}
