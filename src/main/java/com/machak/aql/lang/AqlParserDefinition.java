package com.machak.aql.lang;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.machak.aql.file.AqlFile;
import com.machak.aql.grammar.AqlElementType;
import com.machak.aql.grammar.generated.AqlLexerAdapter;
import com.machak.aql.grammar.generated.AqlParser;
import com.machak.aql.grammar.generated.psi.AqlTypes;
import org.jetbrains.annotations.NotNull;

public class AqlParserDefinition implements ParserDefinition {
    public static final IElementType LINE_COMMENT = new AqlElementType("LINE_COMMENT");

    //@Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(final ASTNode left, final ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(final ASTNode left, final ASTNode right) {
        return this.spaceExistenceTypeBetweenTokens(left, right);
    }

    public static final IElementType BLOCK_COMMENT = new AqlElementType("BLOCK_COMMENT");

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(LINE_COMMENT, BLOCK_COMMENT);
    public static final TokenSet STRINGS = TokenSet.create(AqlTypes.ID);

    public static final IFileElementType FILE = new IFileElementType(Language.findInstance(AqlLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new AqlLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new AqlParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRINGS;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return AqlTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new AqlFile(viewProvider);
    }


}
