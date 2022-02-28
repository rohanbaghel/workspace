package com.capgemini.car;

import com.capgemini.car.type.HatchBack;
import com.capgemini.car.type.SUV;
import com.capgemini.car.type.Sedan;

public class ImplementCar {

	public ImplementCar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		HatchBack toyota= new HatchBack("Etios liva", "Diesel", 1197, 6, 23.59f, 79.0f, true, "Harman Kardon");
		Sedan bmw= new Sedan("M5", "Petrol", 4395, 6, 9.12f, 616.87f, 28, true);
		SUV mercedece= new SUV("GLS", "Petrol", 3982, 6, 9f, 549.81f,"SPORTS", true);
		
		toyota.displayFeatures();
		toyota.accelerate();
		toyota.applyBrake();
		toyota.changeGear(5);
		
		bmw.displayFeatures();
		bmw.accelerate();
		bmw.applyBrake();
		bmw.changeGear(3);
		
		mercedece.displayFeatures();
		mercedece.applyBrake();
		mercedece.changeGear(2);
		mercedece.accelerate();
		mercedece.setDriveMode("ECO");
		mercedece.accelerate();
		
		if(toyota instanceof Car){
			System.out.println("toyota is a car");
			if(toyota instanceof HatchBack){
				System.out.println("toyota is a hatchback");
			}
		}
	}
	
	
}
