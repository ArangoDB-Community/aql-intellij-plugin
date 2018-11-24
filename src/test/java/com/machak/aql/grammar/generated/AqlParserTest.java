package com.machak.aql.grammar.generated;

import com.intellij.lang.LanguageASTFactory;
import com.intellij.testFramework.ParsingTestCase;
import com.machak.aql.TestHelper;
import com.machak.aql.lang.AqlLanguage;
import com.machak.aql.lang.AqlParserDefinition;
import com.machak.aql.lang.psi.AqlASTFactory;
import com.machak.aql.util.AqlConst;

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