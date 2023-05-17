package com.test;
	
public class PrintNumber {
	
	
	public static void main(String[] args) {
		int a=1;
		int p;
		  printNum(100);
		
			
		
		
	}

public static void printNum(int n) {
	
	if(n==0) {
		return  ;
		  
	}
	
	
	
      printNum(n-1);
      System.out.println(n);
	
	
	}
}
