//. Write a program to print no of comparisions done to search a key in
//
//	ii. binary serach

package com.sunbeam;

import java.util.Scanner;

public class BinarySearchCount {

	
	public static int BinaryComparisons(int[]arr , int size , int key ) {
	   
	   int left = 0 , right = size-1 , mid ;
	   int count = 1  ;
	   
	   while(left <= right)
	   {
		   mid = (left + right) /2 ;
		   
		   if(key == arr[mid]) 
			   return count;
			  
			   
		   
		   else if(key <= arr[mid] ) //come to left sub array
		   {
			right = mid - 1 ;
			mid = (left + right) /2  ;
			
			
		   }
		   else if(key > arr[mid]) {
			   left = mid + 1 ;
			   mid = (left + right) / 2;
			   
		   }
		
		    ++count ;
	   }
		
	   return count ;

		 
	}
	
	public static void main(String[] args) {
		
		int arr[] = {11,22,33,44,55,66,77,88,99};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter key from user ");
		int key = sc.nextInt();
		
		
		int index = BinaryComparisons(arr, arr.length, key);
		System.out.println("Number of Comparisions Binary search = " + index );
		

	}

}
