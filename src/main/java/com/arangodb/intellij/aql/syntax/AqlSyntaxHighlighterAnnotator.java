package com.arangodb.intellij.aql.syntax;

import com.arangodb.intellij.aql.grammar.generated.psi.*;
import com.arangodb.intellij.aql.lang.AqlSyntaxColors;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class AqlSyntaxHighlighterAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof AqlPropertyLookup) {
            annotate(element, holder, AqlSyntaxColors.PROPERTY_LOOKUP);
        } else if (element instanceof AqlKeywordFunctions) {
            annotate(element, holder, AqlSyntaxColors.FUNCTION);
        } else if (element instanceof AqlIntegerType) {
            annotate(element, holder, AqlSyntaxColors.NUMBER);
        } else if (element instanceof AqlParameterVariable) {
            annotate(element, holder, AqlSyntaxColors.PARAMETER_VARIABLE);
        } else if (element instanceof AqlKeywordStatements) {
            annotate(element, holder, AqlSyntaxColors.KEYWORD);
        } else if (element instanceof AqlVariablePlaceHolder) {
            annotate(element, holder, AqlSyntaxColors.VARIABLE_PLACE_HOLDER);
        } else if (element instanceof AqlPropertyName) {
            annotate(element, holder, AqlSyntaxColors.PROPERTY_NAME);
        } else if (element instanceof AqlLineComment) {
            annotate(element, holder, AqlSyntaxColors.LINE_COMMENT);
        } else if (element instanceof AqlBlockComment) {
            annotate(element, holder, AqlSyntaxColors.BLOCK_COMMENT);
        }
    }


    private static void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder, @NotNull TextAttributesKey key) {
        final String description = ApplicationManager.getApplication().isUnitTestMode() ? key.getExternalName() : null;
        holder.createInfoAnnotation(element, null).setEnforcedTextAttributes(TextAttributes.ERASE_MARKER);
        holder.createInfoAnnotation(element, description).setTextAttributes(key);
    }

}
