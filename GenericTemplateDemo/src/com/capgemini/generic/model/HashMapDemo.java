package com.capgemini.generic.model;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		
		hashMap.put(1, "Django");
		hashMap.put(2, "Candy");
		hashMap.put(3, "Broomhilda");
		hashMap.put(4, "Schrutz");
		hashMap.put(5,"Stephen");
		hashMap.put(6, null);
		hashMap.put(null, "Harpon");
		
		System.out.println(hashMap);
		
		hashMap.put(4, "king");
		
		hashMap.put(null, null);
		
		System.out.println(hashMap);
		
		HashMap<Integer, Employee> empHashMap= new HashMap<Integer, Employee>();
		Employee e1 = new Employee(1001, "Ram", "Manager", 60000);
		Employee e2 = new Employee(1002, "Sita", "Lead", 45000);
		Employee e3 = new Employee(1003, "Shyam", "Architect", 65000);
		Employee e4 = new Employee(1004, "Radha", "Sr. Architect", 80000);
		
		empHashMap.put(e1.getEmployeeId(), e1);
		empHashMap.put(e2.getEmployeeId(), e2);
		empHashMap.put(e3.getEmployeeId(), e3);
		empHashMap.put(e4.getEmployeeId(), e4);
		
		for(int id:empHashMap.keySet()){
			System.out.println(empHashMap.get(id)+" ");
		}
		
		Iterator<Integer> keys= hashMap.keySet().iterator();
		while(keys.hasNext()){
			Integer k= keys.next();
			System.out.println(k+" "+hashMap.get(k));
		}
	}
}
