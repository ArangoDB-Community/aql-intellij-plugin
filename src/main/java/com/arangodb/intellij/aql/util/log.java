package com.arangodb.intellij.aql.util;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.diagnostic.Logger;

public final class log {

    private static final Logger log = Logger.getInstance(log.class.getName());
    public static final String DISPLAY_ID = "AQL";

    private log() {
    }

    public static void errorAction(final String message, final String actionName, final ActionMessageCallback callback) {
        final String html = message + "<br/><a href=''>" + actionName + "</a>";
        notify(new Notification(DISPLAY_ID, DISPLAY_ID, html, NotificationType.ERROR, (notification, event) -> callback.call()));
    }


    public static void info(final String message) {
        notify(new Notification(DISPLAY_ID, DISPLAY_ID, message, NotificationType.INFORMATION));
    }


    public static void info(final String title, final String message) {
        final String content = title + "<br /><strong>" + message + "</strong>";
        notify(new Notification(DISPLAY_ID, DISPLAY_ID, content, NotificationType.INFORMATION));
    }

    public static void error(final String message) {
        notify(new Notification(DISPLAY_ID, DISPLAY_ID, message, NotificationType.ERROR));
    }

    public static void error(final String title, final String message) {
        notify(new Notification(DISPLAY_ID, DISPLAY_ID, message, NotificationType.ERROR));
    }

    public static void warn(final String message) {
        notify(new Notification(DISPLAY_ID, DISPLAY_ID, message, NotificationType.WARNING));
    }

    public static void warm(final String title, final String message) {
        notify(new Notification(DISPLAY_ID, DISPLAY_ID, message, NotificationType.WARNING));
    }

    public static void debug(final String message) {
        log.warn(message);
    }

    public static void debug(final String message, final Throwable e) {
        log.warn(message, e);
    }

    public static void debug(final String ignore, final String message) {
        log.warn(message);
    }


    private static void notify(final Notification notification) {
        Notifications.Bus.notify(notification);
    }
}
