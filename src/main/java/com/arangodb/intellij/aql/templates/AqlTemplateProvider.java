package com.arangodb.intellij.aql.templates;

import org.jetbrains.annotations.Nullable;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;

public class AqlTemplateProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{"/liveTemplates/aql_document"};
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
