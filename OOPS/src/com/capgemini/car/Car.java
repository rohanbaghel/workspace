package com.capgemini.car;

public class Car {
	private String name;
	private String fuelType;
	private int engineCapacity;
	private int noOfGears;
	private float milage;
	private float power;
	
	public Car(){}
	
	public Car(String name, String fuelType, int engineCapacity, int noOfGears,
			float milage, float power) {
		super();
		this.name = name;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.noOfGears = noOfGears;
		this.milage = milage;
		this.power = power;
	}
	
	public void displayFeatures () {
		System. out.println("Car Features...");
		System. out. println("Name: "+name) ;
		System. out.println("Fuel Type: "+fuelType) ;
		System. out.println("Engine Capacity: "+engineCapacity+" CC");
		System. out.println("Number of Gears: "+noOfGears);
		System. out.println("Mileage:"+milage+" KMPL");
		System. out. println("Power:"+power+" BHP");
	}
	
	public void applyBrake(){
		System.out.printf("%s is stopping.\n",name);
	}
	public void accelerate(){
		System.out.printf("%s is accelearting.\n",name);
	}
	public void changeGear(int gear){
		if(gear>noOfGears || gear<0){
			System.out.println("Invalid Gear selection.\n");
		}
		else{
			System.out.printf("Gear changed to %d gear\n",gear);
		}
	}
	public void steer(String direction){
		System.out.printf("Car is steering to %s\n");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public float getMilage() {
		return milage;
	}

	public void setMilage(float milage) {
		this.milage = milage;
		this.hashCode();
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}
}
