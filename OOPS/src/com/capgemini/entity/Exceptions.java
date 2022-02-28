package com.capgemini.entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number");
			
			int n= sc.nextInt();
			System.out.println("int value : "+n);
			
		}catch(InputMismatchException|NullPointerException|ArithmeticException ex){
			System.out.println("Exception type: "+ex);
		}
		finally{
			System.out.println("Last Block.");
		}
	}

}
