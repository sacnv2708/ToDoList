package com.nhom6.backend.config;

/**
 * Application constants.
 */
public final class Constants {

    // Regex for acceptable logins
    public static final String ACTOR = "actor";
    public static final String LOGIN_REGEX = "^[_.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String DEFAULT_SECRET_KEY = "123456a@";

    public static final Long STATUS_DISABLED = 0L;
    public static final Long STATUS_ACTIVE = 1L;


    private Constants() {
    }
}
