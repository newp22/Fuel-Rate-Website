package com.example.orderforms.dao;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FuelQuoteForm {
    @Pattern(regexp = "\\d")
    private int gallonsRequested;
    private String deliveryAddress;
    @NotEmpty
    private Date deliveryDate;
    private String state;


    public FuelQuoteForm() {
    }

    public FuelQuoteForm(int gallonsRequested, String deliveryAddress, String deliveryDate) throws ParseException {
        this.gallonsRequested = gallonsRequested;
        this.deliveryAddress = deliveryAddress;
        setDeliveryDate(deliveryDate);
    }

    public FuelQuoteForm(int gallonsRequested, String deliveryAddress, String deliveryDate, String state) throws ParseException {
        this(gallonsRequested, deliveryAddress, deliveryDate);
        this.state = state;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public int getGallonsRequested() {
        return gallonsRequested;
    }

    public void setGallonsRequested(int gallonsRequested) {
        this.gallonsRequested = gallonsRequested;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.deliveryDate = format.parse(data);
    }
    public void setDeliveryAddress(){
        //get from other person
    }
}
