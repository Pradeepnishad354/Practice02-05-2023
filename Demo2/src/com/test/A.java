package com.test;

public class A {
	
	public static void main(String[] args) {
		
		
		//Array List  name: ["Bhavesh","Arun","Dinesh","Chetan"];
		
		String a[]= {"Bhaveh","Arun","Dinesh","Chetan"};
		
		String temp;
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				
				if(a[i].compareTo(a[j])>0) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	}
	
	

