package com.capgemini.generic.model;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> intList=new LinkedList<Integer>();
		intList.add(5);
		intList.add(39);
		intList.add(3);
		intList.add(87);
		intList.add(43);
		System.out.println(intList);
		for(int item:intList){
			System.out.print(item+" ");
		}
		System.out.println();
		Iterator<Integer> itr= intList.iterator();
		while(itr.hasNext()){
			int item=itr.next();
			
			if(item==87){
				itr.remove();
			}
			System.out.print(item+" ");
		}
	}

}
