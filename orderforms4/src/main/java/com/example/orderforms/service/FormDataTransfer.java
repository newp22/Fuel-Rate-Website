package com.example.orderforms.service;

import com.example.orderforms.dao.Friend;
import org.springframework.stereotype.Service;
import com.example.orderforms.dao.RegisterForm;
import com.example.orderforms.dao.ProfileForm;
;


@Service
public class FormDataTransfer {
    //@Autowired
    //private FriendAccountRepository friendRepository;

    public Friend absorbProfileForm(Friend friend, ProfileForm profileForm){
        friend.setName(profileForm.getName());
        friend.setAddress1(profileForm.getAddr());
        friend.setAddress2(profileForm.getAddr2());
        friend.setCity(profileForm.getCity());
        friend.setState(profileForm.getState());
        friend.setZip(profileForm.getZip());

        return friend;
    }

    public Friend absorbRegisterForm(Friend friend,RegisterForm registerForm){
        friend.setUser(registerForm.getUser());
        friend.setPass(registerForm.getPass());

        return friend;
    }

    /*public Decode absorbLoginForm(){

    }*/

    /*public Object absorbFuelQuoteForm(FuelQuote fuelQuote, FuelQuoteForm quoteForm){

    }*/

    /*public void addPeopleToRepo(){
        friendRepository.save(new FriendAccount<HistoryStack>(new Friend()));
    }*/



}
