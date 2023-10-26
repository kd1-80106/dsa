 //3. Implement binary search algorithm if array is sorted in descending order.

package com.sunbeam;

import java.util.Scanner;

public class Assignment1_3 {
	
	public static int binarySearchDesc(int[] arr, int size , int key) {
		
		int left = 0 , right = size , mid ;
		int count = 1 ;
		while(left<right) {
			
			
			mid = (left+right) / 2 ;
			
			
			if(key == arr[mid]) 
				return count ;
			else if(key < arr[mid]) { // select right sub array as ot is in descending order 
				left = mid + 1 ;
				
				mid = (left+right) / 2 ;
				
			}
			
			else if(key >= arr[mid]) {
				
				right = mid -1 ;
				mid = (left+right) / 2 ;
				
			}
			
			count++ ;  // at the end of while loop we have increased counter
		}
		
		return count  ;
	}
	
	public static void main(String [] args) {
		
		int [] arr = {60,50,40,30,20,10 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search ");
		
		int key = sc.nextInt() ;
		int index  = binarySearchDesc(arr, arr.length, key);
		System.out.println("no. of comparisions = " + index );
		
	}
	
	

}
