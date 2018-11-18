package com.machak.aql.lang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.machak.aql.grammar.generated.AqlLexerAdapter;
import org.jetbrains.annotations.NotNull;

public class AqlSyntaxHighlighter extends SyntaxHighlighterBase {


    public static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];
    private static final TextAttributesKey[] LINE_COMMENT = new TextAttributesKey[]{AqlSyntaxColors.LINE_COMMENT};

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new AqlLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(final IElementType iElementType) {
        if (iElementType.equals(AqlParserDefinition.LINE_COMMENT)) {
            return LINE_COMMENT;
        }
        return EMPTY;
    }
}
