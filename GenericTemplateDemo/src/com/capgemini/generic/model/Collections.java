package com.capgemini.generic.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> iList= new ArrayList<Integer>();
		iList.add(10);
		iList.add(20);
		iList.add(30);
		iList.add(40);
	
		iList.add(2,10);
		iList.remove(2);
		for(int i:iList){
			System.out.print(i+" ");
		}
		iList.set(3, 120);
		System.out.println("\nList="+iList);
		
		ArrayList<String> stringList= new ArrayList<String>();
		
		System.out.println("Enter number of string you want to enter in list");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
			stringList.add(sc.nextLine());
		}
		
		stringList.set(n-1, "Stew");
		System.out.println(stringList);
		
		stringList.remove(3);
		System.out.println(stringList);
	}

}
