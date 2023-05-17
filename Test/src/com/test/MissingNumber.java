package com.test;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 6, 9 };

		
		missingNumber(a);
	}

	public static void missingNumber(int a[]) {

		HashSet<Integer> set = new HashSet<>();
		for (int num : a) {

			set.add(num);
		}
		int n = a.length + 1;

		for (int i = 0; i < n; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
