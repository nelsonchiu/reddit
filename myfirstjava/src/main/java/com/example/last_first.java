package com.example;

/**
 * Created by nelson on 8/25/15.
 */

public class last_first extends Player{

//Instance variables
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
        if((h > ho) && (h > ge)){
            System.out.println("humor pickup");
            return 0;
        }
        else if((ho > h) && (ho > ge)){
            System.out.println("humor pickup");
            return 1;
        }
        else if((ge > h) && (ge > ho)){
            System.out.println("geeky pickup");
            return 2;
        }
        else{
            System.out.println("equal weighted pickups");
            return 3;
        }
    }

    public void reject(Player other){
        int a = hitOn(other);
        if(a==0){
            System.out.println("humor rejection");
        }
        else if (a==1){
            System.out.println("hotness rejection");
        }
        else if (a==2){
            System.out.println("geeky rejection");
        }
        else {
            System.out.println("how do i reject you? (at least two equally weighted attributes)");
        }
    }

    public void accept(Player other){
        int a = hitOn(other);
        if(a==0){
            System.out.println("humor i accept");
        }
        else if (a==1){
            System.out.println("hotness i accept");
        }
        else if (a==2){
            System.out.println("geeky i accept");
        }
        else {
            System.out.println("Accept me (at least two equally weighted attributes)");
        }
    }


}



