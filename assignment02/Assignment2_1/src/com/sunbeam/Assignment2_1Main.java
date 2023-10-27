//1. Write a selection sort function to sort array and returns no of comparisions.

package com.sunbeam;

import java.util.Arrays;

public class Assignment2_1Main {

	public static void selectionSort(int[] arr, int N) {

		int comparisons = 0;
		for (int i = 0; i < N - 1; i++) { // To manage Iterations
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					//comparisons++ ->> 5 dega if me 
				}
				comparisons++;  // comparision is in inner loop to count comparisions
			}
			

		}
		System.out.println("Number of comparisons for " + (N - 1) + " Iterations = " + comparisons);

	}

	public static void main(String[] args) {

		//int[] arr = { 44, 11, 55, 22, 66, 33 };
		int[] arr = { 15,36,95,16,76,9,87,57 };
		System.out.println("Array Before sort = " + Arrays.toString(arr));

		selectionSort(arr, arr.length);
		System.out.println("Array After sort = " + Arrays.toString(arr));

	}

}
