package com.machak.aql.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.machak.aql.db.AqlDatabaseService;
import com.machak.aql.lang.AqlLanguage;
import com.machak.aql.window.ArangoDbDataSource;
import com.machak.aql.window.DataWindowState;
import org.jetbrains.annotations.NotNull;

public class AqlExecuteQueryAction extends AnAction {


    @Override
    public void actionPerformed(@NotNull final AnActionEvent anActionEvent) {
        final Project project = getEventProject(anActionEvent);
        final Editor editor = anActionEvent.getData(CommonDataKeys.EDITOR_EVEN_IF_INACTIVE);
        if (project == null || editor == null) {
            return;
        }
        final PsiFile psiFile = anActionEvent.getData(CommonDataKeys.PSI_FILE);
        if (psiFile == null) {
            return;
        }
        final String id = psiFile.getLanguage().getID();
        if (!AqlLanguage.ID.equals(id)) {
            return;
        }

        final Document document = editor.getDocument();
        final CharSequence charsSequence = document.getCharsSequence();
        final DataWindowState component = project.getComponent(DataWindowState.class);
        final ArangoDbDataSource state = component.getState();
        final AqlDatabaseService service = ServiceManager.getService(project, AqlDatabaseService.class);
      /*  final ArangoCursor<JsonSerializable> cursor = service.getDatabase(state).query(charsSequence.toString(), JsonSerializable.class);
        final List<JsonSerializable> strings = cursor.asListRemaining();
        for (JsonSerializable serializable : strings) {
            log.error("service {}", serializable.toString());
        }*/

    }
}
