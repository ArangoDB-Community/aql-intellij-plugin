package com.machak.aql.exc;

public class AqlPluginException extends Throwable {
    public AqlPluginException(final String message) {
        super(message);
    }

    public AqlPluginException(final Throwable cause) {
        super(cause);
    }

    public AqlPluginException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
