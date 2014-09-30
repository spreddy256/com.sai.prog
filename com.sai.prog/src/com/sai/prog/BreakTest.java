package com.sai.prog;

public class BreakTest {

	public static void main(String[] args) {
      int count;
      for(count=1;count<10;count++){
    	  if(count==5){
    		  System.out.println("Loop breaks at>> "+count);
    		  break;
    	  }System.out.println("Loops is at>> "+count);
      }
	}

}
