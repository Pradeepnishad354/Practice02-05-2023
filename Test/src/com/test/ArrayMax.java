package com.test;

public class ArrayMax {

	public static void main(String[] args) {

		int a[] = { 10, 33, 44, 55,500,66, 11, 54 };

		int max = a[0];
		//int b = (a.length + 1);
		for (int i =0; i < a.length; i++) {

			if (a[i] >max) {
				max = a[i];
			}
			
		}
		System.out.println(max);
	}

}
