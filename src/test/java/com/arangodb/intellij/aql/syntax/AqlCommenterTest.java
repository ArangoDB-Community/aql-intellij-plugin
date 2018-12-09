package com.arangodb.intellij.aql.syntax;

import com.arangodb.intellij.aql.TestHelper;
import com.intellij.openapi.actionSystem.IdeActions;
import com.intellij.testFramework.LightPlatformCodeInsightTestCase;
import com.intellij.testFramework.PlatformTestUtil;
import org.jetbrains.annotations.NotNull;

public class AqlCommenterTest extends LightPlatformCodeInsightTestCase {


    public void testComment() {
        configureByFile("/before" + getTestName(false) + TestHelper.EXTENSION);
        PlatformTestUtil.invokeNamedAction(IdeActions.ACTION_COMMENT_LINE);
        checkResultByFile("/after" + getTestName(false) + TestHelper.EXTENSION);
    }

    public void testBlockComment() {
        configureByFile("/before" + getTestName(false) + TestHelper.EXTENSION);
        PlatformTestUtil.invokeNamedAction(IdeActions.ACTION_SELECT_ALL);
        PlatformTestUtil.invokeNamedAction(IdeActions.ACTION_COMMENT_BLOCK);
        checkResultByFile("/after" + getTestName(false) + TestHelper.EXTENSION);
    }


    @NotNull
    @Override
    protected String getTestDataPath() {
        return TestHelper.getTestDataPath() +"comment";
    }
}