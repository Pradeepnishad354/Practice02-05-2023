package com.test;

import java.util.HashMap;

public class CharFrequencyCount {

	public static void main(String[] args) {

		String str = "har har mahadev";

		char[] st = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < st.length; i++) {

		char c = str.charAt(i);

			if (hm.containsKey(c)) {

				hm.put(st[i], hm.get(st[i]) + 1);
			} else {
				hm.put(st[i], 1);
			}
		}
		System.out.println(hm);

	}

}
