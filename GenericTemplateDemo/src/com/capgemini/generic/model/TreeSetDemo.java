package com.capgemini.generic.model;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tree= new TreeSet<Integer>();
		
		tree.add(10);
		tree.add(5);
		tree.add(2);
		tree.add(8);
		tree.add(12);
		tree.add(18);
		tree.add(392);
		tree.add(3);
		System.out.println(tree);
		
		TreeSet<String> stringTree= new TreeSet<String>();
		stringTree.add("Haien");
		stringTree.add("jsud");
		stringTree.add("fdjh");
		stringTree.add("jeie");
		stringTree.add("ndjgn");
		
		System.out.println(stringTree);
		
	}

}
