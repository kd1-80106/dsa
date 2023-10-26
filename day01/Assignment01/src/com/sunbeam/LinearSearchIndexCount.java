//1. Write a program to print no of comparisions done to search a key in
//	i. linear search
//	ii. binary serach

package com.sunbeam;

import java.util.Scanner;

public class LinearSearchIndexCount {

	public static int linear_search(int []arr , int size , int key)
	{
		int i;
		for( i = 0 ; i < size ; i++)
		{
			if(arr[i]==key)
				return ++i ;
		}
		
		return i+1 ;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {11,22,33,44,55,66,77,88,99};
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Input key from user");
		int key = obj.nextInt();
		
		int index = linear_search(arr, arr.length, key) ;
		if(index != -1)
		System.out.println("Number of comparisons Linear search  = " + index );
		
		
		
		
		
		
		

	}

}
