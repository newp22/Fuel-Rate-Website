package com.example.orderforms.controller;

import com.example.orderforms.dao.*;
import com.example.orderforms.service.FormDataTransfer;
import com.example.orderforms.util.DataMap;
import com.example.orderforms.util.HistoryStack;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.TreeMap;


@Controller
public class FormController {
    private static DataMap database = new DataMap();
    private FormDataTransfer fdt = new FormDataTransfer();


    @PostMapping("/login/processing")
    public String accessLoginGate(@Valid LoginForm loginform, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/login?error";
        }else{
            if(database.accountExists(loginform)){
                return "redirect:/account-overview";
            }
            return "";
        }

    }

    //goes through validator first
    @PostMapping("/save-settings")
    public String updateFriendsSettings(@Valid ProfileForm profileForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "account-settings";
        }else{
            database.updateUserSettings(profileForm);
            return "redirect:/account-overview/back";
        }

    }

    @PostMapping("/processing-quote")
    public String readFormToQuote(@Valid FuelQuote fuelQuote, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "fuel-quote-form?error";
        }else{
            return "fuel-quote-form?update";
        }
    }

    @PostMapping("/submitted")
    public String quoteSubmitted(@Valid FuelQuote fuelQuote, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "fuel-quote-form?error";
        }
        database.addQuoteToHistory(fuelQuote);
        return "redirect:/submitted/thanks";
    }

    @PostMapping("/registration/submit")
    public String addFriend(@Valid RegisterForm registerForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "/registration?error";
        }
        if(!database.containsUsername(registerForm.getUser()) && database.passwordsMatch(registerForm)){
            return "redirect:/registration/confirmed";
        }
        return "";
    }


}
