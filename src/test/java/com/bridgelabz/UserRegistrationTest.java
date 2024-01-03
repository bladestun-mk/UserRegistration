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
    public void testValidPasswordRule4() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckPasswordRule4("maHeshdalle@2");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail1() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc@yahoo.com");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail2() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc-100@yahoo.com");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail3() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc.100@yahoo.com");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail4() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc111@abc.com");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail5() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc-100@abc.net");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail6() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc.100@abc.com.au");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail7() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc@1.com");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail8() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc@gmail.com.com");
        Assert.assertTrue(actual);
    }
    @Test
    public void testValidEmail9() {
        UserRegistrationMain ur = new UserRegistrationMain();
        boolean actual = ur.CheckEmail("abc+100@gmail.com");
        Assert.assertTrue(actual);
    }
    @ParameterizedTest
    @ValueSource(strings = {"I am in Happy Mood","I am in Sad Mood"})
    public void checkHappyOrSadUsingParameterizedTest(String mood){
        UserRegistrationMain ur = new UserRegistrationMain();
        String res = ur.analyseMood(mood);
        Assert.assertEquals("Happy",res);
    }
}
