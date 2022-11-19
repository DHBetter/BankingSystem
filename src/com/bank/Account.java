package com.bank;
//import java.util.*;

import java.util.Random;

public class Account {
    Random random = new Random();
    private String randomCardFix;
    private String randomPinFix;
    private double balance;


    public String cardNum() {
        System.out.println("");
        System.out.println("Your card has been created:");
        System.out.println("Your card number is:");
        long randomCard = random.nextLong(999999999999999L);
        randomCardFix = "4" + String.format("%15d", randomCard);
        balance = 0.0;
        return randomCardFix;
    }
    public String pinNum() {
        System.out.println("Your card PIN:");

        int randomPin = random.nextInt(9999);
        randomPinFix = String.format("%04d", randomPin);
        return randomPinFix;
    }
    public void cardCheck(String cardNum, String pinNum){
        if (cardNum.equals(randomCardFix) && pinNum.equals(randomPinFix)) {
                System.out.println("You have successfully logged in!");
        }
    }
}
