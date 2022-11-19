package com.bank;
import java.util.*;


public class Main {

    public static void main(String[] args) {


        menu();
    }
    public static String menu(){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("1. Create an account\n" +
                "2. Log into account\n" +
                "3. Exit");

        int number = scanner.nextInt();
        switch(number){
            case 1:

            case 2:
                System.out.println(account.pinNum());
                break;
            case 3:

        }
        return "dude";
    }

}

