package com.capgemini.generic.model;

import java.util.ArrayList;

public class EmployeeArrayList{
	
	

	public static void main(String[] args) {
	Employee e1 = new Employee(1001, "Ram", "Manager", 60000);
	Employee e2 = new Employee(1002, "Sita", "Lead", 45000);
	Employee e3 = new Employee(1003, "Shyam", "Architect", 65000);
	Employee e4 = new Employee(1004, "Radha", "Sr. Architect", 80000);
	Employee e5 = new Employee(1005, "Laxman", "Tech Lead", 50000);
	ArrayList<Employee> empList = new ArrayList<Employee>();
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	//System.out.println(empList);
	for(Employee e:empList){
		System.out.println(e);
	}
	empList.add(2, e5);
	System.out.println();
	//Updating the name of Employee from Laxman -> Lakhan
	int index=0;
	for(Employee e:empList){
		if(e.getName().equals("Laxman")){
			index=empList.indexOf(e);
		}
	}
	Employee temp = empList.get(index);
	temp.setName("Lakhan");
	empList.set(index, temp);
	for(Employee e:empList){
		System.out.println(e);
	}
	empList.sort(null);
	
	System.out.println("After sorting based on id's");
	for(Employee e:empList){
		System.out.println(e);
	}
	
	System.out.printf("%d\n",empList.get(0).compareTo(empList.get(1)));
	
	empList.sort(new EmployeeSortByNameComparator());
	
	System.out.println("After sorting based on names");
	for(Employee e:empList){
		System.out.println(e);
	}
	}
}
