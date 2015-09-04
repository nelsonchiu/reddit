package com.example;

import java.util.*;


public abstract class Player
{
    protected int wasaccepted=0;
    protected int wasrejected=0;
    protected int accepted=0;
    protected int rejected=0;
    protected String name="";

    protected String author="";
    public String getName() {return name;}
    public String getAuthor() {return author;}

    public void increaseWasAccepted() { wasaccepted++;}
    public void increaseWasRejected() { wasrejected++;}
    public void increaseAccepted() {accepted++;}
    public void increaseRejected() {rejected++;}

    public int getWasAccepted() { return wasaccepted;}
    public int getWasRejected() { return wasrejected;}
    public int getAccepted() { return accepted;}
    public int getRejected() {return rejected;}

	
    public abstract int getHumor();
    public abstract int getHotness();
    public abstract int getGeekiness();

    public abstract int hitOn(Player other);
    public abstract void reject(Player other);
    public abstract void accept(Player other);


}
