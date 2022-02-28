package com.capgemini.generic.model;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,Double> scores= new TreeMap<String, Double>();
		scores.put("Shyam",7.8);
		scores.put("John",5.6);
		scores.put("Oaetker",9.1);
		//scores.put(null,4.5);
		
		for(String key: scores.keySet()){
			System.out.println(key+" = "+scores.get(key));
		}
		
		TreeMap<Integer, Employee> empTreeMap= new TreeMap<Integer, Employee>();
		Employee e1 = new Employee(1001, "Ram", "Manager", 60000);
		Employee e2 = new Employee(1002, "Sita", "Lead", 45000);
		Employee e3 = new Employee(1003, "Shyam", "Architect", 65000);
		Employee e4 = new Employee(1004, "Radha", "Sr. Architect", 80000);
		
		empTreeMap.put(e1.getEmployeeId(), e1);
		empTreeMap.put(e2.getEmployeeId(), e2);
		empTreeMap.put(e3.getEmployeeId(), e3);
		empTreeMap.put(e4.getEmployeeId(), e4);
		
		for(Integer key:empTreeMap.keySet()){
			System.out.println(key+" "+empTreeMap.get(key));
		}
	}

}
