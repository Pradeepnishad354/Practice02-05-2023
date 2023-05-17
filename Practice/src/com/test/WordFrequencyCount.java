package com.test;

import java.util.HashMap;

public class WordFrequencyCount {
	public static void main(String[] args) {

		String str ="hello pradeep hello pradeep hello";

		String[] st = str.split(" ");

		HashMap<String, Integer> hp = new HashMap<>();

		for (int i = 0; i < st.length; i++) {

			if (hp.containsKey(st[i])) {

				hp.put(st[i], hp.get(st[i]) + 1);
			} else {

				hp.put(st[i], 1);
			}

		}
		System.out.println(hp);
	}

}
