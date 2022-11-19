package com.bank;

import java.util.Random;

public class Account {
    public int accountNum() {

        return 0;
    }
    public int pinNum() {
        Random random = new Random();
        int number = random.nextInt(9999);
        return number;
    }
}
