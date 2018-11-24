package com.arangodb.intellij.aql.grammar.generated;

import com.arangodb.intellij.aql.TestHelper;
import com.arangodb.intellij.aql.lang.AqlLanguage;
import com.arangodb.intellij.aql.lang.AqlParserDefinition;
import com.arangodb.intellij.aql.lang.psi.AqlASTFactory;
import com.arangodb.intellij.aql.util.AqlConst;
import com.intellij.lang.LanguageASTFactory;
import com.intellij.testFramework.ParsingTestCase;

public class AqlParserTest extends ParsingTestCase {

    public AqlParserTest() {
        super("", AqlConst.AQL_FILE_EXTENSION, new AqlParserDefinition());
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        addExplicitExtension(LanguageASTFactory.INSTANCE, AqlLanguage.AQL_LANGUAGE, new AqlASTFactory());
    }

    public void testAqlQueries() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return TestHelper.getTestResourcePath("/psi");

    }

}