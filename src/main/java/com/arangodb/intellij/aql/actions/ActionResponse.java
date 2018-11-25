package com.arangodb.intellij.aql.actions;

import com.arangodb.intellij.aql.util.Icons;

import javax.swing.*;

public class ActionResponse {

    public boolean isError() {
        return Type.ERROR == type;
    }

    public Icon getIcon() {
        return isError() ? Icons.ICON_ERROR : Icons.ICON_ARANGO;
    }

    public enum Type {
        INFO, ERROR;
    }

    private final String message;
    private final Type type;

    public ActionResponse(final String message) {
        this.message = message;
        this.type = Type.INFO;
    }

    public ActionResponse(final String message, final Type type) {
        this.message = message;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }


}
