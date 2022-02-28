package com.capgemini.car.type;
import com.capgemini.car.Car;


public class HatchBack extends Car {

	private boolean ac;
	private String musicSystem;
	
	public HatchBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HatchBack(String name, String fuelType, int engineCapacity,
			int noOfGears, float milage, float power,boolean ac, String musicSystem) {
		super(name, fuelType, engineCapacity, noOfGears, milage, power);
		// TODO Auto-generated constructor stub
		this.ac=ac;
		this.musicSystem=musicSystem;
	}
	
	@Override
	public void displayFeatures(){
		super.displayFeatures();
		System.out.println("AC: "+ac);
		System.out.println("musicSystem: "+musicSystem);
		System.out.println("\n");
	}
	
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	public void displayHatchBackFeatures(){
		super.displayFeatures();
		System.out.println("Ac:"+ac);
		System.out.println("Music system: "+musicSystem);
	}
}
