package com.test;

import java.util.Scanner;

public class PalidromeNumber {
	
	public static void main(String[] args) {
		
		palidromeNum();
		int rev=0;
		int num=343;
		
		int c=num;
		while(num>0) {
			
			rev=rev*10+num%10;
			
			num=num/10;
		}
		
		if(c==rev) {
			
			System.out.println("number is palidrome");
		}else {
			
			System.out.println("number is not palidrome");
		}
	}
	
	
	
	public static void palidromeNum() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the String");
//		String n = sc.nextLine();
	//String 	c=n;
		
		String n="radar";
		 int l=n.length();
		String rev=" ";
		for(int i=l-1; i>=0; i--) {
			
			rev=rev+n.charAt(i);
			
		}
		if(n.toLowerCase().equals(rev.toLowerCase())) {
			
			System.out.println("String is palidrome");
		}else {
			System.out.println("String is not palidrome");
		}
		
	}

}
