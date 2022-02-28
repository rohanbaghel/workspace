package com.capgemini.entity;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the pattern to match:");
		
		Pattern pattern = Pattern.compile(sc.nextLine(),Pattern.CASE_INSENSITIVE);
		
		System.out.println("Enter the String you want to find pattern in: ");
		Matcher matcher= pattern.matcher(sc.nextLine());
		
		boolean result= matcher.find();
		
		System.out.println(matcher.pattern()+" "+result);
		sc.close();
	}

}
