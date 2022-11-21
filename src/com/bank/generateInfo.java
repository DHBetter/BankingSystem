package com.bank;
import java.util.*;
import java.util.Random;

public class generateInfo {
    Random random = new Random();
    //Account a;

    public String cardNum() {
        String BIN = "400000";
        int randomCard = random.nextInt(1000000000);
        String cardNumber = BIN + String.format("%09d", randomCard);
        int luhnVerification = 0;

        //System.out.println("generated card number: " + randomCard);

        for (int i = 0; i < cardNumber.length(); i++) {
            int item = Character.getNumericValue(cardNumber.charAt(i));
            System.out.println(item);

            int temp = 0;
            if (i%2 == 0) {
                System.out.println("charAt(i) is: " + item);
                System.out.println("temp is: " + temp);
                temp = item * 2;
                System.out.println("temp is: " + temp);
                luhnVerification = luhnVerification + temp;


            }
            else
                luhnVerification =  luhnVerification + cardNumber.charAt(i);
        }
        System.out.println(luhnVerification);
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
