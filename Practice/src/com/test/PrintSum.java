package com.test;

public class PrintSum {

	// print the sum of 10 natural numbers
	public static void main(String[] args) {
		int num = 10;
		int sum = 0;

		for (int i = 1; i <= num; i++) {

			sum = i + sum;

		}

		System.out.println(sum);
	}

}
