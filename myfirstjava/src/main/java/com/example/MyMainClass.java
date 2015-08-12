package com.example;

/**
 * Created by nelson on 8/9/15.
 */
public class MyMainClass {

    public static void main(String [ ] args)
    {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("nelson", "chiu", 120202);
        BankAccount b3 = new BankAccount("wayne", "chiu", 123456, 300.00);

        /*
        prnt(b1);
        prnt(b2);
        prnt(b3);

        b2.transfer(b3,100);
        prnt(b2);
        prnt(b3);
        */
        b1.printNA();
        b2.printNA();
        b3.printNA();


    }

    public static void prnt(BankAccount b){
        System.out.println("account num: " + b.acctnum);
        System.out.println("account fname: " + b.fname);
        System.out.println("account lname: " + b.lname);
        System.out.println("account balance: " + b.balance);
    }



}
