package com.example.orderforms.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncryption{
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    //Alternatively, the one-way password encoder returns the same encrypted string if you call the encoding
    // algorithm with the same password.

    private String cleanPass;
    private String hardPass;

    public String passEncrypt(String pass){
        String encodedPass = encoder.encode(pass);
        return encodedPass;
    }

    boolean passwordsMatch(String p, String h){
        return  encoder.matches(p, h);
    }

}
