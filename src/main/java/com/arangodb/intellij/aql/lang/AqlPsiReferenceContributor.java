package com.arangodb.intellij.aql.lang;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlMixinType;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.lang.psi.*;
import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AqlPsiReferenceContributor extends PsiReferenceContributor {
    private static final Logger log = LoggerFactory.getLogger(AqlPsiReferenceContributor.class);
    public static final PsiReference[] EMPTY_REF_ARRAY = new PsiReference[0];

    @Override
    public void registerReferenceProviders(@NotNull final PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement().withLanguage(AqlLanguage.AQL_LANGUAGE),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull final PsiElement element, @NotNull final ProcessingContext context) {
                        if (element instanceof AqlNamedElement) {
                            final AqlNamedElement identifier = (AqlNamedElement) element;
                            final TextRange rangeInElement = new TextRange(0, element.getText().length());
                            return creteReference(identifier, element, rangeInElement);


                        }
                        return EMPTY_REF_ARRAY;
                    }
                }, 100.0d);
    }


    @NotNull
    private PsiReference[] creteReference(final AqlNamedElement identifier, final PsiElement element, final TextRange rangeInElement) {
        if (identifier.getAqlType() == AqlMixinType.FUNCTION) {
            return new PsiReference[]{new AqlFunctionReference(identifier, rangeInElement)};
        } else if (identifier.getAqlType() == AqlMixinType.VAR_PARAMETER) {
            return new PsiReference[]{new AqlPropertyParameterReference(identifier, rangeInElement)};
        } else if (identifier.getAqlType() == AqlMixinType.VAR_PLACEHOLDER) {
            return new PsiReference[]{new AqlPropertyPlaceholderReference(identifier, rangeInElement)};
        } else if (identifier.getAqlType() == AqlMixinType.SYSTEM_PROPERTY) {
            return new PsiReference[]{new AqlSystemPropertyReference(identifier, rangeInElement)};
        } else if (identifier.getAqlType() == AqlMixinType.PROPERTY_LOOKUP) {
            return new PsiReference[]{new AqlPropertyLookupReference(identifier, rangeInElement)};
        } else if (identifier.getAqlType() == AqlMixinType.ID) {
            return new PsiReference[]{new AqlPropertyIdReference(identifier, rangeInElement)};
        } else if (identifier.getAqlType() == AqlMixinType.KEYWORD) {
            return new PsiReference[]{new AqlKeywordReference(identifier, rangeInElement)};
        }
        
    /*    log.info("identifier.getAqlType() {}", identifier.getAqlType());
        log.info("identifier.getAqlType() {}", element.getText());*/
        return EMPTY_REF_ARRAY;
    }


}
