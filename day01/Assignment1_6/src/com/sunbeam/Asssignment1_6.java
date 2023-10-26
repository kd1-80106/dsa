//6. to find rank of an element in a stream of integers.
//rank: rank of a given integer "x", in stream is "total no. of ele's less than or equal to x (including x).
//	
//	Input: { 10, 20, 15, 3, 4, 4, 1 }
//	Ouput: Rank of 4 is: 4

package com.sunbeam;

public class Asssignment1_6 {
	
	public static int LinearSearch(int [] arr , int size , int key)
	{
	    int count = 0 ; 
	    for(int i = 0 ; i < size  ; i++) {

	    	if(arr[i] <= key)
	    		count++ ;
	    		
	    }
		
		return count ;
	}

	public static void main(String[] args) {
		
		
		int [] arr = { 10, 20, 15, 3, 4, 4, 1 } ;
		int key = 15 ;
		
		int xStream = LinearSearch(arr, arr.length, key);
		System.out.println("xStream");
		
		System.out.println("xStream = " + xStream);
		
		
	}

}
