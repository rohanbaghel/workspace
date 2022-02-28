package com.capgemini.log;
import java.util.Scanner;

import com.capgemini.entity.animalexample.Box;

public class BoxDemo {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.initialize(20, 30, 40);
		b1.displayProperties();
		System.out.println("Volume of Box: "+b1.getVolume());
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Lenght of the box: ");
		int l=sc.nextInt();
		System.out.println("Enter the Width of the box: ");
		int b=sc.nextInt();
		System.out.println("Enter the Height of the box: ");
		int h=sc.nextInt();
		
		Box b2 = new Box(l,b,h);
		b2.displayProperties();
		System.out.println("Volume of Box: "+b2.getVolume());
		sc.close();
		System.out.println("Hashcode: "+b2.hashCode());
	}

}
