package com.mateacademy.homework10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REUtil {

    public static boolean validator(String validatorType, String string) {
        if (validatorType.equals("phone number")) {
            Pattern pattern = Pattern.compile("^(\\+38)\\s?(\\(099\\)|\\(067\\)|\\(063\\))" +
                    "\\s?[0-9]{2}-[0-9]{2}-[0-9]{2}");
            Matcher matcher = pattern.matcher(string);
            return matcher.matches();
        }
        if (validatorType.equals("email address")) {
            Pattern pattern = Pattern.compile("[a-zA-Z0-9\\.]{1,20}@(gmail\\.com|ukr\\.net|mail\\.ru|i\\.ua)");
            Matcher matcher = pattern.matcher(string);
            return matcher.matches();
        }
        if (validatorType.equals("date")) {
            Pattern pattern = Pattern.compile("(0[0-9]|1[0-9]|2[0-9]|3[01])\\.(0[1-9]|1[012])\\.[0-9]{4}");
            Matcher matcher = pattern.matcher(string);
            return matcher.matches();
        }
        if (validatorType.equals("IPv4")) {
            Pattern pattern = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){4}");
            Matcher matcher = pattern.matcher(string);
            return matcher.matches();
        }
        return false;
    }
}
