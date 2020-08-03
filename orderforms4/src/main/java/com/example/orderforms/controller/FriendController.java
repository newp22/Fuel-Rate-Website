package com.example.orderforms.controller;

import com.example.orderforms.dao.*;
//import com.example.orderforms.dao.friend.FriendAccountRepository;
import com.example.orderforms.service.FormDataTransfer;
import com.example.orderforms.util.HistoryStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.TreeMap;

@RestController
public class FriendController {
    //private static TreeMap<Friend, HistoryStack> database = new TreeMap<>();

    //@Autowired
    //FriendRepository friendRepository;
    //FormDataTransfer ftd = new FormDataTransfer();

    /*@PostMapping("/users")
    ResponseEntity<String> addUser(@Valid @RequestBody Friend friend) {
        //friendRepository.save(friend);
        // persisting the user
        return ResponseEntity.ok("User is valid");
    }*/

    /*@PostMapping("/addUser")
    public java.lang.String addFriend(String user, String pass, String pass2) {
        RegisterForm registerForm = new RegisterForm(user, pass, pass2);
        //friendRepository.save(ftd.absorbRegisterForm(new Friend(), registerForm));


        //AtomicReference<Friend> friend = new AtomicReference<>(new Friend(user, pass, pass2));
        FriendAccount friendAccount = new FriendAccount();
        friendAccount.friend.setUser(user);
        friendAccount.friend.setPass(pass);
        friendAccount.friend.setPass2(pass2);

        System.out.println(friendAccount.toString());
        if(friendAccount.friend.hasMatchingPasswords()){
           // friendRepository.save(friendAccount);

            return "<script>window.location.replace('/login'); alert('THANK YOU FOR SIGNING UP. " +
                    "you may now log into your account.');" + " " + "</script>";
        }else{
            return "your passwords do not match, please try again.";
        }
    }*/

    @GetMapping("/submitted/thanks")
    public String quoteProcessed(){
        return "<script>confirm('does this look right?'); window.location.replace('/account-overview');" +
                "</script>";
    }


    @GetMapping("/account-overview/back")
    public String loginDenied(){
        return "<script>alert('Your settings have been saved.'); window.location.replace('/account-overview');" +
                "</script>";
    }

    @GetMapping("/registration/confirmed")
    public String registrationConfirmed(){
            return "<script>window.location.replace('/login'); alert('THANK YOU FOR SIGNING UP. " +
                    "you may now log into your account.');" + " " + "</script>";
    }




}
