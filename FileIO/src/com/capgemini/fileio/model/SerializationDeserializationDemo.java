package com.capgemini.fileio.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDeserializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1001,"Ram","Manager",60000);
		Employee e2 = new Employee(1002,"Sita","Lead",45000);
		Employee e3 = new Employee(1003,"Shyam","Architect",65000);
		Employee e4 = new Employee(1004,"Radha","Sr. Architect",80000);
		Employee e5 = new Employee(1005,"Laxman","Tech Lead",50000);
		ArrayList<Employee> empList= new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
				
		FileOutputStream file = new FileOutputStream("employees.txt");
		ObjectOutputStream employeeOutputStream = new ObjectOutputStream(file);
		employeeOutputStream.writeObject(empList);
		
		System.out.println("Employee data written into the file...");
		
		employeeOutputStream.close();
		file.close();
	}

}
