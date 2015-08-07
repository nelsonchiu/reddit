package com.example;


// Setup class format for Bank Account
public class BankAccount {

// instance variables
    public String fname;
    public String lname;
    public int acctnum;
    public double balance;

// Methods listed below
    public void setName(String first, String last) {
        fname = first;
        lname = last;
    }

    public void setAcctnum(int acct) {
        acctnum = acct;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

// 3 Constructors
    public BankAccount(){

    }

    public BankAccount(String first_name, String last_name, int accountnumber){
        balance = 0;
        setAcctnum(accountnumber);
        setName(first_name, last_name);
    }

    public BankAccount(String first_name, String last_name, int accountnumber, double balance){
        setAcctnum(accountnumber);
        setName(first_name, last_name);
        setBalance(balance);
    }

}

public class MainClass {
    BankAccount bank1 = new BankAccount();
    BankAccount bank2 = new BankAccount('nelson', 'chiu', 120202);
    BankAccount bank3 = new BankAccount('wayne', 'chiu', 123456, 300.00);

}