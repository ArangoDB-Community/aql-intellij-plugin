package com.machak.aql.window.panel;

import com.intellij.json.JsonFileType;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.ui.EditorTextField;
import com.machak.aql.actions.ActionEventData;
import com.machak.aql.util.AqlUtils;
import com.machak.aql.window.MessageView;


public class JsonPanel implements Disposable, MessageView {

    private EditorTextField editor;

    public JsonPanel(final Project project) {
        final FileType instance = JsonFileType.INSTANCE;
        editor = new EditorTextField("", project, instance) {
            @Override
            protected boolean shouldHaveBorder() {
                return false;
            }

        };
        editor.setOneLineMode(false);

    }

    public EditorTextField getEditor() {
        return editor;
    }

    @Override
    public void dispose() {
        editor = null;
    }

    @Override
    public void onMessage(final ActionEventData data, final Project project) {
        final String charSequence = data.get(ActionEventData.KEY_RESULT);
        final Application application = ApplicationManager.getApplication();
        application.runWriteAction(() -> {
            final PsiFile file = AqlUtils.createDummyJsonFile(charSequence, project);
            final CodeStyleManager manager = CodeStyleManager.getInstance(project);
            final PsiElement formatted = manager.reformat(file);
            final Document document = editor.getDocument();
            document.setText(formatted.getText());
        });

    }

}
