package com.mateacademy.homework10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class REUtilTest {

    @Test
    public void testValidatorWithPhoneNumber() {
        boolean actual = REUtil.validator("phone number", "+38(099)22-33-11");

        assertTrue(actual);

        boolean actual2 = REUtil.validator("phone number", "+38 (063) 81-99-76");

        assertTrue(actual2);

        boolean actual3 = REUtil.validator("phone number", "+38 (067)00-00-01");

        assertTrue(actual3);
    }

    @Test
    public void testValidatorWithEmailAddress() {
        boolean actual = REUtil.validator("email address", "SomeLogin1546@gmail.com");

        assertTrue(actual);

        boolean actual2 = REUtil.validator("email address", "ababagalamaga@i.ua");

        assertTrue(actual2);

        boolean actual3 = REUtil.validator("email address", "158624@ukr.net");

        assertTrue(actual3);
    }

    @Test
    public void testValidatorWithDate() {
        boolean actual = REUtil.validator("date", "31.12.9999");

        assertTrue(actual);

        boolean actual2 = REUtil.validator("date", "01.01.0001");

        assertTrue(actual2);

        boolean actual3 = REUtil.validator("date", "26.03.2019");

        assertTrue(actual3);
    }
    @Test
    public void testValidatorWithIPv4() {
        boolean actual = REUtil.validator("IPv4", "123.123.123.1.");

        assertTrue(actual);

        boolean actual2 = REUtil.validator("IPv4", "0.0.0.0.");

        assertTrue(actual2);

        boolean actual3 = REUtil.validator("IPv4", "255.0.255.100.");

        assertTrue(actual3);
    }
}