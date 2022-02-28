package com.capgemini.entity.animalexample;

public class ImplementInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cow cow= new Cow();
		cow.eat();
		cow.feed();
		
		Tiger tiger=new Tiger();
		tiger.eat();
		tiger.feed();
		
		Pigeon pigeon = new Pigeon();
		pigeon.eat();
		pigeon.feed();
		
		Mammal mammal=cow;
		mammal.eat();
		mammal.feed();
		
		mammal=tiger;
		mammal.eat();
		mammal.feed();
		
		Bird bird=new Pigeon();
		bird.eat();
		bird.feed();
		
		bird=new Eagle();
		bird.eat();
		bird.feed();
		System.out.println("HashCode: "+bird.hashCode());

		System.gc();
		
		bird.feed();
		bird=new Eagle();
		bird.eat();
		bird.feed();
		System.out.println("HashCode: "+bird.hashCode());
		
	}

}
