package com.capgemini.fileio.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream inputStream = new FileInputStream("movie.properties");
		Properties prop = new Properties();
		prop.load(inputStream);
		
		System.out.println("Movie name: "+prop.getProperty("movie_name"));
		System.out.println("Year: "+prop.getProperty("year"));
		System.out.println("Franchise: "+prop.getProperty("franchise"));
		System.out.println("Category: "+prop.getProperty("category"));
		System.out.println("IMDb: "+prop.getProperty("imdb"));
		
		System.out.println("\nUsing Keyset of Properties..\n");
		Set<Object> keys = prop.keySet();
		for(Object k:keys){
			String key= (String)k;
			System.out.println(key+":"+prop.getProperty(key));
		}
		
	}

}
