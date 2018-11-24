package com.arangodb.intellij.aql.lang;

import com.arangodb.intellij.aql.grammar.generated.AqlLexerAdapter;
import com.arangodb.intellij.aql.grammar.generated.psi.AqlTypes;
import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.psi.tree.TokenSet;

public class AqlWordsScanner extends DefaultWordsScanner {
    // TODO implement..
    public AqlWordsScanner() {
        super(new AqlLexerAdapter(),
                // identifier
                TokenSet.create(AqlTypes.NAMED_KEYWORD_FUNCTIONS, AqlTypes.NAMED_KEYWORD_STATEMENTS),
                // string  literals
                AqlParserDefinition.STRING_LITERALS,
                // literals
                TokenSet.create(AqlTypes.NUMBER_INTEGER, AqlTypes.STRING_TYPE, AqlTypes.T_NULL, AqlTypes.T_TRUE, AqlTypes.T_FALSE),
                // skip
                TokenSet.create(AqlTypes.OPERATOR_STATEMENTS)
        );
    }
}
