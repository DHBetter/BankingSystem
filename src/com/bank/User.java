package com.bank;
import java.util.*;

public class User {

    Random random = new Random();

    public String cardNum() {
        long randomCard = random.nextLong(999999999999999L);
        String cardNumber = "4" + String.format("%15d", randomCard);

        return cardNumber;
    }
    public String pinNum() {
        System.out.println("Your card PIN:");

        int randomPin = random.nextInt(9999);
        String pinNumber = String.format("%04d", randomPin);
        return pinNumber;
    }
    public void cardCheck(String cardNum, String pinNum){
        /*if (cardNum.equals(cardNum) && pinNum.equals(pinNum)) {
            System.out.println("You have successfully logged in!");
        }*/
    }
}
