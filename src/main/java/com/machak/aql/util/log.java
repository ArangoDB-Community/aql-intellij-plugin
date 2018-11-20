package com.machak.aql.util;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;

public final class log {

    public static final String DISPLAY_ID = "AQL";

    private log() {
    }

    public static void errorAction(final String message, final String actionName, final ActionMessageCallback callback) {
        final String html = message + "<br/><a href=''>" + actionName + "</a>";
        notify(new Notification(DISPLAY_ID, DISPLAY_ID, html, NotificationType.INFORMATION, (notification, event) -> callback.call()));
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

    private static void notify(final Notification notification) {
        Notifications.Bus.notify(notification);
    }
}
