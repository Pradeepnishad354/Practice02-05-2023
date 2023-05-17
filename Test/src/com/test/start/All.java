package com.test.start;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class All {

	public static void main(String[] args) {

		missingElement();
		wordfrequencyCount();
		arrReverse();

	}

	// missing element

	public static void missingElement() {

		int a[] = { 1, 4, 5, 6, 8, 9 };

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
	// find word frequency

	public static void wordfrequencyCount() {
		
	 String str="hello how are you hello you";
	 
	 String[] st = str.split(" ");
	 HashMap<String,Integer> hm=new HashMap<>();
	 
	 
	 for(int i=0; i<st.length; i++) {
		 if(hm.containsKey(st[i])) {
			 
			 hm.put(st[i],hm.get(st[i])+1);
				 
			 
			 
		 }else {
			 
			 hm.put(st[i], 1);
		 }
		 
		 
	 }
	 
	 System.out.println(hm);
		
	}
	
	
	
	
	public static void arrReverse() {
		
		
		int a[]= {10,40,22,44,99};
		
		
		for(int i=0;i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				int temp=0;
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(a[a.length-3]);
		
	}

}
