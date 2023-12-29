package com.bridgelabz;

public class UserRegistrationMain {
    private String fname;
    UserRegistrationMain(String fname){
        this.fname = fname;
    }
    public boolean analyseFName() {
        if (fname.matches("[A-Z][a-zA-Z]{2,}")) {
            return true;
        } else {
            return false;
        }
    }
}
