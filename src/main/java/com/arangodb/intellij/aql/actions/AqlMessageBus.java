package com.arangodb.intellij.aql.actions;

import com.arangodb.ArangoCursor;
import com.arangodb.intellij.aql.db.AqlDatabaseService;
import com.arangodb.intellij.aql.exc.AqlDataSourceException;
import com.arangodb.intellij.aql.ui.ArangoDbDataSource;
import com.arangodb.intellij.aql.ui.DataWindowState;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.util.messages.MessageBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface AqlMessageBus {

    Logger log = LoggerFactory.getLogger(AqlMessageBus.class);

    class Bus {
        private final Project project;
        private final AqlDatabaseService service;
        private final MessageBus messageBus;

        public Bus(final Project project) {
            this.project = project;
            this.messageBus = project.getMessageBus();
            this.service = ServiceManager.getService(project, AqlDatabaseService.class);
        }

        public void executeQuery(final String query) {
            executeQuery(query, Collections.emptyMap());
        }

        public void executeQuery(final String query, final Map<String, Object> bindVars) {
            final DataWindowState component = project.getComponent(DataWindowState.class);
            final ArangoDbDataSource state = component.getState();
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
        }
    }
}
