package com.example;

/**
 * Created by nelson on 8/9/15.
 */
public class MyMainClass {

    public static void main(String [ ] args)
    {
        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount("nelson", "chiu", 120202);
        BankAccount bank3 = new BankAccount("wayne", "chiu", 123456, 300.00);

        BankAccount bank4 = new BankAccount("jing", "wei", 123213, 300.00, 400);

        BankAccount bank5 = new BankAccount("AR", "AP", 1, 300.00, 150);

    }


}
