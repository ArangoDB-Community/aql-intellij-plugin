
package com.arangodb.intellij.aql.actions;

import java.util.HashMap;
import java.util.Map;

public class ActionEventData {

    public static final ActionEventData EMPTY = new ActionEventData();
    public static final String KEY_QUERY = "query";
    public static final String KEY_RESULT = "result";

    private final Map<String, String> data = new HashMap<>();

    public ActionEventData() {
    }

    public ActionEventData(final String key, String value) {
        data.put(key, value);
    }


    public void set(final String key, final String value) {
        data.put(key, value);
    }

    public String get(final String key) {
        return data.get(key);
    }
}
