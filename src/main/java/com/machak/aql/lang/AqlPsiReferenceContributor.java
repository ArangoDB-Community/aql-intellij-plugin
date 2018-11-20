package com.machak.aql.lang;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceContributor;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.psi.PsiReferenceRegistrar;
import com.intellij.util.ProcessingContext;
import com.machak.aql.grammar.psi.AqlPsiNamedIdentifier;
import com.machak.aql.lang.psi.AqlFunctionReference;

public class AqlPsiReferenceContributor extends PsiReferenceContributor {
    public static final PsiReference[] EMPTY_REF_ARRAY = new PsiReference[0];
    @Override
    public void registerReferenceProviders(@NotNull final PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement().withLanguage(AqlLanguage.AQL_LANGUAGE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull final PsiElement element, @NotNull final ProcessingContext context) {
                        if (element instanceof AqlPsiNamedIdentifier) {
                            final AqlPsiNamedIdentifier identifier = (AqlPsiNamedIdentifier) element;
                            return new PsiReference[]{new AqlFunctionReference(identifier, new TextRange(0, element.getText().length()))};

                        }
                        return EMPTY_REF_ARRAY;
                    }
                }, 100.0d);
    }

}
