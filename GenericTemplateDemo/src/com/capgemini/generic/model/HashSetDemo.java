package com.capgemini.generic.model;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs= new HashSet<String>();
		hs.add("Rohan");
		hs.add("Local");
		hs.add("Broad");
		hs.add("Rohan");
		hs.add("Red");
		hs.add("Blast");
		hs.add(null);
		
		System.out.println(hs);
		
		ArrayList<Integer> intList= new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(29);
		intList.add(212);
		intList.add(12);
		intList.add(31);
		intList.add(10);
		intList.add(31);
		intList.add(29);
		intList.add(20);
		
		System.out.println(intList);
		
		HashSet<Integer> nhs= new HashSet<Integer>(intList);
		System.out.println(nhs);
		
		HashSet<Employee> empHashSet =new HashSet<Employee>();
		Employee e1 = new Employee(1001, "Ram", "Manager", 60000);
		Employee e2 = new Employee(1002, "Sita", "Lead", 45000);
		Employee e3 = new Employee(1003, "Shyam", "Architect", 65000);
		
		System.out.println("e1 Hashcode: "+e1.hashCode());
		System.out.println("e2 Hashcode: "+e2.hashCode());
		
		empHashSet.add(e1);
		empHashSet.add(e2);
		empHashSet.add(e3);
		
		for(Employee emp: empHashSet){
			System.out.println(emp);
		}
		
	}
}
