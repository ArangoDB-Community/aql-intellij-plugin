
package com.arangodb.intellij.aql.actions;

import com.intellij.util.messages.Topic;

public interface ActionBusEvent {
    String ACTION_CONSOLE = "AQL.Action.Console";
    Topic<ActionBusEvent> AQL_QUERY_RESULT = Topic.create("AQL.QueryResult", ActionBusEvent.class);
    Topic<ActionBusEvent> AQL_QUERY_TREE_CHANGE = Topic.create("AQL.QuerySave", ActionBusEvent.class);
    Topic<ActionBusEvent> AQL_META_RESULT = Topic.create("AQL.MetaResult", ActionBusEvent.class);
    Topic<ActionBusEvent> AQL_GRAPH_RESULT = Topic.create("AQL.GraphResult", ActionBusEvent.class);
    Topic<ActionBusEvent> AQL_SYSTEM_EMPTY_LOG = Topic.create("AQL.System.EmptyLog", ActionBusEvent.class);
    Topic<ActionBusEvent> AQL_SYSTEM_REFRESH_SCHEME = Topic.create("AQL.System.RefreshScheme", ActionBusEvent.class);
    Topic<ActionBusEvent> AQL_SYSTEM_ACTIVE_DATABASE_SET = Topic.create("AQL.System.SetDatabase", ActionBusEvent.class);


    void onEvent(ActionEventData data);
}
