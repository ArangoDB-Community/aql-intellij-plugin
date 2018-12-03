package com.arangodb.intellij.aql.actions;

import com.arangodb.ArangoCursor;
import com.arangodb.ArangoDBException;
import com.arangodb.ArangoDatabase;
import com.arangodb.entity.*;
import com.arangodb.intellij.aql.db.AqlDatabaseService;
import com.arangodb.intellij.aql.exc.AqlDataSourceException;
import com.arangodb.intellij.aql.model.AqlQuery;
import com.arangodb.intellij.aql.model.ArangoDbDatabase;
import com.arangodb.intellij.aql.model.ArangoDbServer;
import com.arangodb.intellij.aql.ui.DataWindowState;
import com.arangodb.intellij.aql.ui.dialogs.AqlServerDialog;
import com.arangodb.intellij.aql.ui.renderers.AqlNodeModel;
import com.arangodb.intellij.aql.ui.renderers.AqlQueryModel;
import com.arangodb.intellij.aql.util.AqlUtils;
import com.arangodb.intellij.aql.util.log;
import com.arangodb.model.AqlQueryExplainOptions;
import com.google.common.base.Strings;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.ui.CheckedTreeNode;
import com.intellij.util.messages.MessageBus;
import com.intellij.util.messages.Topic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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




    public enum QueryType {
        QUERY, EXPLAIN_QUERY
    }

    private AqlDataService(final Project project) {
        this.project = project;
        this.messageBus = project.getMessageBus();
        this.service = ServiceManager.getService(project, AqlDatabaseService.class);
        this.stateComponent = project.getComponent(DataWindowState.class);
    }


    public void deleteQuery(final String name) {
        final AqlQuery aqlQuery = getQueries().get(name);
        if (aqlQuery == null) {
            log.error("No query found for: " + name);
        } else {
            final AqlQuery remove = getQueries().remove(name);
            if (remove != null) {
                log.info("Query: " + name + " deleted");
                sendEmptyMessage(ActionBusEvent.AQL_QUERY_TREE_CHANGE);
            } else {
                log.error("Failed to remove query: " + name);
            }
        }
    }

    @Nullable
    public AqlQuery getExistingQueryForValue(final String value) {
        final Collection<AqlQuery> values = getQueries().values();
        final AqlQuery our = new AqlQuery("", value);
        for (AqlQuery aqlQuery : values) {
            if (aqlQuery.equals(our)) {
                return aqlQuery;
            }

        }
        return null;
    }

    @Nullable
    public AqlQuery getExistingQueryForName(final String name) {
        return getQueries().get(name);
    }

    public boolean hasValidSettings() {
        final ArangoDbServer state = stateComponent.getState();
        if (Strings.isNullOrEmpty(state.getUser())
                || Strings.isNullOrEmpty(state.getPassword())
                || Strings.isNullOrEmpty(state.getHost())

        ) {
            return false;
        }
        return true;
    }

    public static AqlDataService with(final Project project) {
        return new AqlDataService(project);
    }

    public AqlDataService executeQuery(final String query) {
        return executeQuery(query, Collections.emptyMap(), QueryType.QUERY);
    }

    public AqlDataService saveQuery(final AqlQuery query) {
        final ArangoDbServer state = stateComponent.getState();
        // check if exists:
        if (state.getQueries().containsValue(query)) {
            return this;
        }
        final String name = AqlUtils.createFileName(query.getName(), state.getQueries());
        query.setName(name);
        query.setHash(AqlUtils.createHash(project, query.getQuery(), query.getParameters()));
        state.addQuery(query);
        sendEmptyMessage(ActionBusEvent.AQL_QUERY_TREE_CHANGE);
        return this;
    }

    public AqlDataService explainQuery(final String query) {
        return executeQuery(query, Collections.emptyMap(), QueryType.EXPLAIN_QUERY);
    }

    public AqlDataService explainQuery(final String query, final Map<String, Object> bindVars) {

        return executeQuery(query, bindVars, QueryType.EXPLAIN_QUERY);
    }

    public AqlDataService executeQuery(final String query, final Map<String, Object> bindVars) {
        return executeQuery(query, bindVars, QueryType.QUERY);
    }

    private AqlDataService executeQuery(final String query, final Map<String, Object> bindVars, final QueryType type) {
        final DataWindowState component = project.getComponent(DataWindowState.class);
        final ArangoDbServer state = component.getState();
        final ActionBusEvent queryPlanEvent = messageBus.syncPublisher(ActionBusEvent.AQL_QUERY_RESULT);
        try {

            final ArangoDatabase activeDatabase = service.getActiveDatabase(state, project);
            final String result;
            if (type == QueryType.QUERY) {
                final ArangoCursor<String> cursor = activeDatabase.query(query, bindVars, String.class);
                final List<String> strings = cursor.asListRemaining();
                final StringBuilder builder = new StringBuilder();
                for (String serializable : strings) {
                    builder.append(serializable);
                }
                result = builder.toString();
            } else {
                final AqlQueryExplainOptions options = new AqlQueryExplainOptions();
                final AqlExecutionExplainEntity explainEntity = activeDatabase.explainQuery(query, bindVars, options);
                result = AqlUtils.parseExecutionEntity(explainEntity);
            }

            final ActionEventData data = new ActionEventData(ActionEventData.KEY_QUERY, query);
            data.set(ActionEventData.KEY_RESULT, result);
            queryPlanEvent.onEvent(data);
            // save query

        } catch (ArangoDBException | AqlDataSourceException e) {
            queryPlanEvent.onEvent(new ActionEventData(ActionEventData.KEY_RESULT, e.getMessage()));
        }
        return this;
    }


    public ArangoDbServer server() {
        if (hasValidSettings()) {
            return service.getServer(project);
        }
        // return empty server
        return stateComponent.getState();
    }

    public void sendEmptyMessage(final Topic<ActionBusEvent> topic) {
        final ActionBusEvent event = messageBus.syncPublisher(topic);
        event.onEvent(ActionEventData.EMPTY);
    }

    public AqlDataService refreshSchema() {
        if (!hasValidSettings()) {
            AqlUtils.popupDataSourceFix("Setup ArangoDB connection", project);
            return this;
        }
        // trigger cache reload
        service.refresh(service.getServer(project), project);
        final ActionBusEvent event = messageBus.syncPublisher(ActionBusEvent.AQL_SYSTEM_REFRESH_SCHEME);
        event.onEvent(new ActionEventData().forName(ActionBusEvent.AQL_SYSTEM_REFRESH_SCHEME.getDisplayName()));
        return this;
    }

    public AqlDataService setActiveDatabase() {
        final ActionBusEvent event = messageBus.syncPublisher(ActionBusEvent.AQL_SYSTEM_ACTIVE_DATABASE_SET);
        event.onEvent(new ActionEventData().forName(ActionBusEvent.AQL_SYSTEM_ACTIVE_DATABASE_SET.getDisplayName()));
        return this;
    }

    public AqlDataService subscribe(final Topic<ActionBusEvent> topic, final ActionBusEvent event) {
        messageBus.connect().subscribe(topic, event);
        return this;

    }

    @NotNull
    public Map<String, AqlQuery> getQueries() {
        final ArangoDbServer state = stateComponent.getState();
        return state.getQueries();
    }


    public void showServerDialog() {
        final AqlServerDialog dialog = new AqlServerDialog(project);
        final ArangoDbServer state = stateComponent.getState();
        dialog.setData(state);
        final boolean ok = dialog.showAndGet();
        if (ok) {
            final ActionResponse actionResponse = testServerConnection(dialog.getData());
            if (actionResponse.isError()) {
                log.error(actionResponse.getMessage());
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

    public DefaultTreeModel populateQueryTree() {
        final String name = stateComponent.getState().getName();
        final AqlQueryModel queryModel = new AqlQueryModel(name, AqlQueryModel.Type.ROOT);
        final CheckedTreeNode root = new CheckedTreeNode(queryModel);
        root.setChecked(true);
        final Map<String, AqlQuery> queries = getQueries();
        for (Map.Entry<String, AqlQuery> entry : queries.entrySet()) {
            final CheckedTreeNode queryNode = new CheckedTreeNode();
            queryNode.setUserObject(new AqlQueryModel(entry.getKey(), AqlQueryModel.Type.WITH_PARAMS));
            root.add(queryNode);

        }
        return new DefaultTreeModel(root);
    }


    public DefaultTreeModel populateTree(@NotNull final ArangoDbServer server) {
        final AqlNodeModel serverObject = new AqlNodeModel(server.getName(), server.getHost(), AqlNodeModel.Type.SERVER);
        final CheckedTreeNode root = new CheckedTreeNode(serverObject);
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

    public AqlDataService setActiveDatabase(final AqlNodeModel selectedNode) {
        final ArangoDbServer state = stateComponent.getState();
        final String name = selectedNode.getName();
        state.setSelectedDatabase(new ArangoDbDatabase(name));
        log.info("New active database: " + name);
        return refreshSchema();
    }

    public boolean hasValidConnection() {
        if (hasValidSettings()) {
            return service.isConnectionValid(project);
        }
        return false;
    }
}


