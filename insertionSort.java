package com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class InsertionSort {
	
	public static void sorting(LinkedList<Integer> list) {
		
		for (int i =1 ; i < list.size() ; i++) {
			
			int key = list.get(i) ;
			
			int j = i -1;
			while(j >= 0 && key < list.get(j) ) {
	
					//swap
					list.set(j+1, list.get(j)) ;
					j--;
			}
			list.set(j+ 1, key);
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


/**************** OUTPUT *******************
 * 
 * 
 * 
 * 10
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
