package com.test;

public class Fibonacci {
	
	static int a=0,b=1,c;
	
	public static void main(String[] args) {
		
		System.out.println(a+" "+b);
		
		
		for(int i=2; i<10; i++) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}

}
