package com.machak.aql.editor;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public class AqlDatabaseCompletionProvider extends AqlCompletionProvider {


    @Override
    protected void addCompletions(@NotNull final CompletionParameters completionParameters,
                                  @NotNull final ProcessingContext processingContext,
                                  @NotNull final CompletionResultSet completionResultSet) {
        executeService(completionParameters, (service -> {
            completionResultSet.addAllElements(service.getAll());
        }
        ));

    }
}
