package com.capgemini.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher("Today 2 date is 15-02-22");
		
		boolean result= matcher.find();
		if(result){
			System.out.println("Pattern found");
			
		}
		else{
			System.out.println("Pattern not found");
		}
		
		Pattern pattern2= Pattern.compile("s..$");
		Matcher matcher2= pattern2.matcher("Apsle");
		if(matcher2.find()){
			System.out.println("S is in 3rd last position.");
		}
		else{
			System.out.println("S is not in the 3rd last position.");
		}
		boolean  startsWithS= Pattern.compile("^s",Pattern.CASE_INSENSITIVE).matcher("Surprise").find();
		
		boolean secondCharA=Pattern.matches("^.[a]","Happy");
		
		System.out.println("startsWithS :"+startsWithS);
		System.out.println("secondCharA :"+secondCharA);
	}

}
