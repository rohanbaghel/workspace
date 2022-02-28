package com.capgemini.car.type;

import com.capgemini.car.Car;

public class SUV extends Car {

	private String driveMode;
	private boolean sunRoof;
	
	public SUV() {
		// TODO Auto-generated constructor stub
	}

	public SUV(String name, String fuelType, int engineCapacity, int noOfGears,
			float milage, float power,String driveMode,boolean sunRoof) {
		super(name, fuelType, engineCapacity, noOfGears, milage, power);
		// TODO Auto-generated constructor stub
		this.driveMode=driveMode;
		this.sunRoof=sunRoof;
	}
	
	public void OpenOrCloseSunRoof(){
		sunRoof=!sunRoof;
		if(sunRoof){
			System.out.println("Sun Roof is Opening");
		}
		else{
			System.out.println("Sun Roof is Closing");
		}
	}
	
	@Override
	public void displayFeatures(){
		super.displayFeatures();
		System.out.println("Drive Mode: "+driveMode);
		System.out.println("Sun Roof: "+sunRoof);
		System.out.println("\n");
	}
	
	@Override
	public void accelerate(){
		if(driveMode.equals("ECO")){
			System.out.println(getName()+" is accelerating slowly in ECO Mode");
		}
		else if(driveMode.equals("CITY")){
			System.out.println(getName()+" is accelerating slowly in CITY Mode");
		}
		else if(driveMode.equals("SPORTS")){
			System.out.println(getName()+" is accelerating slowly in SPORTS Mode");
		}
		else{
			System.out.println("---Invalid Drive Mode selected.!!---");
		}
	}

	public String getDriveMode() {
		return driveMode;
	}

	public void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}

	public boolean isSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}
	
}
