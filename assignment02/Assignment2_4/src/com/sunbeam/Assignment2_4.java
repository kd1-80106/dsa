//4. Modify the insertion sort algorithm to sort the array in descending order

package com.sunbeam;

import java.util.Arrays;

public class Assignment2_4 {

	public static int descInsertionSort(int[] arr, int N) {
		int comp = 0;
		for (int i = 1; i < N; i++) {

			int temp = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] < temp) {
				comp++;
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = temp;
		}

		return comp;
	}

	public static void main(String[] args) {

		int[] arr = { 44, 11, 55, 22, 66, 33 };
		// int[] arr = { 15, 36, 95, 16, 76, 9, 87, 57 };
		System.out.println("Array Before sort = " + Arrays.toString(arr));

		int comparisions = descInsertionSort(arr, arr.length);
		System.out.println("Array After sort = " + Arrays.toString(arr));
		System.out.println("Number of comparisions  = " + comparisions);

	}

}
