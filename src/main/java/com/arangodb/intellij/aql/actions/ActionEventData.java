
package com.arangodb.intellij.aql.actions;

import java.util.HashMap;
import java.util.Map;

public class ActionEventData {

    public static final ActionEventData EMPTY = new ActionEventData();
    public static final String KEY_QUERY = "query";
    public static final String KEY_EVENT_NAME = "name";
    public static final String KEY_RESULT = "result";

    private final Map<String, String> data = new HashMap<>();

    public ActionEventData() {
    }

    public ActionEventData(final String key, String value) {
        data.put(key, value);
    }


    public ActionEventData forName(final String value) {
        data.put(KEY_EVENT_NAME, value);
        return this;
    }

    public ActionEventData set(final String key, final String value) {
        data.put(key, value);
        return this;
    }

    public String get(final String key) {
        return data.get(key);
    }
}
