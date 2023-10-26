//4. Implement linear search algorithm to find the nth occurence of the given element. 
//If nth occurrence is not found, return -1.
//

package com.sunbeam;

import java.util.Scanner;

public class Assignment1_4 {
	
	public static int nthOccurence(int [] arr , int size , int key,int occurance){
		int count = 0 ; 
		for(int i = 0 ; i < size ; i++) {
			if( key == arr[i]) {
				count++ ;
				
			}
			if(occurance==count)
				return i ; 		
		 	
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] arr = {11,22,33,44,11,22,33,11,44 };
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element to find nth occurrence"); // not first 
		int element = sc.nextInt() ;
		
		int occr = nthOccurence(arr, arr.length, element,3);
		
		
		System.out.println(occr);
		

	}

}
