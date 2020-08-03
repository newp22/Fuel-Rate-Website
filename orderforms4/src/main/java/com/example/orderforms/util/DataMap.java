package com.example.orderforms.util;

import com.example.orderforms.dao.*;
import com.example.orderforms.service.FormDataTransfer;

import java.util.TreeMap;

public class DataMap extends TreeMap<String, Friend> {
    private static String currentUser = "";

    public DataMap(){
        super();
    }
    public void setCurrentUser(LoginForm loginForm){
        currentUser = loginForm.getUser();
    }
    public boolean accountExists(LoginForm loginForm) {
        String username = loginForm.getUser();

        if(!containsUsername(username)){
            return false;
        }else if (getFriendByUser(username).getPass().equals(loginForm.getPass())){
            return true;
        }
        return true;
    }
    public void updateUserSettings(ProfileForm profileForm){
        FormDataTransfer  dataTransfer= new FormDataTransfer();
        Friend tmp =  getFriendByUser(currentUser);

        this.put(currentUser, dataTransfer.absorbProfileForm(tmp, profileForm));
    }
    public void addNewFriend(Friend friend){
        this.put(friend.getUser(), friend);
    }
    public Friend getFriendByUser(String s){
        return this.get(s);
    }
    public boolean containsUsername(String user){
        return this.containsKey(user);
    }
    public boolean passwordsMatch(RegisterForm registerForm){
        return registerForm.getPass().equals(registerForm.getPass2());
    }
    public void addQuoteToHistory(FuelQuote fuelQuote){
        this.getFriendByUser(currentUser).getQuoteHistory().push(fuelQuote);
    }
    public boolean hasHistory(Friend friend){
        return friend.getQuoteHistory().isEmpty();
    }
}
