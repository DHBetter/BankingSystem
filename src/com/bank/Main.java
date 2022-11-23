package com.bank;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        generateInfo g = new generateInfo();
        boolean menuLoop = true;
        Scanner scanner = new Scanner(System.in);
        Account[] aArray = new Account[10];
        generateInfo gI = new generateInfo();
        boolean loggedLoop = true;

        while (menuLoop) {
            menu.startMenu();
            int menuNum = scanner.nextInt();
            switch (menuNum) {
                case 0:
                    menuLoop = false;
                    System.exit(0);
                    break;
                case 1:
                    Account a = new Account(g.cardNum(),g.pinNum(),0.0);
                    gI.generateAccountArray(a,aArray);
                    System.out.println("Your card has been created\n" +
                            "Your card number:\n" +
                            a.getCardNumber() + "\n" +
                            "Your card PIN:\n" +
                            a.getPinNumber());

                    break;
                case 2:
                    Account acc = new Account();
                    System.out.println("Enter your card number:");
                    String cardNumber = scanner.next();
                    System.out.println("Enter your PIN:");
                    String pinNumber = scanner.next();
                    boolean item = gI.checkAccount(aArray,cardNumber,pinNumber);
                    if (item == false) {
                        break;
                    }
                    while (loggedLoop) {
                        menu.loggedMenu();
                        int loggedIn = scanner.nextInt();
                        if (loggedIn == 0) {
                            System.exit(0);
                        }
                        else if (loggedIn == 1) {
                            System.out.println("Balance: " + acc.getBalance());
                        }
                        else if (loggedIn == 2) {
                            System.out.println("You have successfully logged out!");
                            break;
                        }

                    }
                    break;
            }

        }

    }

}

