package com.capgemini.entity.animalexample;

public class Pigeon implements Bird {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Pigeon eats Worms.");
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("Pigeon feed squabs.");
	}
	
	protected void finalize(){
		System.err.println("\n...Calling garbage collection for pigeon object... ");
		System.err.println("Removing the object	now : "+this.hashCode()+"\n");
	}

}
