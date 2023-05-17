package com.test;

public class DublicateElement {
	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,6,4,3};
		
		
		for(int i=0; i<=a.length; i++) {
			
			for(int j=1+i; j<a.length; j++) {
				
				
				if(a[i]==a[j]) {
				System.out.println(a[j]);
				}
			}
			
		}
		
	}

}
