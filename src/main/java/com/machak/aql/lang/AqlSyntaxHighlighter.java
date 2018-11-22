package com.machak.aql.lang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.machak.aql.grammar.generated.AqlLexerAdapter;
import com.machak.aql.grammar.generated.psi.AqlTypes;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AqlSyntaxHighlighter extends SyntaxHighlighterBase {


    private static final Logger log = LoggerFactory.getLogger(AqlSyntaxHighlighter.class);

    public static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];
    private static final TextAttributesKey[] LINE_COMMENT = new TextAttributesKey[]{AqlSyntaxColors.LINE_COMMENT};
    private static final TextAttributesKey[] BLOCK_COMMENT = new TextAttributesKey[]{AqlSyntaxColors.BLOCK_COMMENT};
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[]{AqlSyntaxColors.STRING};
    private static final TextAttributesKey[] FUNCTION = new TextAttributesKey[]{AqlSyntaxColors.FUNCTION};
    private static final TextAttributesKey[] KEYWORD = new TextAttributesKey[]{AqlSyntaxColors.KEYWORD};
    private static final TextAttributesKey[] PROPERTY_LOOKUP = new TextAttributesKey[]{AqlSyntaxColors.PROPERTY_LOOKUP};
    private static final TextAttributesKey[] PROPERTY_NAME = new TextAttributesKey[]{AqlSyntaxColors.PROPERTY_NAME};
    private static final TextAttributesKey[] SYSTEM_PROPERTY = new TextAttributesKey[]{AqlSyntaxColors.SYSTEM_PROPERTY};
    private static final TextAttributesKey[] VARIABLE_PLACE_HOLDER = new TextAttributesKey[]{AqlSyntaxColors.VARIABLE_PLACE_HOLDER};
    private static final TextAttributesKey[] PARAMETER_VARIABLE = new TextAttributesKey[]{AqlSyntaxColors.PARAMETER_VARIABLE};
    private static final TextAttributesKey[] BRACKETS = new TextAttributesKey[]{AqlSyntaxColors.AQL_BRACES};
    private static final TextAttributesKey[] NUMBER = new TextAttributesKey[]{AqlSyntaxColors.NUMBER};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new AqlLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(final IElementType type) {

        if (type.equals(AqlTypes.L_COMMENT)) {
            return LINE_COMMENT;
        } else if (type.equals(AqlTypes.B_COMMENT)) {
            return BLOCK_COMMENT;
        } else if (type.equals(AqlTypes.PROPERTY_LOOKUP)) {
            return PROPERTY_LOOKUP;
        } else if (type.equals(AqlTypes.T_OPEN) || type.equals(AqlTypes.T_CLOSE) || type.equals(AqlTypes.T_ARRAY_OPEN) || type.equals(AqlTypes.T_ARRAY_CLOSE)) {
            return BRACKETS;
        } else if (type.equals(AqlTypes.PROPERTY_NAME)) {
            return PROPERTY_NAME;
        } else if (type.equals(AqlTypes.VARIABLE_PLACE_HOLDER)) {
            return VARIABLE_PLACE_HOLDER;
        } else if (type.equals(AqlTypes.PARAMETER_VARIABLE)) {
            return PARAMETER_VARIABLE;
        } else if (type.equals(AqlTypes.SYSTEM_PROPERTY)) {
            return SYSTEM_PROPERTY;
        } else if (type.equals(AqlTypes.TEXT_SINGLE)) {
            return STRINGS;
        } else if (type.equals(AqlTypes.TEXT_DOUBLE)) {
            return STRINGS;
        } else if (type.equals(AqlTypes.KEYWORD_FUNCTIONS)) {
            return FUNCTION;
        } else if (type.equals(AqlTypes.ID) || type.equals(AqlTypes.T_RETURN) || type.equals(AqlTypes.T_FOR)) {
            return KEYWORD;
        } else if (type.equals(AqlTypes.INTEGER_TYPE)) {
            return NUMBER;
        }

        return EMPTY;
    }
}
