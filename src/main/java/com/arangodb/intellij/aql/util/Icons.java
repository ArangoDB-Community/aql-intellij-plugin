package com.arangodb.intellij.aql.util;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public final class Icons {


    public static final Icon ICON_PROFILE = get("/icons/profile.svg");

    public static final Icon ICON_RUN = get("/icons/run.svg");

    public static final Icon ICON_DELETE = get("/icons/trash.svg");

    public static final Icon ICON_SELECTED = get("/icons/selected.png");

    public static final Icon ICON_SYSTEM_ATTRIBUTE = get("/icons/system_attribute.svg");

    public static final Icon ICON_QUERY = get("/icons/query.svg");

    public static final Icon ICON_ERROR = get("/icons/error.png");

    public static final Icon ICON_ARANGO = get("/icons/aql.png");

    public static final Icon ICON_ARANGO_SMALL = get("/icons/aql-small.png");

    public static final Icon ICON_VIEW = get("/icons/view.png");

    public static final Icon ICON_TEXT = get("/icons/text.svg");

    public static final Icon ICON_COLLECTION = get("/icons/collection.png");

    public static final Icon ICON_EDGE = get("/icons/edge.png");

    public static final Icon ICON_GRAPH = get("/icons/graph.png");

    public static final Icon ICON_ID = get("/icons/id.png");

    public static final Icon ICON_PARAMETER = get("/icons/parameter.png");

    public static final Icon ICON_PROPERTY = get("/icons/property.png");

    public static final Icon ICON_PLACEHOLDER = get("/icons/placeholder.png");

    public static final Icon ICON_DATABASE = get("/icons/database.png");

    public static final Icon ICON_SERVER = get("/icons/server.png");

    public static final Icon ICON_EDIT = get("/icons/edit.svg");

    public static final Icon ICON_FUNCTION = get("/icons/function.png");

    private static Icon get(final String path){
        return IconLoader.getIcon(path, Icons.class);
    }
    private Icons() {
    }
}
