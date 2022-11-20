package com.bank;

import java.util.Arrays;

public class accountManager {
    private int users;
    User user = new User();
    Account account;
    int numberUser = 0;
    Account accountArray[] = new Account[numberUser+1];

    public void createAccount(){
        //account = new Account(user.cardNum(),user.pinNum(),account.getBalance());

        accountArray[numberUser] = new Account(user.cardNum(),user.pinNum(),0);
        //accountArray[users] = new Account(account.getRandomCardFix(), account.getRandomPinFix(), account.getBalance());

        //storeAccount(account);
    }

    public void displayAccount(int item) {

    }


}
