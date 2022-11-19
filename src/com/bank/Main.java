package com.bank;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        menu();


    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        int menuNumber = 0;
        while(menuNumber != 3) {
            System.out.println("");
            System.out.println("1. Create an account\n" +
                    "2. Log into account\n" +
                    "3. Exit\n");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println(account.cardNum());
                    System.out.println(account.pinNum());
                    break;
                case 2:

                    break;
                case 3:
                    menuNumber = 3;
                    break;
            }
        }
    }

}

