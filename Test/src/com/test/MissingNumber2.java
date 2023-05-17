package com.test;

import java.util.HashSet;

public class MissingNumber2 {
	public static void main(String[] args) {
		
		int a[]= {2,5,6,7,8,4};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int  s: a) {
			
			set.add(s);
		}
		
	//	int n=a.length+1;
		
		for(int i=0; i<a.length+1; i++) {
			
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
		
	}

}
