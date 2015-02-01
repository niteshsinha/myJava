package com.niteshsinha.two;

public class Vehicle extends Crashable implements Drivable {
	
	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return this.numOfWheels;
	}

	@Override
	public void setWheels(int numWheels) {
		// TODO Auto-generated method stub
		this.numOfWheels = numWheels;
		
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return this.theSpeed;
	}

	@Override
	public void setSpeed(double speed) {
		// TODO Auto-generated method stub
		this.theSpeed = speed;
	}
	
	public Vehicle(int wheels, double speed){
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}

	@Override
	public void setCarStrength(int carStrength) {
		// TODO Auto-generated method stub
		this.carStrength = carStrength;
	}

	@Override
	public int getCarStrength() {
		// TODO Auto-generated method stub
		return this.carStrength;
	}

}
