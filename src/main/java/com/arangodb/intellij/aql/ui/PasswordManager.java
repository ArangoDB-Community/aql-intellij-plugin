package com.arangodb.intellij.aql.ui;

import com.google.common.base.Throwables;
import com.intellij.credentialStore.CredentialAttributes;
import com.intellij.credentialStore.Credentials;
import com.intellij.ide.passwordSafe.PasswordSafe;
import com.intellij.openapi.ui.Messages;
import com.intellij.util.ui.UIUtil;

public final class PasswordManager {

    private static String password;

    private PasswordManager() {
    }

    public static void save(final String key, final String value) {
        UIUtil.invokeAndWaitIfNeeded(
                (Runnable) () -> {
                    try {
                        PasswordSafe.getInstance().set(new CredentialAttributes(PasswordManager.class.getName(), key), new Credentials(key, value));
                    } catch (Exception e) {
                        Messages.showErrorDialog("Cannot store password\n" + Throwables.getStackTraceAsString(e), "Error");
                    }
                }
        );
    }

    public static String load(final String key) {
        UIUtil.invokeAndWaitIfNeeded(
                (Runnable) () -> {
                    try {

                        final Credentials credentials = PasswordSafe.getInstance().get(new CredentialAttributes(PasswordManager.class.getName(), key));
                        if (credentials == null) {
                            return;
                        }
                        password = credentials.getPasswordAsString();
                    } catch (Exception e) {
                        Messages.showErrorDialog("Cannot load password" + Throwables.getStackTraceAsString(e), "Error");
                    }
                }
        );
        return password;
    }
}