package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {
	
	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("java",1000);
		hm.put("spring",2000);
		hm.put("micro",3000);
		hm.put("hibernate",2000);
		
		System.out.println(hm);
		
		for(Map.Entry map:hm.entrySet()) {
			
		System.out.println(map.getKey()+" "+ map.getValue());
		}
		
		
		// iterate the map
		Set<Entry<String, Integer>> set = hm.entrySet();
		
		Iterator<Entry<String, Integer>>itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Entry<String, Integer> n = itr.next();
			
			System.out.println(n.getKey()+" "+n.getValue());
		}
		
		//sorting on the basis of key
		
		TreeMap<String,Integer> m=new TreeMap<>(hm);
		
		//m.putAll(hm);
		System.out.println("sorting on the basis of key ");
		for(Map.Entry a: m.entrySet()) {
			
			
			System.out.println(a.getKey()+" "+ a.getValue());
		}
		
		
		
	}

}
