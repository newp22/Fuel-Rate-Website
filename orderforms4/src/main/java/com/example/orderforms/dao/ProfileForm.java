package com.example.orderforms.dao;

import javax.validation.constraints.*;

public class ProfileForm {

    @Max(50)
    @NotEmpty(message = "this field cannot be empty")
    private String name;

    @Max(100)
    @NotEmpty
    private String addr;
    @Max(100)
    private String addr2;

    @Max(100)
    @NotEmpty
    private String city;
    private String state;
    @Size(min = 5, max = 9)
    private String zip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ProfileForm{" +
                "name=" + name +
                ", addr=" + addr +
                ", addr2=" + addr2 +
                ", city=" + city +
                ", state=" + state +
                ", zip=" + zip +
                '}';
    }
}
