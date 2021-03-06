package com.arangodb.intellij.aql.editor;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;

public class AqlCodeCompletionContributor extends CompletionContributor {

    public AqlCodeCompletionContributor() {
        extend(CompletionType.BASIC, AqlKeywordCompletionProvider.PATTERN, new AqlKeywordCompletionProvider());
        extend(CompletionType.BASIC, AqlKeywordCompletionProvider.PATTERN, new AqlDatabaseCompletionProvider());
        extend(CompletionType.BASIC, AqlKeywordCompletionProvider.PATTERN, new AqlContextCompletionProvider());
    }
}
