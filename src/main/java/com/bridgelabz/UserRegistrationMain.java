package com.bridgelabz;

import java.util.function.Predicate;

public class UserRegistrationMain {
    private String fname, lname, email, phone, password, msg;

    public static Predicate<String> isvalidFirstName = s -> s.matches("[A-Z][a-zA-Z]{2,}");
    public static Predicate<String> isvalidLastName = s -> s.matches("[A-Z][a-zA-Z]{2,}");
    public static Predicate<String> isvalidEmail = s -> s.matches("^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
    public static Predicate<String> isvalidPhone = s -> s.matches("((\\+*)((0[ -]*)*|((91 )*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}");
    public static Predicate<String> isvalidPassword = s -> s.matches("^(?=.{8,}$)(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*)[^a-zA-Z0-9]([a-zA-Z0-9]*)$");
    public static boolean analyseFName(String fname) throws InvalidUserDetailsException {
        if (isvalidFirstName.test(fname)) {
            return true;
        } else
            throw new InvalidUserDetailsException("Invalid first name");
    }
    public static boolean analyseLName(String lname) throws InvalidUserDetailsException {
        if (isvalidLastName.test(lname)) {
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid last name");
        }
    }
    public static boolean CheckEmail(String email) throws InvalidUserDetailsException {
        if (isvalidEmail.test(email)) {
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid email address");
        }
    }

    public static boolean CheckPhone(String phone) throws InvalidUserDetailsException {
        if (isvalidPhone.test(phone)) {
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid phone number");
        }
    }
    public static boolean CheckPasswordRule4(String password) throws InvalidUserDetailsException {
        if (isvalidPassword.test(password)) {
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid password");
        }
    }

    public String analyseMood(String msg) {
        if (msg.contains("Sad")) {
            return "SAD";
        }
        return "Happy";
    }

    public static class InvalidUserDetailsException extends Exception {
        public InvalidUserDetailsException(String message) {
            super(message);
        }
    }


}



