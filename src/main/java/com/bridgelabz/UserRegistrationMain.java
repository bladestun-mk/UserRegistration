package com.bridgelabz;

public class UserRegistrationMain {
    private String fname;
    private String lname;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public boolean analyseFName(String fname) {
        if (fname.matches("[A-Z][a-zA-Z]{2,}")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean analyseLName(String lname) {
        if (lname.matches("[A-Z][a-zA-Z]{2,}")) {
            return true;
        } else {
            return false;
        }
    }

}
