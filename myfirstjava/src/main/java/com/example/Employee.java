package com.example;

/**
 * Created by nelson on 9/7/15.
 */
public class Employee {

// instance variables
    protected String last;
    protected String first;
    protected int id;
    protected String dept;

// constructor, take inputs to set all variables

    public Employee(String l, String f, int i, String d){
        last = l;
        first = f;
        id = i;
        dept = d;
        System.out.println(last + " " + first + " " + id + " " + dept);
    }

// methods - is it neccessary to make a toString when it's already created?
    public String toString(int a){
        return Integer.toString(a);
        // return "" + a;  //very unconventional, but this should work
    }


}
