package com.test;

public class Demo2 {
	public static void main(String[] args) {
		
	
	int arr[]= {12,15,9,10,6,3};
	int lcm=arr[0];
	for(int i=1;i<arr.length; i++  ) {
		
		lcm=findLcm(lcm,arr[i]);
	}
	System.out.println("the lcm is+"+lcm);	
	}
	public static int findLcm(int num1,int num2) {
		int gcd=findGCD(num1,num2);
		return(num1*num2)/gcd;
	}
	
	//find gcd
	public static int findGCD(int num1,int num2) {
		if(num2==0) {
			return num1;
		}else {
			return findGCD(num2,num1% num2);
		}
	}
}
