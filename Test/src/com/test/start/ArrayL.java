package com.test.start;

import java.util.HashMap;

public class ArrayL {
	
	public static void main(String[] args) {
	
		String str="Hello hello java hibernate java";
		
		String[] st = str.split(" ");
		
		
		HashMap<String,Integer> hs=new HashMap<>();
		
		for(int i=0; i<st.length; i++) {
			
			
			if(hs.containsKey(st[i])) {
				
				hs.put(st[i],hs.get(st[i])+1);
			}else {
				
				hs.put(st[i],1);
			}
		}
		 
		System.out.println(hs); 
		 
		 
	}

}
