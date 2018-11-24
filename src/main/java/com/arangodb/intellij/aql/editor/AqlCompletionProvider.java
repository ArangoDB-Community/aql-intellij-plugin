package com.arangodb.intellij.aql.editor;

import com.arangodb.intellij.aql.db.AqlDatabaseService;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

public abstract class AqlCompletionProvider extends CompletionProvider<CompletionParameters> {

    protected void executeService(CompletionParameters parameters, ProjectRunnable runnable) {
        final Project project = parameters.getEditor().getProject();
        if (project != null) {
            final AqlDatabaseService ser = ServiceManager.getService(project, AqlDatabaseService.class);
            runnable.run(ser);
        }
    }

    public interface ProjectRunnable {
        void run(AqlDatabaseService service);
    }
}
