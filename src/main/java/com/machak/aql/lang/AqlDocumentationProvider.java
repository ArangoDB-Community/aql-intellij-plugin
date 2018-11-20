

package com.machak.aql.lang;

import org.jetbrains.annotations.Nullable;

import com.intellij.lang.documentation.AbstractDocumentationProvider;
import com.intellij.psi.PsiElement;
import com.machak.aql.grammar.generated.psi.AqlKeywordFunctions;
import com.machak.aql.grammar.psi.AqlPsiNamedIdentifier;
import com.machak.aql.util.log;

public class AqlDocumentationProvider extends AbstractDocumentationProvider {
    @Nullable
    @Override
    public String getQuickNavigateInfo(final PsiElement element, final PsiElement originalElement) {
        // functions
        if (element instanceof AqlKeywordFunctions) {
            final AqlKeywordFunctions f = (AqlKeywordFunctions) element;
            final CharSequence chars = f.getNode().getChars();
            log.info("chars {}", String.valueOf(chars));
            return null;
        }
        return null;
    }

    @Override
    public String generateDoc(final PsiElement element, @Nullable final PsiElement originalElement) {
        if (element instanceof AqlPsiNamedIdentifier) {
            final AqlPsiNamedIdentifier identifier = (AqlPsiNamedIdentifier) element;
            final String name = identifier.getName();
            if (name != null) {
                log.info("name {}", name);
            }
        }
        return super.generateDoc(element, originalElement);
    }
}
