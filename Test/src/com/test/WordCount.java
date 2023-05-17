package com.test;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {

		//  method call 
		wordCount();
		
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {

			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {

				count++;

			}
		}
		System.out.println("the total number of word :" + count);

	}
	
	
	
	
	
	
	public static void wordCount() {
		String a="pradeep Nishad";
		int wordCount=1;
		for(int i=0; i<a.length(); i++) {
			
			char c = a.charAt(i);
			
			switch(c) {
			case' ':
			case'.':
				wordCount++;
			}
			
		}
		System.out.println(wordCount);
	}

}
