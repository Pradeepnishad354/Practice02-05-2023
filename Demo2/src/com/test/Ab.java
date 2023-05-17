package com.test;

import java.util.HashMap;

public class Ab {
	
	public static void main(String[] args) {
		
		wordCount();
		printChar();
		
		String str="today is a beautiful day";
		
		
		char[] st = str.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		
		for(int i=0; i<st.length; i++) {
			
			if(hm.containsKey(st[i])) {
				
				hm.put(st[i],hm.get(st[i])+1);
			}else {
				
				hm.put(st[i],1);
			}
		}
		
		System.out.println(hm);
	}
	
//word count
public static void wordCount() {
	
	int wordCount=1;
	String str="today is a beautiful day";
	
	for(int i=0; i<str.length(); i++){
		
		char c = str.charAt(i);
		
		switch(c) {
		
		case' ':
		case'.':
			
			wordCount++;
		}
	}
	System.out.println("word count "+wordCount);
	
}
	
 
public static void printChar() {
	
String str="today is a beautiful day";
int count=0;
for(int i=0; i<str.length(); i++) {
	
	char c = str.charAt(i);
	

	switch(c) {
	
	case'a':
		count++;
		
		
	}
	
	
}
System.out.println("count:: a "+count);

}
}
