package com.arangodb.intellij.aql.templates;

import org.jetbrains.annotations.NotNull;

import com.arangodb.intellij.aql.file.AqlFileType;
import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;

public class AqlTemplateContext extends TemplateContextType {
    protected AqlTemplateContext() {
        super("AQL", "AQL");
    }

    @Override
    public boolean isInContext(@NotNull final TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getFileType().equals(AqlFileType.INSTANCE);
    }
}
