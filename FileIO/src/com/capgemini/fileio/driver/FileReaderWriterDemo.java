package com.capgemini.fileio.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("java.txt");
		System.out.println("File Details: "+file.getAbsolutePath());
		FileWriter fw = new FileWriter(file);
		
		fw.write("This is File contents\n");
		fw.write("This is second line\n");
		fw.write("file continues\n");
		fw.close();
		
		FileReader reader= new FileReader(file);
		char []content = new char [(int)file.length()];
		reader.read(content);
		String str = new String(content);
		System.out.println("\nFile contents are: ");
		System.out.println(str);
		reader.close();
		
		FileInputStream in = new FileInputStream("java.txt");
		byte[] fileContents= new byte[in.available()];
		in.read(fileContents);
		String contents= new String (fileContents);
		System.out.println("File Contents: ");
		System.out.println(contents);
		in.close();
	}

}
