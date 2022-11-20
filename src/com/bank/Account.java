package com.bank;
//import java.util.*;

import java.util.Random;

class Account {
    private String cardNumber;
    private String pinNumber;
    private double balance;

    public Account(String newCard, String newPin, double newBalance) {
        cardNumber = newCard;
        pinNumber = newPin;
        balance = newBalance;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getPinNumber() {
        return pinNumber;
    }
    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
