package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.grammar.generated.psi.AqlPropertyName;
import com.arangodb.intellij.aql.util.Icons;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AqlContextCompletionProvider extends CompletionProvider<CompletionParameters> {

    private static final Logger log = Logger.getInstance('#' + AqlContextCompletionProvider.class.getName());

    @Override
    protected void addCompletions(@NotNull final CompletionParameters parameters,
                                  @NotNull final ProcessingContext processingContext, @NotNull final CompletionResultSet completionResultSet) {
        final PsiElement position = parameters.getPosition();
        final PsiFile containingFile = position.getContainingFile();
        final PsiElement[] psiElements = PsiTreeUtil.collectElements(containingFile,
                psiElement -> psiElement instanceof AqlPropertyName);
        final Set<PsiElement> set = new HashSet<>(Arrays.asList(psiElements));
        completionResultSet.addAllElements(set.stream()
                .map(e -> {
                            final AqlPropertyName property = (AqlPropertyName) e;
                            final Icon icon = fetchIcon(property);
                            return LookupElementBuilder
                                    .create(property.getName())
                                    .withCaseSensitivity(true)
                                    .withIcon(icon)
                                    .bold();
                        }
                ).collect(Collectors.toSet()));

    }

    private Icon fetchIcon(final AqlPropertyName property) {
        // TODO change icons for different property types...
        return Icons.ICON_ARANGO_SMALL;
    }
}
