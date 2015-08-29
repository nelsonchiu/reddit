package com.example;

/**
 * Created by nelson on 8/25/15.
 */

//Where do i place Player.class
public class last_first extends Player{

//instance variables
    public String name;
    public String author;
    public int humor;
    public int hotness;
    public int geekiness;

// constructors
    public last_first(String n, String a){
        name = n;
        author = a;
        humor = 15;
        hotness = 5;
        geekiness = 10;
    }
// Methods
    public int getHumor(){
        return humor;
    }

    public int getHotness(){
        return hotness;
    }

    public int getGeekiness(){
        return geekiness;
    }

    public String getName(){
        return name;
    }

    public int hitOn(Player other){
        int h = other.getHumor();
        int ho = other.getHotness();
        int ge = other.getGeekiness();
        String na = other.getName();
    }





}
