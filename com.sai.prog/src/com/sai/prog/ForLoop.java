package com.sai.prog;

public class ForLoop {

	public static void main(String[] args) {
         int i,j;
       System.out.println("This program is on repetation of loops");
       loop:for( i=1;i<100;i++){
    	   System.out.println(" ");
    	   if(i>=10)
    		   break;
    	   for(j=1;j<100;j++){
    		   System.out.print("*");
    		   if(j==1)
    			   continue loop;
    	   }
       }
	}

}
