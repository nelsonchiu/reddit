package com.example;

import java.util.*;
public class Driver
{

    public void play(Player p1, Player p2)
    {
	int n;
	Random r = new Random();
    
	p1.hitOn(p2);

	if (r.nextInt(100) > 50){
	    p1.increaseWasRejected();
	    p2.increaseRejected();
	    p2.reject(p1);
	}
	else{
	    p1.increaseWasAccepted();
	    p2.increaseAccepted();
	    p2.accept(p1);
	}
    }

}