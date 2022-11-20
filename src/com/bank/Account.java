package com.bank;

import java.util.Random;

class Account {
    private String cardNumber;
    private String pinNumber;
    private double balance;

    Account(){
    }
    public Account(String cardNumber, String pinNumber, double balance) {
        this.cardNumber = cardNumber;
        this.pinNumber = pinNumber;
        this.balance = balance;
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
