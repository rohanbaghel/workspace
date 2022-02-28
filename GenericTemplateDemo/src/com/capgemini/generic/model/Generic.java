package com.capgemini.generic.model;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo<Integer> intDemo = new Demo<Integer>();
		intDemo.setData(10);
		System.out.println("Integer Demo Values: "+intDemo.getData());
		
		Demo<Float> floatDemo = new Demo<Float>();
		floatDemo.setData(10f);
		System.out.println("Integer Demo Values: "+floatDemo.getData());
		
		Demo<String> stringDemo = new Demo<String>();
		stringDemo.setData("Generic");
		System.out.println("Integer Demo Values: "+stringDemo.getData());
		
		Employee e= new Employee(1001,"Rohan","SE",30000);
		Demo<Employee> employeeType= new Demo<Employee>();
		employeeType.setData(e);
		System.out.println("Employee Data value: \n"+employeeType.getData());
		
	}

}
