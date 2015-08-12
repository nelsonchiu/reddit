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

        prnt(bank1);
        prnt(bank2);
        prnt(bank3);
        bank3.withdraw(200);

    }

    public static void prnt(BankAccount b){
        System.out.println("account num: " + b.acctnum);
        System.out.println("account fname: " + b.fname);
        System.out.println("account lname: " + b.lname);
        System.out.println("account balance: " + b.balance);
    }



}
