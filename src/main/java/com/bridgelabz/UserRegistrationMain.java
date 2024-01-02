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
    public static Boolean CheckEmail(String email) {
        if(email.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"))
            return true;
        else
            return false;
    }
    public static Boolean CheckPhone(String phone) {
        if(phone.matches("((\\+*)((0[ -]*)*|((91 )*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}"))
            return true;
        else
            return false;
    }
    public static Boolean CheckPasswordRule1(String password) {
        if(password.matches(".{8,}"))
            return true;
        else
            return false;
    }
}
