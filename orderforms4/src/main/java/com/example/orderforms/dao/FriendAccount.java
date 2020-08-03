package com.example.orderforms.dao;

import com.example.orderforms.util.HistoryStack;

//@Entity
public class FriendAccount {


    public Friend friend = new Friend();
    private HistoryStack history = new HistoryStack();

   //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private long id;


    public FriendAccount(){}
    public FriendAccount(Friend friend){
        this.friend = friend;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public void setName(String s){
        friend.setName(s);
    }

   /* public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }*/

}