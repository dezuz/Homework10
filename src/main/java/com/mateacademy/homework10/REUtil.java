package com.mateacademy.homework10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REUtil {
    private static final String PHONE_NUMBER_VALIDATOR = "^(\\+38)\\s?(\\(099\\)|\\(067\\)|\\(063\\))" +
            "\\s?[0-9]{2}-[0-9]{2}-[0-9]{2}";
    private static final String EMAIL_VALIDATOR = "[a-zA-Z0-9\\.]{1,20}@(gmail\\.com|ukr\\.net|mail\\.ru|i\\.ua)";
    private static final String DATE_VALIDATOR = "(0[0-9]|1[0-9]|2[0-9]|3[01])\\.(0[1-9]|1[012])\\.[0-9]{4}";
    private static final String IPV4_VALIDATOR = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){4}";
    private static Pattern pattern;

    public static boolean phoneNumberValidator(String string) {
        pattern = Pattern.compile(PHONE_NUMBER_VALIDATOR);
        Matcher matcher = pattern.matcher(string);
            return matcher.matches();
    }

    public static boolean emailValidator(String string) {
        pattern = Pattern.compile(EMAIL_VALIDATOR);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static boolean dateValidator(String string) {
        pattern = Pattern.compile(DATE_VALIDATOR);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static boolean IPv4Validator(String string) {
        pattern = Pattern.compile(IPV4_VALIDATOR);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
