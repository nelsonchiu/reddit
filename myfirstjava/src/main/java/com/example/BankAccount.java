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
        System.out.printf("No parameter constructor");

    }

    public BankAccount(String first_name, String last_name, int accountnumber){
        balance = 0;
        setAcctnum(accountnumber);
        setName(first_name, last_name);
        System.out.println(fname + lname + acctnum + balance);
    }

    public BankAccount(String first_name, String last_name, int accountnumber, double bala){
        setAcctnum(accountnumber);
        setName(first_name, last_name);
        setBalance(bala);
        System.out.printf("%s %s %s %s", fname, lname, acctnum, balance);
    }


}
