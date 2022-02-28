package com.capgemini.structure;

public class SoftwareEngineer extends Employee {

	private String moduleName;
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.printf("\n%s is working on %s",getName(),getModuleName());
	}
	public SoftwareEngineer(String name, int empId, String designation,
			int salary,String moduleName) {
		super(name, empId, designation, salary);
		// TODO Auto-generated constructor stub
		this.moduleName=moduleName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
}
