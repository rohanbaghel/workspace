package com.capgemini.entity.animalexample;


public class Box {
	private int length;
	private int width;
	private int height;
	
	public void initialize(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public Box(int length, int width, int height) {
		super();
		System.out.println("Parameterised constructor");
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public Box(){
		System.out.println("Default constructor");
	}
	public void displayProperties() {
		System.out.println("Box Properties:");
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Height: "+height);	
	}

	public int getVolume() {
		return length*width*height;
	}
	
}
