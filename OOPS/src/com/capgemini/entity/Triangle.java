package com.capgemini.entity;

public class Triangle extends Shape {

	private int length;
	private int heigth;
	
	public Triangle(int length,int heigth){
		this.length=length;
		this.heigth=heigth;
		super.setNumberOfSides(3);
	}
	public void area(){
		System.out.println("Area of Triangle: "+(heigth*length)/2);
	}
}
