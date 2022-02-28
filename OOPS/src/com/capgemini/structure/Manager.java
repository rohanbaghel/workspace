package com.capgemini.structure;

public class Manager extends Employee {

	private  String projName;
	
	
	public Manager(String name, int empId, String designation, int salary,String projName) {
		super(name, empId, designation, salary);
		// TODO Auto-generated constructor stub
		this.projName=projName;
	}
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.printf("\n%s is calling for meeting of %s",getName(),getProjName());
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
}
