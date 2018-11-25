package com.arangodb.intellij.aql.ui.renderers;

import com.arangodb.intellij.aql.util.Icons;
import com.intellij.ui.SimpleTextAttributes;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class AqlNodeModel {


    public enum Type {
        SERVER, DATABASE, COLLECTION, GRAPH, VIEW, EDGE
    }

    private String name;
    private boolean selected;
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
            return Icons.ICON_DATABASE;
        } else if (type == Type.COLLECTION) {
            return Icons.ICON_COLLECTION;
        } else if (type == Type.GRAPH) {
            return Icons.ICON_GRAPH;
        } else if (type == Type.VIEW) {
            return Icons.ICON_VIEW;
        } else if (type == Type.EDGE) {
            return Icons.ICON_EDGE;
        }
        return Icons.ICON_COLLECTION;

    }


    public SimpleTextAttributes getStyle() {
        if (selected) {
            return SimpleTextAttributes.REGULAR_BOLD_ATTRIBUTES;
        }

        // system
        if (getDisplayName().startsWith("_")) {
            return SimpleTextAttributes.GRAYED_BOLD_ATTRIBUTES;
        }
        if (type.equals(Type.COLLECTION)) {
            return SimpleTextAttributes.REGULAR_BOLD_ATTRIBUTES;
        } else if (type.equals(Type.EDGE)) {
            return SimpleTextAttributes.REGULAR_ITALIC_ATTRIBUTES;
        }
        return SimpleTextAttributes.REGULAR_ATTRIBUTES;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(final boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
