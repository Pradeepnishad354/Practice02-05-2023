package com.test;

public class SmallestElementOfArray {
	
	public static void main(String[] args) {
		
		int a[]= {155,25,55,6,9,10};
		
		int min=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<min) {
				
				min=a[i];
			}
		}
		System.out.println("smallest element is "+min);
		
		
		
	}

}
