package com.bank;
import java.util.*;
import java.util.Random;

public class generateInfo {
    Random random = new Random();

    public String cardNum() {
        String BIN = "400000";
        String itemNumber = String.format("%09d",random.nextInt(1000000000));
        int luhnVerification = 0;
        String cardNumber = BIN + itemNumber;


        for (int i = 0; i < cardNumber.length(); i++) {
            int item = Character.getNumericValue(cardNumber.charAt(i));
            int temp = 0;
            if (i%2 == 0) {
                temp = item * 2;
                if ( temp > 9) {
                    temp = temp - 9;
                }
                luhnVerification = luhnVerification + temp;
            }
            else
                luhnVerification =  luhnVerification + item;
        }
        luhnVerification = 10 - luhnVerification%10 ;
        if (luhnVerification == 10) {
            luhnVerification = 0;
        }
        String cardNumberVerified = cardNumber + String.valueOf(luhnVerification);
        return cardNumberVerified;
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
