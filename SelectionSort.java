package com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class SelectionSort {

	public static void sorting(LinkedList<Integer> list) {
		
		for (int i =0 ; i < list.size()-1 ; i++) {
			
			for (int j = i + 1; j < list.size() ; j++) {
				
				if ( list.get(i) > list.get(j)) {
					
					//swap
					int value =  list.get(i);
					list.set(i,  list.get(j));
					list.set(j, value);
				}
			}
		}
	}
	
	
	public static void getValues (LinkedList<Integer> list) {
		
		Scanner scan   = new Scanner(System.in);
		String value;
		
		while (null != (value = scan.nextLine()) && !value.isEmpty() ) {
			list.add(Integer.parseInt(value));
		}
	}


	private static void printValues(LinkedList<Integer> list) {
		
		System.out.println("printing the sorted values:");
		for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
	}
	
	public static void main(String args[]) {
	
		LinkedList <Integer>  list = new LinkedList();

		getValues(list);
		sorting(list);
		printValues(list);
		
	}


	
}


/**************** output *******************

10
5
6
89
90
20
100
11

printing the sorted values:
5
6
10
11
20
89
90
100




*********************************************/
