package com.te.collections;

import java.util.*;


public class ListConversion {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("converting");
		list1.add("LinkedList");
		list1.add("to");
		list1.add("arraylist");
		System.out.println(list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(list1);
		
		
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.print(string+" ");
			
		}
	}
}
