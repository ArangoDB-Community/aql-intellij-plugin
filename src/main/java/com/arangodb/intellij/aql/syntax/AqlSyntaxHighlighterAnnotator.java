package com.arangodb.intellij.aql.syntax;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.arangodb.intellij.aql.grammar.custom.psi.AqlMixinType;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlNamedElement;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlBlockComment;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlLineComment;
import com.arangodb.intellij.aql.lang.AqlSyntaxColors;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiWhiteSpace;

public class AqlSyntaxHighlighterAnnotator implements Annotator {
    private static final Logger log = LoggerFactory.getLogger(AqlSyntaxHighlighterAnnotator.class);

    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof AqlNamedElement) {
            final AqlNamedElement aql = (AqlNamedElement) element;
            final AqlMixinType aqlType = aql.getAqlType();
            if (aqlType == AqlMixinType.KEYWORD) {
                annotate(element, holder, AqlSyntaxColors.KEYWORD);
            } else if (aqlType == AqlMixinType.SYSTEM_PROPERTY) {
                annotate(element, holder, AqlSyntaxColors.SYSTEM_PROPERTY);
            } else if (aqlType == AqlMixinType.FUNCTION) {
                annotate(element, holder, AqlSyntaxColors.FUNCTION);
            } else if (aqlType == AqlMixinType.VAR_PLACEHOLDER) {
                annotate(element, holder, AqlSyntaxColors.VARIABLE_PLACE_HOLDER);
            } else if (aqlType == AqlMixinType.PROPERTY_LOOKUP) {
                annotate(element, holder, AqlSyntaxColors.PROPERTY_LOOKUP);
            } else if (aqlType == AqlMixinType.VAR_PARAMETER) {
                annotate(element, holder, AqlSyntaxColors.PARAMETER_VARIABLE);
            } else if (aqlType == AqlMixinType.ID) {
                annotate(element, holder, AqlSyntaxColors.VARIABLE);
            } /*else {
                log.info("Missing aqlType {}", aqlType);
            }*/

        } else {

            if (element instanceof AqlLineComment) {
                annotate(element, holder, AqlSyntaxColors.LINE_COMMENT);
            } else if (element instanceof AqlBlockComment) {
                annotate(element, holder, AqlSyntaxColors.BLOCK_COMMENT);
            } else if (element instanceof PsiWhiteSpace) {
                final PsiWhiteSpace whiteSpace = (PsiWhiteSpace) element;
                final String text = whiteSpace.getText();
                int idx = text.indexOf("\\n");
                if (idx == -1) {
                    idx = text.indexOf("\\r");
                }
                if (idx != -1) {
                    final TextRange textRange = whiteSpace.getTextRange();
                    if (textRange != null) {
                        final String description = AqlSyntaxColors.ESCAPE_CHARACTERS.getExternalName();
                        holder.newAnnotation(HighlightSeverity.WARNING, description)
                              .range(textRange)
                              .enforcedTextAttributes(TextAttributes.ERASE_MARKER)
                              .textAttributes(AqlSyntaxColors.ESCAPE_CHARACTERS)
                              .create();

                    }

                }
            }
        }



      /*  if (element instanceof AqlPropertyLookup) {
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
        }*/
    }


    private static void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder, @NotNull TextAttributesKey key) {
        holder.newAnnotation(HighlightSeverity.WARNING, key.getExternalName())
              .range(element)
              .enforcedTextAttributes(TextAttributes.ERASE_MARKER)
              .textAttributes(key)
              .create();

    }

}
