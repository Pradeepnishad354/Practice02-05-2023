package com.test;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
		int a[]= {10,33,22,8,5,4};
		
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
		
		for(int b=0; b<a.length; b++) {
			
			System.out.print(a[b]+" ");
		}
		
	}

}
