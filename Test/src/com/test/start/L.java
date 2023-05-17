package com.test.start;

public class L {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 90, 40, 70, };

		int l = arr.length;

		thirdLargest(arr, l);

	}

	static void thirdLargest(int arr[], int arrsize) {

		if (arrsize < 3) {

			System.out.println("invalid input");
			return;
		}

		int first = arr[0] = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int i = 1; i < arrsize; i++) {

			if (arr[i] > first) {

				third = second;
				second = first;
				first = arr[i];
			}

			else if (arr[i] > second) {

				third = second;
				second = arr[i];
			} else if (arr[i] > third) {

				third = arr[i];
			}

		}
		System.out.println("third largestnumber is" + third);
	}

}
