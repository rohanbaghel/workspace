package com.capgemini.entity.animalexample;

public class Eagle implements Bird {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eagle eats small Mammals.");
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("Eagle feed eaglet.");
	}
	
	protected void finalize(){
		System.err.println("\n...Calling garbage collection for eagle object... ");
		System.err.println("Removing the object	now : "+this.hashCode()+"\n");
	}
}
