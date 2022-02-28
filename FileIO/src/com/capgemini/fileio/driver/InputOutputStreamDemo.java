package com.capgemini.fileio.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			FileOutputStream out= new FileOutputStream("file.txt");
			String text= "This is the first program for file IO .\n"
					+ "Welcome to file programming";
			out.write(text.getBytes());
			System.out.println("Content written to file");
			out.close();
			
			FileInputStream in = new FileInputStream("file.txt");
			byte[] fileContents= new byte[in.available()];
			in.read(fileContents);
			String contents= new String (fileContents);
			System.out.println("File Contents: ");
			System.out.println(contents);
			in.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
