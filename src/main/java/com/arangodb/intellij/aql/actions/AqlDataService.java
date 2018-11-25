package com.arangodb.intellij.aql.actions;

import com.arangodb.ArangoCursor;
import com.arangodb.entity.CollectionEntity;
import com.arangodb.entity.CollectionType;
import com.arangodb.entity.GraphEntity;
import com.arangodb.entity.ViewEntity;
import com.arangodb.intellij.aql.db.AqlDatabaseService;
import com.arangodb.intellij.aql.exc.AqlDataSourceException;
import com.arangodb.intellij.aql.model.ArangoDbDatabase;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.ui.DataWindowState;
import com.arangodb.intellij.aql.ui.dialogs.AqlServerDialog;
import com.arangodb.intellij.aql.ui.renderers.AqlNodeModel;
import com.arangodb.intellij.aql.util.log;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.ui.CheckedTreeNode;
import com.intellij.util.messages.MessageBus;
import org.jetbrains.annotations.NotNull;

import javax.swing.tree.DefaultTreeModel;
import java.util.*;

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

            final ArangoCursor<String> cursor = service.getActiveDatabase(state, project).query(query, bindVars, String.class);
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
        return service.getServer(project);
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
        final ArangoDbServer state = stateComponent.getState();
        dialog.setData(state);
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
            return ActionResponse.error(e.getMessage());
        }
        return ActionResponse.info("OK");
    }

    public void sendResponse(final ActionResponse response) {
        // TODO add balloon action
        if (response.isError()) {
            log.error(response.getMessage());
        } else {
            log.info(response.getMessage());
        }

    }

    public DefaultTreeModel populateTree(@NotNull final ArangoDbServer server) {
        final AqlNodeModel userObject = new AqlNodeModel(server.getName(), server.getHost(), AqlNodeModel.Type.SERVER);
        final CheckedTreeNode root = new CheckedTreeNode(userObject);
        root.setChecked(true);
        final ArangoDbDatabase selectedDatabase = server.getSelectedDatabase() != null ? server.getSelectedDatabase() : new ArangoDbDatabase();
        final Set<ArangoDbDatabase> databases = server.getDatabases();
        for (ArangoDbDatabase database : databases) {
            final CheckedTreeNode databaseNode = new CheckedTreeNode();
            final AqlNodeModel databaseObject = new AqlNodeModel(database.getName(), database.getName(), AqlNodeModel.Type.DATABASE);
            if (selectedDatabase.equals(database)) {
                databaseObject.setSelected(true);
            }
            databaseNode.setUserObject(databaseObject);
            root.add(databaseNode);
            //  views:
            final Collection<ViewEntity> views = database.getViews();
            for (ViewEntity entity : views) {
                final CheckedTreeNode entityNode = new CheckedTreeNode();
                entityNode.setUserObject(new AqlNodeModel("", entity.getName(), AqlNodeModel.Type.VIEW));
                databaseNode.add(entityNode);
            }
            final Collection<CollectionEntity> collections = database.getCollections();
            for (CollectionEntity entity : collections) {
                final CheckedTreeNode entityNode = new CheckedTreeNode();
                final AqlNodeModel.Type collection = entity.getType() == CollectionType.EDGES ? AqlNodeModel.Type.EDGE : AqlNodeModel.Type.COLLECTION;
                entityNode.setUserObject(new AqlNodeModel("", entity.getName(), collection));
                databaseNode.add(entityNode);
            }
            final Collection<GraphEntity> graphs = database.getGraphs();
            for (GraphEntity entity : graphs) {
                final CheckedTreeNode entityNode = new CheckedTreeNode();
                entityNode.setUserObject(new AqlNodeModel("", entity.getName(), AqlNodeModel.Type.GRAPH));
                databaseNode.add(entityNode);
            }


        }
        return new DefaultTreeModel(root);
    }
}


