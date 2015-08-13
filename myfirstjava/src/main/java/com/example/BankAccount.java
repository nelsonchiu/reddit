package com.example;

// Setup class format for Bank Account
public class BankAccount {

// instance variables
    public String fname;
    public String lname;
    public int acctnum;
    public double balance;
    private static int na = 0;
    private String pin;
    private boolean authenticated = false;

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

    public void withdraw(int amount, String p){
        authenticate(p);
        System.out.println("Authenticated?" + authenticated);
        if(authenticated) {
            if (amount <= balance) {
                balance = balance - amount;
            } else {
                amount = (int) balance;
                balance = 0;
            }
            System.out.printf("You withdrew %s and have %s remaining \n", amount, balance);
        } else{
            System.out.println("You are not authorized");
        }
        logout();

    }

    public void transfer(BankAccount other, int amt, String p){
        authenticate(p);
        if(authenticated) {
            if (amt <= other.balance) {
                other.balance = other.balance - amt;
                balance = balance + amt;

            } else {
                other.balance = 0;
                balance = balance + other.balance;

            }
        } else{
            System.out.println("You are not authorized to make this transfer");
        }
    }

    public void printNA(){
        System.out.println("NA:"+na);
    }

    public void setPin(String h){
        pin = h;
        System.out.println("Your pin is: "+pin);
    }

    public void authenticate(String p){
        if (p==pin){
            authenticated = true;
        } else {

        }
    }

    public void logout(){
        authenticated = false;
    }


// 3 Constructors
    public BankAccount(String p){
        setPin(p);
        na=na+1;
    }

    public BankAccount(String first_name, String last_name, int accountnumber, String p){
        balance = 0;
        setAcctnum(accountnumber);
        setName(first_name, last_name);
        setPin(p);
        na=na+1;
    }

    public BankAccount(String first_name, String last_name, int accountnumber, double bal, String p){
        balance = bal;
        setAcctnum(accountnumber);
        setName(first_name, last_name);
        setPin(p);
        na=na+1;
    }


}
