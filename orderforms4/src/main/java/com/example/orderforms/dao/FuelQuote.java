package com.example.orderforms.dao;

import com.example.orderforms.dao.FuelQuoteForm;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.ParseException;
import java.util.Date;

public class FuelQuote extends FuelQuoteForm {
    private static final double PRICE_PER_GALLON = 1.50;
    private static final double PROFIT_FACTOR = 0.1;

    private Date deliveryDate;


    public FuelQuote() {
        super();
    }
    public FuelQuote(@NotNull(message = "Cannot be null") @Max(5) int gallonsRequested,
                     @NotNull() @Size(min = 8, max = 50) String deliveryAddress, String deliveryDate) throws ParseException {
        super(gallonsRequested, deliveryAddress, deliveryDate);
    }
    public double getTotalAmountDue(){
        return getGallonsRequested() * getSuggestedPrice();
    }
    public double getSuggestedPrice(){
        return PRICE_PER_GALLON *
                (calculateLocationFactor(getState()) -
                calculateRateHistoryFactor(hasHistory()) +
                calculateGallonsRequestedFactor(getGallonsRequested()) +
                PROFIT_FACTOR);
    }
    public double calculateLocationFactor(String s){
        return (s.equals("TX") ? 0.02 : 0.04);
    }
    public boolean hasHistory(){
        //
        return true;
    }
    public double calculateRateHistoryFactor(Boolean foo){
        return ((foo) ? 0.01 : 0.0);
    }
    public double calculateGallonsRequestedFactor(int x){
        return ((x > 1000) ? 0.02 : 0.03);
    }

    @Override
    public String toString() {
        return "FuelQuote{" +
                "gallonsRequested=" + getGallonsRequested() + '\'' +
                ", delivery address=" + getDeliveryAddress() + '\'' +
                ", deliveryDate=" + deliveryDate + '\'' +
                ", suggested price=" + getSuggestedPrice() + '\'' +
                ", total price=" + getTotalAmountDue() + '\'' +
                '}';
    }

}
