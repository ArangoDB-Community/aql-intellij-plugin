package com.arangodb.intellij.aql.ui.panels;

import com.arangodb.intellij.aql.actions.ActionEventData;
import com.arangodb.intellij.aql.ui.MessageView;
import com.arangodb.intellij.aql.util.AqlUtils;
import com.intellij.execution.impl.ConsoleViewImpl;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.json.JsonFileType;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Disposer;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.ui.EditorTextField;

import javax.swing.*;


public class JsonPanel extends ConsoleViewImpl implements Disposable, MessageView {
    final JComponent consoleComponent;
    public JsonPanel(final Project project) {
        super(project, true);
        consoleComponent = getComponent();
        Disposer.register(project, this);



    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void onMessage(final ActionEventData data, final Project project) {
        final String charSequence = data.get(ActionEventData.KEY_RESULT);
        final Application application = ApplicationManager.getApplication();
        application.runWriteAction(() -> {
            final PsiFile file = AqlUtils.createDummyJsonFile(charSequence, project);
            final CodeStyleManager manager = CodeStyleManager.getInstance(project);
            final PsiElement formatted = manager.reformat(file);
            final Document document = getEditor().getDocument();
            document.setText(formatted.getText());
        });

    }

    @Override
    public void onClean(final Project project) {
        final Application application = ApplicationManager.getApplication();
        application.runWriteAction(() -> {
            final Document document = getEditor().getDocument();
            document.setText("");
        });
    }

}
