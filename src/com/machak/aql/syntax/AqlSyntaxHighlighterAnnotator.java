package com.machak.aql.syntax;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.psi.PsiElement;
import com.machak.aql.grammar.AqlNamedElement;
import com.machak.aql.grammar.generated.psi.AqlBlockComment;
import com.machak.aql.grammar.generated.psi.AqlLineComment;
import com.machak.aql.grammar.generated.psi.AqlPropertyKeyName;
import com.machak.aql.lang.AqlSyntaxColors;
import org.jetbrains.annotations.NotNull;

public class AqlSyntaxHighlighterAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof AqlPropertyKeyName) {
            annotate(element, holder, AqlSyntaxColors.VARIABLE);
        } else if (element instanceof AqlNamedElement) {
            annotate(element, holder, AqlSyntaxColors.KEYWORD);
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
