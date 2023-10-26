//2. Create array of employees and search employee by 
//	i. empid
//	ii. name
//	iii. salary

package com.sunbeam;

import java.util.Scanner;

public class Assignment1_2 {

	public static int SearchByEmpSalary(Employee[] arr, double EmpSalary, int size) {
		for (int i = 0; i < size; i++) {
			if (EmpSalary == arr[i].getSalary()) {
				arr[i].displayEmployee();
				return 1;
			}
		}
		return -1;
	}

	public static int SearchByEmpName(Employee[] arr, String EmpName, int size) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getName().equals(EmpName))
					return 1;
			
		}
		return -1;
//		for (int i = 0; i < size; i++) {
//			if (EmpName == arr[i].getName()) {
//				System.out.println(arr[i].toString());
//				return 1;
//			}
//		}
//		return -1;
	}

	public static int SearchByEmpId(Employee[] arr, int empid, int size) {
		for (int i = 0; i < size; i++) {
			if (empid == arr[i].getEmpid()) {
				return 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of employees");

		int NoOfEmployees = sc.nextInt();
		Employee[] arr = new Employee[NoOfEmployees];

		System.out.println("Accept employees");
		for (int i = 0; i < NoOfEmployees; i++) {
			arr[i] = new Employee();
			arr[i].acceptEmployee();
		}

		System.out.println("Display employees");
		for (int i = 0; i < NoOfEmployees; i++) {

			arr[i].displayEmployee();
		}

		do {
			int choice;

			System.out.println("0.EXIT");
			System.out.println("1.SearchByEmpId ");
			System.out.println("2.SearchByEmpName");
			System.out.println("3.SearchByEmpSalary");

			System.out.println("Enter choice ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Search employees by empId");
				System.out.println("enter employee Id to search ");
				int keyEmpId = sc.nextInt();

				int id = SearchByEmpId(arr, keyEmpId, NoOfEmployees);
				System.out.println("Searched empid is = " + id);
				System.out.println(arr[id]);

				break;

			case 2:
				System.out.println("Search employees by empName");
				System.out.println("Enter empName");
				String nameKey = sc.next();

				int nameKeyMethod = SearchByEmpName(arr, nameKey, NoOfEmployees);
				System.out.println(nameKeyMethod);
//				System.out.println("searched name " + nameKey + " has been found ");
//				 System.out.println(arr[nameKeyMethod].toString());

				break;

			case 3:

				System.out.println("Enter salary to search");
				double salaryKey = sc.nextDouble();

				int salaryKeyMethod = SearchByEmpSalary(arr, salaryKey, NoOfEmployees);
			    System.out.println(salaryKeyMethod);
				//	System.out.println("searched salary" + salaryKey + "has been found ");
				
				// System.out.println(arr[nameKey]);

				break;

			}

		} while (true);

	}

}
