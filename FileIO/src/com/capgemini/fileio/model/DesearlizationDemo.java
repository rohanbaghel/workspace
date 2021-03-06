package com.capgemini.fileio.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DesearlizationDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ArrayList<Employee>  empList= new ArrayList<Employee>();
		FileInputStream fIn= new FileInputStream("employees.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fIn);
		while(true){
			try{
				empList = (ArrayList<Employee>) inputStream.readObject();
				//empList.add(e);
			}catch(EOFException e){
				break;
			}
		}
		System.out.println("Employee contents are: ");
		for(Employee e: empList){
			System.out.println(e);
		}
		inputStream.close();
		fIn.close();
	}

}
