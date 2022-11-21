package com.bank;
import java.util.*;
import java.util.Random;

public class generateInfo {
    Random random = new Random();
    //Account a;

    public String cardNum() {
        int randomCard = random.nextInt(1000000000);
        String cardNumber = "40000" + String.format("%011d", randomCard);
        return cardNumber;
    }
    public String pinNum() {
        int randomPin = random.nextInt(9999);
        String pinNumber = String.format("%04d", randomPin);
        return pinNumber;
    }
    public void generateAccountArray(Account account, Account[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = account;
                break;
            }
        }
    }
    public boolean checkAccount(Account[] array, String cardNumber, String pin){
        boolean access = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            else if (array[i].getCardNumber().equals(cardNumber) && array[i].getPinNumber().equals(pin)){
                System.out.println("You have successfully logged in!");
                Account ac = new Account(array[i].getCardNumber(),array[i].getPinNumber(),0.0);
                access = true;
                break;
            }
        }
        if (access == false) {
            System.out.println("Your card number or pin is wrong!");
        }
        return access;
    }

}
