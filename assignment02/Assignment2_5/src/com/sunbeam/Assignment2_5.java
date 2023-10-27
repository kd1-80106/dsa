//5. Write a function to sort employees by their salary.

package com.sunbeam;

import java.util.Scanner;

public class Assignment2_5 {

	public static void sortEmployeesBySalary(Employee[] arr, int N) {
		
		for(int i = 0 ; i < N-1 ; i++) {
			for(int j = i+1 ; j < N ; j++) {
				
				if(arr[i].getSalary() > arr[j].getSalary()) {
					Employee temp = arr[j];
					arr[i] = arr[j];
					arr[j] = temp ; 
				}
			}
		}

  		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee[] arr = new Employee[5];
		arr[0] = new Employee(1, " Rajesh", 30000);
		arr[1] = new Employee(2, " Brajesh", 50000);
		arr[2] = new Employee(3, " Grajesh", 70000);
		arr[3] = new Employee(4, " Krajesh", 80000);
		arr[4] = new Employee(5, " Frajesh", 90000);
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("------------------------------------------------");
		System.out.println("Employee array Before sort = " + arr[i]); 
		
		}

		sortEmployeesBySalary(arr, 5);
		System.out.println();
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("------------------------------------------------");
			System.out.println("Employee array After sort = " + arr[i]);
			
			}

		


	}

}
