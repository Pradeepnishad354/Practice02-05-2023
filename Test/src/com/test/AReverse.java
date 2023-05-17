package com.test;

import java.util.Arrays;

public class AReverse {
	
	public static void main(String[] args) {
		
		
		
		int a[]= {12,99,44,55,66};
		
		int i=0;
		int j=a.length-1;
		int temp;
		
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}

}
