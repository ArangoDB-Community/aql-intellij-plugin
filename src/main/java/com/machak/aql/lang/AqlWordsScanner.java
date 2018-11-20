package com.machak.aql.lang;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.psi.tree.TokenSet;
import com.machak.aql.grammar.generated.AqlLexerAdapter;
import com.machak.aql.grammar.generated.psi.AqlTypes;

public class AqlWordsScanner extends DefaultWordsScanner {
    // TODO implement..
    public AqlWordsScanner() {
        super(new AqlLexerAdapter(), TokenSet.create(AqlTypes.NAMED_KEYWORD_FUNCTIONS),
                AqlParserDefinition.STRINGS, TokenSet.create(AqlTypes.STATEMENT));
    }
}
