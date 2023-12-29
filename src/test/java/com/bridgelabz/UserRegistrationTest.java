package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationMain ur;

    @Test
    public void testValidFirstName() {
        ur = new UserRegistrationMain("Mrinal");
        boolean actual = ur.analyseFName();
        Assert.assertTrue(actual);
    }

    @Test
    public void testInvalidFirstName() {
        ur = new UserRegistrationMain("mo");//less than 3 character
        boolean actual = ur.analyseFName();
        Assert.assertFalse(actual);

        ur = new UserRegistrationMain("mohan"); // Doesn't start with an uppercase letter
        actual = ur.analyseFName();
        Assert.assertFalse(actual);
    }
}
