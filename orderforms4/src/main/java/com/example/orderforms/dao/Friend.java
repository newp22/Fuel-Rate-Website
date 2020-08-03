package com.example.orderforms.dao;

import com.example.orderforms.util.HistoryStack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//extends location
@Entity
public class Friend {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   private HistoryStack quoteHistory;

    @NotBlank(message = "Name is mandatory")
    private String user;

    @NotEmpty
    private String pass;

    @NotEmpty
    private String pass2;

    @Max(50)
    private String name;
    private String firstName;
    private String lastName;


    private String address1;
    private String address2;
    private String city;
    private String state;


    @Size(max = 9, min = 5)
    private String Zip;

    public Friend(){

    }
    public Friend(String user, String pass) {
        this.user = user;
        this.pass = pass;
        this.pass2 = pass2;
    }

    public Friend(String user, String pass, String pass2) {
        this(user, pass);
        this.pass2 = pass2;
    }

    public HistoryStack getQuoteHistory() {
        return quoteHistory;
    }

    public void setQuoteHistory(HistoryStack quoteHistory) {
        this.quoteHistory = quoteHistory;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }


    public void setAddress2(String address2) {
        this.address2 = address2;
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
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean hasMatchingPasswords(){
        return (pass.equals(pass2));
    }

    @Override
    public String toString() {
        return "Friend{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                ", address1='" + address1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Zip='" + Zip + '\'' +
                '}';
    }
}
