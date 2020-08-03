package com.example.orderforms.controller;

import javax.validation.Valid;

import com.example.orderforms.dao.ProfileForm;
import com.example.orderforms.dao.RegisterForm;
import com.example.orderforms.dao.FuelQuoteForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class WebController implements WebMvcConfigurer {

    @GetMapping("/registration")
    public String showForm(RegisterForm registerForm) {
        return "registration";
    }
    @GetMapping("/account-settings")
    public String showForm(ProfileForm profileForm) {
        return "account-settings";
    }
    @GetMapping("/fuel-quote-form")
    public String showForm(FuelQuoteForm fuelQuoteForm){
        return  "fuel-quote-form";
    }


}