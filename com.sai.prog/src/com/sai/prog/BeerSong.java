package com.sai.prog;

public class BeerSong {

	public static void main(String[] args) {
        int beernum=15;
        String word="bottles";
        while(beernum>0){
        	if(beernum==1){
        		word="bottle";
        	}
        	System.out.println(beernum+" "+word+"of beer on the wall");
        	System.out.println(beernum+" "+word+"of beer");
        	System.out.println("take one down");
        	System.out.println("pass it around");
        	beernum=beernum-1;
        	if(beernum>0){
        		System.out.println(beernum+" "+word+"of beer on the walll");
        	}else{
        		System.out.println("no more bottles of beer on wall");
        	}
        }
	}

}
