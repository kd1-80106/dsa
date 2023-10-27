//2. Write a bubble sort function to sort array and returns no of comparisions.

package com.sunbeam;

import java.util.Arrays;

public class Assignment2_2 {
	
	public static void khalDrogoBubbleSort1(int[] arr, int N) {
		int comp = 0;
		int passes = 0 ;
		int flag = 0 ;
		
		for (int i = 1; i < N; i++) {
			passes++ ; 
			for (int j = 0; j < N - i; j++) {
				comp++ ;   
				
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1 ;
				}
				
			}
			if(flag == 0)
			 break ;
		}
             System.out.println("Number of comparisons for khaldrogo " + (N-1) + " Iterations is " + comp );
             System.out.println("Number of passes =  " + passes );
	}


	public static void bubbleSort1(int[] arr, int N) {
		int comp = 0;
		for (int i = 1; i < N; i++) {
			for (int j = 0 ; j < N - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				comp++ ; 
			}
		}
             System.out.println("Number of comparisons for " + (N-1) + " Iterations is " + comp );
	}

	public static void main(String[] args) {

		int[] arr = { 44, 11, 55, 22, 66, 33 };
		 //int[] arr = { 15, 36, 95, 16, 76, 9, 87, 57 };
		System.out.println("Array Before sort = " + Arrays.toString(arr));

        
//		bubbleSort1(arr, arr.length);
//		System.out.println("Array After sort = " + Arrays.toString(arr));
		
		khalDrogoBubbleSort1(arr, arr.length);
		System.out.println("Array After sort = " + Arrays.toString(arr));
		

	}

}
