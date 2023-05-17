package com.test;

import java.util.Arrays;

//reverse array
public class ReverseArray {
	public static void main(String[] args) {
		
		int a[]= {10,34,44,55,66,11};
		
		int i=0;
		int j=a.length-1;
		int temp = 0;
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
