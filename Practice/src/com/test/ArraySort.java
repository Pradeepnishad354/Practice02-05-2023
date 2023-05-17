package com.test;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int a[]= {55,22,33,44,99,120};
		
		for(int i=0; i<a.length; i++ ) {
			
			for(int j=i+1; j<a.length-1; j++) {
				
				
				int temp;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
							}
		}
		System.out.println(Arrays.toString(a));
	}
	
	
}
