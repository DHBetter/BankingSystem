package com.bank;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        menu();

    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        Account account;
        accountManager accountmanager = new accountManager();
        User user = new User();
        int menuNumber = 0;
        while(menuNumber != 3) {
            System.out.println("");
            System.out.println("1. Create an account\n" +
                    "2. Log into account\n" +
                    "3. Exit\n");

            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    accountmanager.createAccount();
                    //Arrays.toString()
                    //accountmanager.displayAccount(0);
                    break;
                case 2:
                    System.out.println(user.cardNum());
                    break;
                case 3:
                    menuNumber = 3;
                    break;
            }
        }
    }

}

