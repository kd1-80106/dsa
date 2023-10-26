//2. Create array of employees and search employee by 
//	i. empid
//	ii. name
//	iii. salary


package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int empid ;
	private String name ;
	private double salary ;
	
	
	public Employee() {}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	void acceptEmployee()
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter empid");
       this.empid = sc.nextInt() ;
       sc.nextLine();
       System.out.println("Enter name");
       this.name = sc.nextLine() ;
       
       System.out.println("Enter salary");
       this.salary = sc.nextDouble() ;
       
	}
	
	void displayEmployee()
	{
       System.out.println("empid = " + empid);
       System.out.println(" name = " + name);
       System.out.println(" salary = " + salary );
       
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
