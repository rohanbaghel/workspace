package com.capgemini.car.type;
import com.capgemini.car.Car;

public class Sedan extends Car {

	private int bootSpace;
	private boolean powerSteering;
	
	public Sedan() {
		// TODO Auto-generated constructor stub
	}

	public Sedan(String name, String fuelType, int engineCapacity,
			int noOfGears, float milage, float power,int bootSpace,boolean powerSteering) {
		super(name, fuelType, engineCapacity, noOfGears, milage, power);
		// TODO Auto-generated constructor stub
		this.bootSpace=bootSpace;
		this.powerSteering=powerSteering;
	}
	
	@Override
	public void displayFeatures(){
		super.displayFeatures();
		System.out.println("Boot Space: "+bootSpace+" cubic feet");
		System.out.println("Music System: "+powerSteering);
		System.out.println("\n");
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	
}