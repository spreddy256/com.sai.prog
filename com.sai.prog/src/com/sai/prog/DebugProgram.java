package com.sai.prog;
import java.util.Scanner;
public class DebugProgram {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the values of A,B,C");
		int a=sc.nextInt();
		double b=sc.nextDouble();
		long c=sc.nextLong();
			System.out.println("the value of A is "+a+" After increment: "+(a+100000));
		    System.out.println("the value of B is "+b+" After increment: "+(b+10000));
		    System.out.println("the value of C is "+c+" After increment: "+(c+10));

	}

}
