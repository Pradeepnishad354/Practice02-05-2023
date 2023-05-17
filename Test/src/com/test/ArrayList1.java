package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(90);
		a.add(12);
		a.add(13);
		a.add(16);
		a.add(17);
		a.add(2);

		Collections.sort(a);
		System.out.println(a);

	}

}
