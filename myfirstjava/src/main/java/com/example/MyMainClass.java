package com.example;
//master branch comment
/**
 * Created by nelson on 8/9/15.
 */
public class MyMainClass {

    public static void main(String [ ] args)
    {
// HW 7
        last_first p1 = new last_first("Pimpin Peter", "Nelson Chiu");
        last_first p2 = new last_first("Georgeous Gina", "Nelson Chiu");

        Driver d = new Driver();
        d.play(p1,p2);

/*
/// HW Assigments 1 through 6
        BankAccount b1 = new BankAccount("peaches");
        BankAccount b2 = new BankAccount("nelson", "chiu", 120202, "george");
        BankAccount b3 = new BankAccount("wayne", "chiu", 123456, 300.00, "falls");
        b2.withdraw(200,"george");
        b3.withdraw(50,"falls");
        b3.withdraw(50,"falls");
        b3.withdraw(50,"falls");
        b3.withdraw(50,"falls");
        b3.withdraw(50,"falls");

        prnt(b1);
        prnt(b2);
        prnt(b3);

        b2.transfer(b3,100);
        prnt(b2);
        prnt(b3);

        b1.printNA();
        b2.printNA();
        b3.printNA();
*/

    }

/*    public static void prnt(BankAccount b){
        System.out.println("account num: " + b.acctnum);
        System.out.println("account fname: " + b.fname);
        System.out.println("account lname: " + b.lname);
        System.out.println("account balance: " + b.balance);
    }
*/



}
