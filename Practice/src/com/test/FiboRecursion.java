package com.test;

public class FiboRecursion {
	
	static int a=0,b=1,c;
	public static void main(String[] args) {
		
		System.out.println(a+" "+b);
		printFibo(10);
	}
	

	static void printFibo(int i) {
		
		if(i>=1) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			printFibo(i-1);
		}
		
		
	}
}
