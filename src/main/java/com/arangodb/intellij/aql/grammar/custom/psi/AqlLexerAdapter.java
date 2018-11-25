
package com.arangodb.intellij.aql.grammar.custom.psi;

import com.arangodb.intellij.aql.grammar.generated._AqlLexer;
import com.intellij.lexer.FlexAdapter;

public class AqlLexerAdapter extends FlexAdapter {


    public AqlLexerAdapter() {
        super(new _AqlLexer());
    }
}
