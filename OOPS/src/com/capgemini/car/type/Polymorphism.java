package com.capgemini.car.type;

import com.capgemini.car.Car;


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("Maruti","Petrol",1200,5,20.4f,78.2f);
		car.displayFeatures();
		System.out.println();
		SUV duster = new SUV("Duster","Diesel",1500,6,12.3f,110f,
				"Sports",true);
		duster.displayFeatures();
		Car myCar= new SUV("Bolero","Diesel",2200,6,12.3f,110f,
				"City",false);
		myCar.displayFeatures();
		
		//myCar.OpenOrCloseSunRoof()
	}

}
