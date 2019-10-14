package com.arangodb.intellij.aql.util;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;


import java.util.Set;

public class AqlUtilsTest extends BasePlatformTestCase {

    public void testParameterNames() {
        final String parameterName = "@someName";
        final String parameterName2 = "@myLimit";
        final String parameterName3 = "@@collection";
        final String query = "FOR doc in " + parameterName3 + " FILTER doc.name = " + parameterName + " LIMIT " + parameterName2 + " RETURN doc";
        final Set<String> parameters = AqlUtils.extractParameterNames(query, getProject());
        assertEquals(3, parameters.size());
        assertTrue(parameters.contains(parameterName));
        assertTrue(parameters.contains(parameterName2));
        assertTrue(parameters.contains(parameterName3));
    }
}