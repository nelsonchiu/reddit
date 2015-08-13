package com.example;

// Setup class format for Bank Account
public class BankAccount {

// instance variables
    public String fname;
    public String lname;
    public int acctnum;
    public double balance;
    private static int na = 0;
    private int pin;

// Methods listed below
    public void setName(String string1, String string2) {
        fname = string1;
        lname = string2;
    }

    public void setAcctnum(int acct) {
        acctnum = acct;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public void withdraw(int amount){
        if(amount <= balance){
            balance = balance - amount;
        }
        else{
            amount = (int)balance;
            balance = 0;
        }
        System.out.printf("You withdrew %s and have %s remaining", amount, balance);

    }

    public void transfer(BankAccount other, int amt){
        if(amt <= other.balance) {
            other.balance = other.balance - amt;
            balance = balance + amt;

        } else {
            other.balance = 0;
            balance = balance + other.balance;

        }
    }

    public void printNA(){
        System.out.println("NA:"+na);
    }

    public void setPin(int h){
        pin = h;
        System.out.println("Your pin is: "+pin);
    }


// 3 Constructors
    public BankAccount(int p){
        setPin(p);
        na=na+1;
    }

    public BankAccount(String first_name, String last_name, int accountnumber, int p){
        balance = 0;
        setAcctnum(accountnumber);
        setName(first_name, last_name);
        setPin(p);
        na=na+1;
    }

    public BankAccount(String first_name, String last_name, int accountnumber, double bal, int p){
        balance = bal;
        setAcctnum(accountnumber);
        setName(first_name, last_name);
        setPin(p);
        na=na+1;
    }


}
