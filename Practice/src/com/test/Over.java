package com.test;

public class Over {

	void sum(int num1, int num2) {

		int result;
		result = num1 + num2;
		System.out.println(result);
	}

	void sum(int num1, int num2, int num3) {

		int result;
		result = num1 + num2 + num3;
		System.out.println(result);
	}

	public static void main(String[] args) {

		Over o = new Over();
		o.sum(10, 20);
		o.sum(19, 10, 22);

	}

}
