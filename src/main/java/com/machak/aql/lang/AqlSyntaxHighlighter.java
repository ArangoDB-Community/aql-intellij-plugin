package com.machak.aql.lang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.machak.aql.grammar.generated.AqlLexerAdapter;
import com.machak.aql.grammar.generated.psi.AqlTypes;
import org.jetbrains.annotations.NotNull;

public class AqlSyntaxHighlighter extends SyntaxHighlighterBase {


    public static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];
    private static final TextAttributesKey[] LINE_COMMENT = new TextAttributesKey[]{AqlSyntaxColors.LINE_COMMENT};
    private static final TextAttributesKey[] BLOCK_COMMENT = new TextAttributesKey[]{AqlSyntaxColors.BLOCK_COMMENT};
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[]{AqlSyntaxColors.STRING};
    private static final TextAttributesKey[] FUNCTION = new TextAttributesKey[]{AqlSyntaxColors.FUNCTION};
    private static final TextAttributesKey[] KEYWORD = new TextAttributesKey[]{AqlSyntaxColors.KEYWORD};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new AqlLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(final IElementType iElementType) {
        if (iElementType.equals(AqlTypes.LINE_COMMENT)) {
            return LINE_COMMENT;
        } else if (iElementType.equals(AqlTypes.BLOCK_COMMENT)) {
            return BLOCK_COMMENT;
        } else if (iElementType.equals(AqlTypes.TEXT_SINGLE)) {
            return STRINGS;
        } else if (iElementType.equals(AqlTypes.TEXT_DOUBLE)) {
            return STRINGS;
        } else if (iElementType.equals(AqlTypes.NAMED_KEYWORD_FUNCTIONS)) {
            return FUNCTION;
        } else if (iElementType.equals(AqlTypes.NAMED_KEYWORD_STATEMENTS)) {
            return KEYWORD;
        }
        return EMPTY;
    }
}
