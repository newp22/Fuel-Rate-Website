package com.example.orderforms.dao;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterForm {
    @NotEmpty
    private String user;
    @NotEmpty
    private String pass;
    @NotEmpty
    private String pass2;

    public RegisterForm() {
    }

    public RegisterForm(@NotEmpty String user, @NotEmpty String pass, @NotEmpty String pass2) {
        this.user = user;
        this.pass = pass;
        this.pass2 = pass2;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass2() {
        return pass2;
    }

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }
}
