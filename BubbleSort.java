package com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BubbleSort {

	private static void bubbleSort(LinkedList<Integer> list) {

		for (int i =0 ; i< list.size()-1 ; i++) {
			for (int j=0; j < list.size() -i -1; j++) {
				if (list.get(j) > list.get(j+1)) {
					int value = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1,value);
				}
			}
		}
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		String value;
		
		LinkedList<Integer> list=  new LinkedList();
		while (null != (value = scan.nextLine()) && !value.isEmpty()) {
			list.add(Integer.parseInt( value));
		}
		
		bubbleSort(list);
		Iterator<Integer> iter =  list.iterator();

		System.out.println("Sorted Values:");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

/******** output *************


10
5
6
89
90
20
100
11

Sorted Values:
5
6
10
11
20
89
90
100


/******** output *************/
