

package com.machak.aql.lang;

import com.google.common.base.Charsets;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.io.CharStreams;
import com.intellij.lang.documentation.AbstractDocumentationProvider;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiElement;
import com.machak.aql.grammar.generated.psi.AqlKeywordFunctions;
import com.machak.aql.grammar.psi.AqlNamedElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class AqlDocumentationProvider extends AbstractDocumentationProvider {

    private static final Logger log = Logger.getInstance('#' + AqlDocumentationProvider.class.getName());

    private final LoadingCache<String, String> documentationCache = CacheBuilder.newBuilder()
            .maximumSize(100)
            .expireAfterWrite(20, TimeUnit.MINUTES)
            .build(new CacheLoader<String, String>() {
                @Override
                public String load(@NotNull final String key) {
                    final String notFound = "No documentation found for:" + key;
                    try (final InputStream stream = AqlDocumentationProvider.class.getResourceAsStream("/docs/" + key + ".html")) {
                        if (stream == null) {
                            return notFound;
                        }
                        return CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
                    } catch (IOException ignore) {
                        // ignore
                    }

                    return notFound;
                }
            });



    @Nullable
    @Override
    public String getQuickNavigateInfo(final PsiElement element, final PsiElement originalElement) {
        // functions
        if (element instanceof AqlKeywordFunctions) {
            final AqlKeywordFunctions f = (AqlKeywordFunctions) element;
            final CharSequence chars = f.getNode().getChars();
            return String.valueOf(chars);
        }
        return null;
    }

    @Override
    public String generateDoc(final PsiElement element, @Nullable final PsiElement originalElement) {
        if (element instanceof AqlNamedElement) {
            final AqlNamedElement identifier = (AqlNamedElement) element;
            final String name = identifier.getName();
            if (name != null) {
                return loadDocumentForName(name);
            }
        }
        return "<no documentation>";
    }

    private String loadDocumentForName(final String key) {
        try {
            return documentationCache.get(key);
        } catch (ExecutionException e) {
            log.error("Error loading documentation for: " + key, e);
        }
        return "No documentation found";
    }

}
