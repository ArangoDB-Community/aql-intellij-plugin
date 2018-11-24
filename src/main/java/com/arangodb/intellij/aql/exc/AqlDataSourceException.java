package com.arangodb.intellij.aql.exc;

public class AqlDataSourceException extends Throwable {
    public AqlDataSourceException(final String message) {
        super(message);
    }

    public AqlDataSourceException(final Throwable cause) {
        super(cause);
    }

    public AqlDataSourceException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
