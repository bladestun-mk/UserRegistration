package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationMain ur;

    @Test
    public void testValidFirstName() {
        ur = new UserRegistrationMain();
        boolean actual = ur.analyseFName("Mrinal");
        Assert.assertTrue(actual);
    }

    @Test
    public void testInvalidFirstName() {
        ur = new UserRegistrationMain();//less than 3 character
        boolean actual = ur.analyseFName("mo");
        Assert.assertFalse(actual);

       // Doesn't start with an uppercase letter
        actual = ur.analyseFName("mohan");
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidLastName(){
        ur = new UserRegistrationMain();
        boolean actual = ur.analyseFName("Keshav");
        Assert.assertTrue(actual);
    }

    @Test
    public void testInvalidLastName() {
        ur = new UserRegistrationMain();//less than 3 character
        boolean actual = ur.analyseFName("om");
        Assert.assertFalse(actual);

        // Doesn't start with an uppercase letter
        actual = ur.analyseFName("kumar");
        Assert.assertFalse(actual);
    }
    @Test
    public void testEmail() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidPhone() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckPhone("91 9919819801");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidPasswordRule3() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckPasswordRule3("maHeshdalle25");
        Assert.assertTrue(actual);
    }
}
