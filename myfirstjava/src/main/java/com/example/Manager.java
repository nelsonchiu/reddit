package com.example;

/**
 * Created by nelson on 9/7/15.
 */
public class Manager extends Employee{

// instance variables
    private double salary;
    private int deptSize;

// constructor
    public Manager (String l, String f, int i, String dep){
        super(l, f, i, dep);
        //salary = s;
        //deptSize = d;
    }

// method
    public String getLastName(){
        return last;
    }

    public void fire(){
        System.out.println("Norine, You're Fried!!!");
    }

}
