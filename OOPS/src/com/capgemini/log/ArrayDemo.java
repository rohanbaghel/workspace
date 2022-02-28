package com.capgemini.log;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
