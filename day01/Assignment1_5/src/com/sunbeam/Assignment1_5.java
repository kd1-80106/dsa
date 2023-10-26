//5. find the first non-repeating element:
//	Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
//	Ouput: 3

package com.sunbeam;

public class Assignment1_5 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int count = 0;

		for (int i = 0; i < arr.length-1; i++) {
			count=0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println("First non repeating element = " + arr[i]);
			break;
			}
		}
	}

}
