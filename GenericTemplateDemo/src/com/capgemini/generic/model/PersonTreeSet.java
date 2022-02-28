package com.capgemini.generic.model;

import java.util.TreeSet;

public class PersonTreeSet {

	public static void main(String[] args){
		Person p1= new Person(2323452453L,"Rohan","Delhi",235235);
		Person p2= new Person(8237498243L,"Kailash","Delhi",41335);
		Person p3= new Person(8374892373L,"Shubham","Delhi",53255);
		
		TreeSet<Person> personTreeSet= new TreeSet<Person>(); 
		personTreeSet.add(p1);
		personTreeSet.add(p2);
		personTreeSet.add(p3);
		System.out.println("Person Info:-");
		for(Person p:personTreeSet){
			System.out.println(p);
		}
	}
}
