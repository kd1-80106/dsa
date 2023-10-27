//7. Write program to implement linear queue in which front and rear starts at 0.

package com.sunebam;

import java.util.Scanner;

public class Assignment2_7 {
	
	

	public static void main(String[] args) {
		
		Queue2_7 q = new Queue2_7(4) ;
		int choice ;
		Scanner sc = new Scanner(System.in);
	
		do {
			
			
			System.out.println("0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("enter choice to perorm operation");
			choice = sc.nextInt();
			switch(choice) {
			
			case 1 :
				if(q.isFull()) 
					System.out.println("Queue is full");
				else
					System.out.println("Enter data");
				     int data = sc.nextInt();
				     q.push(data);
				     
		    break ;
		    
				     
			case 2 :
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else 
					System.out.println("data pop we must...!!!");
				    q.pop();
              break ;		    	
		    	
			
			case 3 : 
				if(q.isEmpty())
				System.out.println("Queue is empty ");
				else
					//System.out.println("Data peek we must.....!!!");
				    System.out.println("peeked element" + q.peek());
			
			}
			
		
		
		}	while(true) ;
		

	}

}
