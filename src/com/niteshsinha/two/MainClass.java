package com.niteshsinha.two;

public class MainClass {

	public static void main(String args[]){
		
		Vehicle car = new Vehicle(4, 100.00);
		
		System.out.println("Cars Max Speed "+ car.getSpeed());
		System.out.println("Num of Wheels "+ car.getWheels());
	
		car.setCarStrength(10);
		
		System.out.println("Strength "+ car.getCarStrength());
	}
}
