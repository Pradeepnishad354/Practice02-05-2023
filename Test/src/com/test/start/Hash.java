//package com.test.start;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//
//public class Hash {
//
//	HashMap<String, Integer> hp = new HashMap<>();
//
//	public static void main(String[] args) {
//
//		hp.put("java", 1000);
//		hp.put("spring", 2000);
//		hp.put("hibernate", 500);
//
//		for (Map.Entry a : hp.entrySet()) {
//
//			System.out.println(a.getKey() + " " + a.getValue());
//		}
//
//	}
//
//	void sortByValue(boolean order) {
//
//		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(hp.entrySet());
//
//		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//
//				if (order) {
//
//					return o1.getValue().compareTo(o2.getValue());
//				} else {
//
//					return o2.getValue().compareTo(o1.getValue());
//				}
//
//			}
//		});
//		
//		Map<String,Integer> sortMap=new LinkedHashMap<>();
//		
//		for(Entry<String,Integer> entry:list) {
//			
//			sortMap.put(entry.getKey(),entry.getValue());
//		}
//		
//	}
//
//}
