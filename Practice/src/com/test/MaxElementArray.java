package com.test;

public class MaxElementArray {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,90,40};
		
		int max=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			
			if(a[i]>max) {
				
				max=a[i];
			}
		}
		System.out.println("max element of array "+max);
		
	}

}
