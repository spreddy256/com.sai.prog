package com.sai.prog;

public class Vehicle implements InterfaceExample,Interface2{ 
	public void move(){
	System.out.println("Vehicle moves with average speed of "+AVG_SPEED);   
}
	public void Roll(){
		System.out.println("The tyre of the vehicle can move per minute is "+ROLLSPER_MINUTE);
	}
	public void Start(){
		if(GO){
			System.out.println("The vehicle is moving on:"+Gears);
			
		}else{
			System.out.println("vehicle is in halt");
		}
	}
	
	public boolean Obstacle(){
		System.out.println("there is a obstacle in front emergency <<stop>>");
		for(int i=100;i<0;i-=20){
			System.out.println(i);
		}
		return true;
	}
	public boolean noObstacle(){
		System.out.println("no obsatcles proceed");
		return false;
	}
	
	public static void main(String[] args) {
		String str3=str.concat(str2);
		System.out.println("Vehicle is going to start from");
		for(int i=0;i<=200;i+=50){
			System.out.println(i);
		}
         Vehicle v=new Vehicle();
         System.out.println(str3);
        System.out.println(str4.compareTo(str5));
         v.move();
         v.Roll();
         v.Start();
         //v.Obstacle();
         System.out.println(v.noObstacle());
         System.out.println(v.Obstacle());
         
	}

}
