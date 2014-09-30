package com.sai.prog;

public class ConstructorProg {
	public void ConstructorProg(){
		System.out.println("this is constructor");
	}
	public void ConstructorProg(int a){
		for(a=0;a<10;a++){
			System.out.print(a);
		}
	}
	public void ConstructorProg(String str){
		System.out.println("this is string constructor");
		System.out.println("My name is "+str);
		
	}
	public double ConstructorProg(double e ,double f){
		//e=253.02;
		//f=586.02;
		System.out.println("E/F: "+e/f);
		return 0.0;
	}
    public static void main(String[] args){
    	//String name="Sai prasad"; 
    	int a=0;
    	double e=0,f=0;
    	ConstructorProg cp=new ConstructorProg();
    	ConstructorProg acp=new ConstructorProg();
    	ConstructorProg dcp=new ConstructorProg();
    	ConstructorProg scp=new ConstructorProg();
    	cp.ConstructorProg();
    	acp.ConstructorProg(a);
    	dcp.ConstructorProg(256.0236,23.025);
    	scp.ConstructorProg("Sai");
    }
}
