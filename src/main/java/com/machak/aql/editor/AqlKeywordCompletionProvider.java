package com.machak.aql.editor;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import com.machak.aql.lang.AqlLanguage;
import com.machak.aql.lang.AqlParserDefinition;
import org.jetbrains.annotations.NotNull;

public final class AqlKeywordCompletionProvider extends AqlCompletionProvider {

    public static final ElementPattern<PsiElement> PATTERN = PlatformPatterns
            .psiElement()
            .withLanguage(AqlLanguage.AQL_LANGUAGE)
            .andNot(PlatformPatterns.psiElement(AqlParserDefinition.LINE_COMMENT))
            .andNot(PlatformPatterns.psiElement(AqlParserDefinition.BLOCK_COMMENT));

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters,
                                  @NotNull ProcessingContext context,
                                  @NotNull CompletionResultSet result) {
        result.addAllElements(AqlKeywords.KEYWORD_LOOKUP_ELEMENTS);
    }
}
