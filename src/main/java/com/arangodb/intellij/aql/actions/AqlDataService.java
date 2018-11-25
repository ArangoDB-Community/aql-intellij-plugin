package com.arangodb.intellij.aql.actions;

import com.arangodb.ArangoCursor;
import com.arangodb.intellij.aql.db.AqlDatabaseService;
import com.arangodb.intellij.aql.exc.AqlDataSourceException;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.ui.DataWindowState;
import com.arangodb.intellij.aql.ui.dialogs.AqlServerDialog;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.util.messages.MessageBus;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Wrapper for all components data exchange/services.
 */
public final class AqlDataService {

    private final Project project;
    private final AqlDatabaseService service;
    private final MessageBus messageBus;
    private final DataWindowState stateComponent;

    private AqlDataService(final Project project) {
        this.project = project;
        this.messageBus = project.getMessageBus();
        this.service = ServiceManager.getService(project, AqlDatabaseService.class);
        this.stateComponent = project.getComponent(DataWindowState.class);
    }

    public static AqlDataService with(final Project project) {
        return new AqlDataService(project);
    }

    public AqlDataService executeQuery(final String query) {
        return executeQuery(query, Collections.emptyMap());
    }

    public AqlDataService executeQuery(final String query, final Map<String, Object> bindVars) {
        final DataWindowState component = project.getComponent(DataWindowState.class);
        final ArangoDbServer state = component.getState();
        try {

            final ArangoCursor<String> cursor = service.getDatabase(state, project).query(query, bindVars, String.class);
            final List<String> strings = cursor.asListRemaining();
            final StringBuilder builder = new StringBuilder();
            for (String serializable : strings) {
                builder.append(serializable);
            }
            final ActionBusEvent queryPlanEvent = messageBus.syncPublisher(ActionBusEvent.AQL_QUERY_RESULT);
            final ActionEventData data = new ActionEventData(ActionEventData.KEY_QUERY, query);
            data.set(ActionEventData.KEY_RESULT, builder.toString());
            queryPlanEvent.onEvent(data);
        } catch (AqlDataSourceException ignore) {
            // should be handled somewhere else
        }
        return this;
    }


    public ArangoDbServer server() {
        return service.getServer();
    }

    public AqlDataService refreshSchema() {
        final ActionBusEvent event = messageBus.syncPublisher(ActionBusEvent.AQL_SYSTEM_REFRESH_SCHEME);
        event.onEvent(new ActionEventData().forName(ActionBusEvent.AQL_SYSTEM_REFRESH_SCHEME.getDisplayName()));
        return this;
    }

    public AqlDataService subscribeSchemeRefresh(final ActionBusEvent event) {
        messageBus.connect().subscribe(ActionBusEvent.AQL_SYSTEM_REFRESH_SCHEME, event);
        return this;
    }


    public void showServerDialog() {
        final AqlServerDialog dialog = new AqlServerDialog(project);
        final boolean ok = dialog.showAndGet();
        if (ok) {
            final ActionResponse actionResponse = testServerConnection(dialog.getData());
            if (actionResponse.isError()) {
                dialog.showTooltip(actionResponse);
                return;
            }
            stateComponent.loadState(dialog.getData());
            refreshSchema();
        }
    }

    public ActionResponse testServerConnection(final ArangoDbServer buildState) {
        try {
            service.checkServerConnection(buildState, project);
        } catch (AqlDataSourceException e) {
            return new ActionResponse(e.getMessage(), ActionResponse.Type.ERROR);
        }
        return new ActionResponse("OK");
    }
}


