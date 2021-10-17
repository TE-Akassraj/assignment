package com.te.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(10);
		list.add(9);
		System.out.println("Before swaping");
		System.out.println(list);
		
		System.out.println("after swaping");
		Collections.swap(list, 1, 3);
		System.out.println(list);
	}
}
