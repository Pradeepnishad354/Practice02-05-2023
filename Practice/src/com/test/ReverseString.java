package com.test;

public class ReverseString {
	public static void main(String[] args) {
	
		String s="pradeep";
		int l = s.length();
		String rev="";
		for(int i=l-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
			
			
			
		}
		System.out.println(rev);
		
	}
	
	
	

}
