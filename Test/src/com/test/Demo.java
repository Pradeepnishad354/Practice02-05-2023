package com.test;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
	//16,24
	int  hcf=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number ");
	int a = sc.nextInt();
	
	System.out.println("enter second number ");
	int b = sc.nextInt();
	
	for(int i=1; i<=a || i<=b; i++) {
		if(a%i==0 && b%i==0)
			hcf=i;
		
	}
	System.out.println("hcf of given two number is"+hcf);
	}
}
