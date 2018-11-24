package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.lang.AqlSyntaxColors;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class AqlAnnotator implements Annotator {


    @Override
    public void annotate(@NotNull final PsiElement psiElement, @NotNull final AnnotationHolder annotationHolder) {
        if (psiElement instanceof AqlKeywordFunctions) {
            applyHighlighting(psiElement, annotationHolder, AqlSyntaxColors.FUNCTION);
        } else if (psiElement instanceof AqlKeywordStatements) {
            applyHighlighting(psiElement, annotationHolder, AqlSyntaxColors.KEYWORD);
        } else if (psiElement instanceof AqlLineComment) {
            applyHighlighting(psiElement, annotationHolder, AqlSyntaxColors.LINE_COMMENT);
        } else if (psiElement instanceof AqlBlockComment) {
            applyHighlighting(psiElement, annotationHolder, AqlSyntaxColors.BLOCK_COMMENT);
        } else if (psiElement instanceof AqlStringType) {
            applyHighlighting(psiElement, annotationHolder, AqlSyntaxColors.STRING);
        } else if (psiElement instanceof AqlIntegerType) {
            applyHighlighting(psiElement, annotationHolder, AqlSyntaxColors.NUMBER);
        } else if (psiElement instanceof AqlLimitOffset) {
            applyHighlighting(psiElement, annotationHolder, AqlSyntaxColors.AQL_BRACES);
        }
    }

    private void applyHighlighting(final PsiElement psiElement, final AnnotationHolder annotationHolder, final TextAttributesKey key) {
        annotationHolder.createInfoAnnotation(psiElement, null).setEnforcedTextAttributes(TextAttributes.ERASE_MARKER);
        annotationHolder.createInfoAnnotation(psiElement, null).setTextAttributes(key);
    }
}
