package com.machak.aql.lang;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.*;

public final class AqlSyntaxColors {
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey("AQL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT = createTextAttributesKey("AQL_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("AQL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);

    //
    public static final TextAttributesKey PROPERTY_LOOKUP = createTextAttributesKey("AQL_KEYWORD", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey PROPERTY_NAME = createTextAttributesKey("AQL_VARIABLE", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey SYSTEM_PROPERTY = createTextAttributesKey("AQL_VARIABLE", DefaultLanguageHighlighterColors.GLOBAL_VARIABLE);
    public static final TextAttributesKey PARAMETER_VARIABLE = createTextAttributesKey("AQL_VARIABLE", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey VARIABLE_PLACE_HOLDER = createTextAttributesKey("AQL_VARIABLE", DefaultLanguageHighlighterColors.PARAMETER);
    public static final TextAttributesKey FUNCTION = createTextAttributesKey("AQL_FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey STRING = createTextAttributesKey("AQL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("AQL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey PARAMETER = createTextAttributesKey("AQL_PARAMETER", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey OPERATION_SIGN = createTextAttributesKey("AQL_OPERATION", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey PARENTHESES = createTextAttributesKey("AQL_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey AQL_BRACES = createTextAttributesKey("AQL_CURLY_BRACES", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey SQUARE_BRACES = createTextAttributesKey("AQL_SQUARE_BRACES", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey COMMA = createTextAttributesKey("AQL_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey DOT = createTextAttributesKey("AQL_DOT", DefaultLanguageHighlighterColors.DOT);

    private AqlSyntaxColors() {
    }
}
