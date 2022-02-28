package com.capgemini.entity;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args){
		try{
			Scanner sc= new Scanner(System.in);
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			calculate(a,b);
		}
		catch(ArithmeticException ex){
			System.out.println("Arithmetic Exception occured:"+ex);
		}
	}
	public static void calculate(int a, int b){
		if(b==0){
			throw new ArithmeticException("please do not divide the number with 0.");
		}
		else{
			System.out.println("a/b="+a/b);
		}
		return;
	}
}