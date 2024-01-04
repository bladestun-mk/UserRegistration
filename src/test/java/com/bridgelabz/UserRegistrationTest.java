package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
    UserRegistrationMain ur;

    @Test
    public void testValidFirstName() {
        ur = new UserRegistrationMain();
        try {
            boolean actual = ur.analyseFName("Mrinal");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInvalidFirstName() {
        ur = new UserRegistrationMain();//less than 3 character
        try {
            boolean actual = ur.analyseFName("mo");
            Assert.assertFalse(actual);

            // Doesn't start with an uppercase letter
            actual = ur.analyseFName("mohan");
            Assert.assertFalse(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidLastName() {
        ur = new UserRegistrationMain();
        try {
            boolean actual = ur.analyseLName("Keshav");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInvalidLastName() {
        ur = new UserRegistrationMain();//less than 3 character
        try {
            boolean actual = ur.analyseLName("om");
            Assert.assertFalse(actual);

            // Doesn't start with an uppercase letter
            actual = ur.analyseLName("kumar");
            Assert.assertFalse(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEmail() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc.xyz@bl.co.in");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidPhone() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckPhone("91 9919819801");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidPasswordRule4() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckPasswordRule4("maHeshdalle@2");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail1() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc@yahoo.com");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail2() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc-100@yahoo.com");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail3() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc.100@yahoo.com");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail4() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc111@abc.com");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail5() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc-100@abc.net");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail6() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc.100@abc.com.au");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail7() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc@1.com");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail8() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc@gmail.com.com");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testValidEmail9() {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            boolean actual = ur.CheckEmail("abc+100@gmail.com");
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"I am in Happy Mood", "I am in Sad Mood"})
    public void checkHappyOrSadUsingParameterizedTest(String mood) {
        UserRegistrationMain ur = new UserRegistrationMain();
        String res = ur.analyseMood(mood);
        Assert.assertEquals("Happy", res);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
            "abc", "abc123@.com", "abc.@gmail.com", "abc123@.com.com", "abc@gmail.a"})
    public void validateEmailsUsingParameterizedTest(String emails) {
        UserRegistrationMain ur = new UserRegistrationMain();
        try {
            Boolean actual = ur.CheckEmail(emails);
            Assert.assertTrue(actual);
        } catch (UserRegistrationMain.InvalidUserDetailsException e) {
            e.printStackTrace();
        }
    }
}
