package com.capgemini.generic.model;

public class Employee implements Comparable<Employee> {
	
	private int employeeId;
	private String name;
	private String designation;
	private int salary;
	
	public Employee(){}
	
	public Employee(int employeeId, String name, String designation, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name
				+ ", designation=" + designation + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e){
		return this.employeeId-e.employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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