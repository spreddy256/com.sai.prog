package com.sai.prog;
import java.util.Scanner;
public class Apple {
	public static void main(String[] args) {
		String name2="Sai";
      Scanner sc=new Scanner(System.in);
      Name nm=new Name();
      System.out.println("Enter your name");
       String n=sc.nextLine();
       nm.MyName(n);
      while(n.equals(name2)){
    	  System.out.println("Entered name and the name in the record are same please enter another name");
    	  break;
      }
      System.out.println("Mention your age please");
      int age=sc.nextInt();
      nm.Age(age);
}
}
