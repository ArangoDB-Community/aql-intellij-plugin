/*
 * Copyright 2018 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.machak.aql.actions;

import com.intellij.util.messages.Topic;

public interface ActionBusEvent {
    Topic<ActionBusEvent> AQL_QUERY_RESULT = Topic.create("AQL.QueryResult", ActionBusEvent.class);
    Topic<ActionBusEvent> AQL_META_RESULT = Topic.create("AQL.MetaResult", ActionBusEvent.class);
    Topic<ActionBusEvent> AQL_GRAPH_RESULT = Topic.create("AQL.GraphResult", ActionBusEvent.class);

    /**
     * @param query
     * @param data
     */
    void onEvent(String query, String data);
}
