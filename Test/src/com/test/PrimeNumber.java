package com.test;

public class PrimeNumber {
	// print 1 to 100 prime number
	public static void main(String[] args) {
	
int num=0;

String  primeNumbers=" ";
	for(int i=1; i<=100; i++) {
		
		int temp=0;
		
		for(num=i; 1<=num; num--) {
			
			if(i%num==0) {
				
				temp++;
				
			}
				
			}
		if(temp==2) {
			primeNumbers=primeNumbers+i+" ";
		}
		}
		System.out.println("prime numbers");
		System.out.println(primeNumbers);
	}}
	

		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
		
//		int n=11;
//		
//		int temp=0;
//		
//		for(int i=2; i<n-1; i++) {
//			
//			if(n%i==0) {
//				
//				temp++;
//				
//				
//			}
//			System.out.println(i);
//			
//		}
//		if(temp>0) {
//			System.out.println("not prime number");
//		}else {
//			
//			System.out.println("prime number");
//		}
//	}


