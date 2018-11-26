package com.arangodb.intellij.aql.util;

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;

import java.util.Set;

public class AqlUtilsTest extends LightPlatformCodeInsightFixtureTestCase {

    public void testParameterNames() {
        final String parameterName = "@someName";
        final String parameterName2 = "@myLimit";
        final String query = "FOR doc in TestCollection FILTER doc.name = " + parameterName + " LIMIT " + parameterName2 + " RETURN doc";
        final Set<String> parameters = AqlUtils.extractParameterNames(query, getProject());
        assertEquals(2, parameters.size());
        assertTrue(parameters.contains(parameterName));
        assertTrue(parameters.contains(parameterName2));
    }
}