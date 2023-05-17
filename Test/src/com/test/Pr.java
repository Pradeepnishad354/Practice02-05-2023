package com.test;

import java.util.HashMap;
import java.util.HashSet;

public class Pr {

	static int a[] = { 63, 71, 44, 55, 65, 77 };

	public static void main(String[] args) {
		int n = 100;
		reverseArray(a);
		sortArray(a);
		maxElement(a);
		missingElement();
		wordFrequencyCount();
		charCountFrequency();

		printNumb(n);

		sumNumber();
		factNumber();
		sortArrayName();
		
		fiboSer();
		wordCount();

	}

	// reverse array 
	public static void reverseArray(int a[]) {

		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				temp = a[i];
				a[i] = a[j];
				a[j] = temp;

			}

		}
		for (int k = 0; k < a.length; k++) {

			System.out.print(a[k] + " ");
		}

	}

	// sort array 
	public static void sortArray(int a[]) {

		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("sort array");
		for (int k = 0; k < a.length; k++) {

			System.out.print(a[k]);
		}

	}

	// find max element 
	public static void maxElement(int a[]) {

		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			}
		}
		System.out.println("max element" + max);

	}

	/// fine the missing element in array

	public static void missingElement() {
		int a[] = { 2, 4, 5, 6, 8, 9 };
		HashSet<Integer> set = new HashSet<>();

		for (int b : a) {
			set.add(b);
		}

		for (int i = 0; i < a.length; i++) {

			if (!set.contains(i)) {

				System.out.println(i);
			}

		}

	}

	// find word frequency count

	public static void wordFrequencyCount() {

		String str = "hello hi hi hi guys this is this java java";

		String[] st = str.split(" ");

		HashMap<String, Integer> hs = new HashMap<>();

		for (int i = 0; i < st.length; i++) {

			if (hs.containsKey(st[i])) {

				hs.put(st[i], hs.get(st[i]) + 1);
			} else {

				hs.put(st[i], 1);
			}
		}

		System.out.println(hs);

	}

	// count frequency character

	public static void charCountFrequency() {

		String str = "hello how are you";

		char[] st = str.toCharArray();

		HashMap<Character, Integer> hs = new HashMap<>();

		for (int i = 0; i < st.length; i++) {
			if (hs.containsKey(st[i])) {
				hs.put(st[i], hs.get(st[i]) + 1);

			} else {

				hs.put(st[i], 1);
			}

		}

		System.out.println(hs);
	}

	// print number 1 to 100 without using loop

	public static void printNumb(int n) {

		if (n == 0) {
			return;

		} else {

			printNumb(n - 1);
			System.out.println(n);
		}
	}

	// sum of num 1 to 10

	public static void sumNumber() {

		int num = 10;
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			sum = sum + i;
		}

		System.out.println("sum of 1 to  10 ::" + sum);

	}

	// print factorial of number
	public static void factNumber() {
		int fact = 1;
		int num = 5;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		System.out.println("the fcatorila of " + num + " " + fact);

	}

	// sort the name in array
	
	public static void sortArrayName() {

		String[] str = { "Pradeep", "ajeet", "sujeet", "matru" };

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {

				if (str[i].compareToIgnoreCase(str[j]) > 0) {

					String temp;

					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}

		}

		for (int k = 0; k < str.length; k++) {
			System.out.println(str[k]);

		}

	}
	
	// fibonacci series 
		public static void fiboSer() {

			 int a=0,b=1,c;
			 
			 System.out.println(a+" "+ b);
			 
			 for(int i=2; i<=10; i++) {
				 
				 
				 c=a+b;
				 System.out.println(c);
				 a=b;
				 b=c;
				 
			 }	
	}	
		
		//word count
		
		public static void wordCount() {
			
			String str="hello world my name is";
			int wordCount=1;
			for(int i=0; i<str.length(); i++) {
				
				
				char c = str.charAt(i);
				
				switch(c) {
				
				case' ':
				case'.':
				wordCount++;	
				
				}
				
			}
			
			System.out.println("word cont "+wordCount);
			
			
			
		}
		
		// 
		
	
}


