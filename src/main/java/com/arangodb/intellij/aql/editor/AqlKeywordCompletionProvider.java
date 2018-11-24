package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes;
import com.arangodb.intellij.aql.lang.AqlLanguage;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

public final class AqlKeywordCompletionProvider extends AqlCompletionProvider {

    public static final ElementPattern<PsiElement> PATTERN = PlatformPatterns
            .psiElement()
            .withLanguage(AqlLanguage.AQL_LANGUAGE)
            .andNot(PlatformPatterns.psiElement(AqlTypes.COMMENT))
            .andNot(PlatformPatterns.psiElement(AqlTypes.LINE_COMMENT));

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters,
                                  @NotNull ProcessingContext context,
                                  @NotNull CompletionResultSet result) {
        result.addAllElements(AqlKeywords.ALL);
    }
}
