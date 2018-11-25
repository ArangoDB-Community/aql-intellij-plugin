package com.arangodb.intellij.aql.lang;

import com.arangodb.intellij.aql.file.AqlFile;
import com.arangodb.intellij.aql.grammar.custom.psi.AqlLexerAdapter;
import com.arangodb.intellij.aql.grammar.generated.AqlParser;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes;
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
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class AqlParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(AqlTypes.COMMENT, AqlTypes.BLOCK_COMMENT);
    public static final TokenSet STRING_LITERALS = TokenSet.create(AqlTypes.TEXT_SINGLE, AqlTypes.TEXT_DOUBLE);
    public static final IFileElementType FILE = new IFileElementType(Language.findInstance(AqlLanguage.class));


    //@Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(final ASTNode left, final ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(final ASTNode left, final ASTNode right) {
        return this.spaceExistenceTypeBetweenTokens(left, right);
    }


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
        return STRING_LITERALS;
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
