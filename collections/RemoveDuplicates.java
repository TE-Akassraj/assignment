package com.te.collections.arraylist;

import java.util.*;


public class RemoveDuplicates {
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for (Integer integer : list) {
			if(!list2.contains(integer)) {
				list2.add(integer);
			}else {
				System.out.println("the duplicates are " +integer);
			}
		}
		return list2;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(12);
		list.add(15);
		list.add(10);
		list.add(19);
		System.out.println(list);
		
		ArrayList<Integer> list2 = removeDuplicates(list);
		
		System.out.println(list2);
		
	}

}
