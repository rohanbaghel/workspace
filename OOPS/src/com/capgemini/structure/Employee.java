package com.capgemini.structure;

public abstract class Employee {
	private String name;
	private int empId;
	private String designation;
	private int salary;
	
	public abstract void doWork();
	
	public Employee(String name, int empId, String designation, int salary) {
		this.name = name;
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}



	public void display(){
		System.out.printf("\nName: %s\nEmployee Id: %d\nDesignation: %s\nSalary: %d\n",name,empId,designation,salary);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	 
}
