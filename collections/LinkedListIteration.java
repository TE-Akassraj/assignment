package com.te.collections.arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(10);
		list.add(15);
		list.add(14);
		list.add(19);
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.print(integer+" ");
			
		}
		System.out.println();
		ListIterator<Integer> itr2 = list.listIterator(0);
		while (itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
			
		}
		System.out.println();
		ListIterator<Integer> itr3 = list.listIterator(list.size()-2);
		
		while (itr3.hasPrevious()) {
			System.out.print(itr3.previous()+" ");
			
		}
	}
}
