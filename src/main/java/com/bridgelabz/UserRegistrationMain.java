package com.bridgelabz;

public class UserRegistrationMain {
    private String fname, lname, email, phone, password, msg;


    public static boolean analyseFName(String fname) throws InvalidUserDetailsException {
        if (fname.matches("[A-Z][a-zA-Z]{2,}")) {
            return true;
        } else
            throw new InvalidUserDetailsException("Invalid first name");
    }

    public static boolean analyseLName(String lname) throws InvalidUserDetailsException {
        if (lname.matches("[A-Z][a-zA-Z]{2,}")) {
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid last name");
        }
    }

    public static boolean CheckEmail(String email) throws InvalidUserDetailsException {
        if (email.matches("^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$")) {
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid email address");
        }
    }

    public static boolean CheckPhone(String phone) throws InvalidUserDetailsException {
        if (phone.matches("((\\+*)((0[ -]*)*|((91 )*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}")) {
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid phone number");
        }
    }

    public static boolean CheckPasswordRule4(String password) throws InvalidUserDetailsException {
        if (password.matches("^(?=.{8,}$)(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*)[^a-zA-Z0-9]([a-zA-Z0-9]*)$")) {
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



