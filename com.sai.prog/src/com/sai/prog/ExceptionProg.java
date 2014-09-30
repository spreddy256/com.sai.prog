package com.sai.prog;

public class ExceptionProg {
	public static void main(String[] args){
		try{
		for(int i=5;i>=0;i--){
			System.out.println(10/i);
		}
			}catch(Exception e){
				System.out.println("Cannot divide by Zero"+e.getMessage());
				e.printStackTrace();
				
			}
		}
	}

