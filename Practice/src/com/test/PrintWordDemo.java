package com.test;

import java.util.Map;
import java.util.TreeMap;

// print number of words ,vowels,and frequency of each character in string
//UppercaseCount
//vowelcount
//frequency count
public class PrintWordDemo {

	public static void main(String[] args) {

		String str = "Learn Code With Pradeep";

		PrintWordDemo p = new PrintWordDemo();
		p.getWordVowelCount(str);
		p.frequency(str);

	}

	private void getWordVowelCount(String str) {

		int wordCount = 1;
		int vowelCount = 0;
		int upperCaseCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			switch (c) {

			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':

				vowelCount++;

			}

			switch (c) {

			case '.':
			case ' ':

				wordCount++;

			}

			if(c>=65 && c<=90) {
				
				upperCaseCount++;
			}
		}
System.out.println("vowel Count "+vowelCount);
System.out.println("word Count "+wordCount);
System.out.println("upperCase Count "+upperCaseCount);
		
	}

	// frequency count like eea ,e=2,a=1
	
	
private void frequency(String str) {
TreeMap <Character,Integer> map=new TreeMap<>();
for(int i=0; i<=str.length()-1; i++) {
	
	Integer c = map.get(str.charAt(i));
	
	if(map.get(str.charAt(i))== null){
		
		map.put(str.charAt(i),1);
		
	}else {
		
		map.put(str.charAt(i),  ++c);
	}
}
		
for(Map.Entry entry: map.entrySet()) {
	
	System.out.println("character "+entry.getKey());
	System.out.println("frequency "+entry.getValue());
}


	}
}
