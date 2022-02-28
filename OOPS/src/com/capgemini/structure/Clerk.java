package com.capgemini.structure;

public class Clerk extends Employee {

	private String softwareName;
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.printf("\nClerk %s is generating payrolls using %s software",getName(),getSoftwareName());
	}
	public Clerk(String name, int empId, String designation, int salary,String softwareName) {
		super(name, empId, designation, salary);
		// TODO Auto-generated constructor stub
		this.softwareName=softwareName;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	
}
