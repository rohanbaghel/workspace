package com.capgemini.structure;

public class ImplementEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new SoftwareEngineer("Rohan", 123, "Software Engineer", 52000, "Features");
		emp1.doWork();
		emp1.display();
		
		emp1=new Clerk("Manish", 141, "Clerk", 220000, "telly");
		emp1.doWork();
		emp1.display();
		
		emp1=new Manager("Lokesh", 112, "Manager", 62200, "Sunrise WebApp");
		emp1.doWork();
		emp1.display();
		
	}

}
