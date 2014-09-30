package com.sai.prog;
import java.util.Scanner;
public class Table {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
      System.out.println("Enter the table number you want: ");
      double a=sc.nextDouble();
      for(double i=1;i<=10;i++){
    	  System.out.println(a+" * "+i+" = "+(a*i));
      }
	}
}
