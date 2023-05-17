package com.test;

public class StringPalidrome {
	public static void main(String[] args) {
		
		
		String s="Radar";
		String rev="";
		int l=s.length();
		for(int i=l-1; i>=0; --i) {
			
			rev=rev+s.charAt(i);
			
		}
		
		if(s.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(s+"String is palidrome");
			
		}else {
			System.out.println("String is not palidrome ");
		}
	}

}
