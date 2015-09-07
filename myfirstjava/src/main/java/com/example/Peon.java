package com.example;

/**
 * Created by nelson on 9/7/15.
 */
public class Peon extends Employee {

// instance variables
    private double wage;
    private int managerID;

// constructor
    public Peon (String f, String l, int i, String dep, double w, int mID){
        super(l, f, i, dep);
        wage = w;
        managerID = mID;
    }
}
