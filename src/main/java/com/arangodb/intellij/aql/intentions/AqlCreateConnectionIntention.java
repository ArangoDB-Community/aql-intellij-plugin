package com.arangodb.intellij.aql.intentions;

import com.arangodb.intellij.aql.actions.AqlDataService;
import com.arangodb.intellij.aql.lang.AqlLanguage;
import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

public class AqlCreateConnectionIntention implements IntentionAction {


    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getText() {
        return "Create AQL database connection";
    }

    @Nls(capitalization = Nls.Capitalization.Sentence)
    @NotNull
    @Override
    public String getFamilyName() {
        return getText();
    }

    @Override
    public boolean isAvailable(@NotNull final Project project, final Editor editor, final PsiFile psiFile) {
        return psiFile.getLanguage().equals(AqlLanguage.AQL_LANGUAGE);
    }

    @Override
    public void invoke(@NotNull final Project project, final Editor editor, final PsiFile psiFile) throws IncorrectOperationException {
        AqlDataService.with(project).showServerDialog();
    }

    @Override
    public boolean startInWriteAction() {
        return false;
    }
}
