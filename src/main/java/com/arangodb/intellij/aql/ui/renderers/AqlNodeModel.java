package com.arangodb.intellij.aql.ui.renderers;

import com.arangodb.intellij.aql.util.Icons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class AqlNodeModel {

    public enum Type {
        SERVER, DATABASE, COLLECTION, GRAPH, VIEW, EDGE
    }

    private String name;
    private String displayName;
    private Type type = Type.COLLECTION;


    public AqlNodeModel() {
    }

    public AqlNodeModel(final String name, final String displayName, final Type type) {
        this.name = name;
        this.displayName = displayName;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public Type getType() {
        return type;
    }

    @NotNull
    public Icon getIcon() {
        if (type == null) {
            return Icons.ICON_COLLECTION;
        }
        if (type == Type.SERVER) {
            return Icons.ICON_ARANGO_SMALL;
        } else if (type == Type.DATABASE) {
            return Icons.ICON_ARANGO_SMALL;
        }
        return Icons.ICON_COLLECTION;

    }

    @Override
    public String toString() {
        return displayName;
    }
}
