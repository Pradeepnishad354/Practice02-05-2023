package com.test;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int p=6;
		int temp=0;
		
		for(int i=2; i<=p-1; i++) {
			
			if(p%i==0) {
				
				temp++;
			}
			
		}
		if(temp>0) {
			System.out.println("not prime number");
		}else {
			System.out.println("prime number");
		}
		
	}

}
