package com.machak.aql.editor;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.machak.aql.db.AqlDatabaseService;

public abstract class AqlCompletionProvider extends CompletionProvider<CompletionParameters> {

    protected void withService(CompletionParameters parameters, ProjectRunnable runnable) {
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
