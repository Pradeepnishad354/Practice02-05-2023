package com.test;

import java.util.HashSet;

// find the missing number in array
public class MissingNum {

	public static void main(String[] args) {

		int a[] = {0,2,3, 4, 5, 6, 9, 7 };
		
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
