package com.sunbeam;

import java.util.Scanner;

public class DescStackMain {

	public static void main(String[] args) {
	   
		int choice ;
		DescStack st = new DescStack(4);
		
		Scanner sc  = new Scanner(System.in);
		
		do {
			
		
			
			System.out.println("0.EXIT\n1.PUSH\n2.POP\n3.PEEK");
			System.out.println("Enter the choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :
				if(!st.isFUll()) 	
				{
					System.out.println("Enter data");
					int data = sc.nextInt() ;
					st.push(data);
				}	
				else
					{
					System.out.println("Stack is full");
					}
			
			break ;
				
			case 2 : 
				if(!st.isEmpty())
					
				System.out.println("popped data = " + st.pop());
				else {
					System.out.println("stack is  EMPTY");
				}
				
				break ;	
				
			case 3 :
				if(!st.isEmpty()) 
					System.out.println("peeked data = " + st.peek());
				else 
					System.out.println("Stack is empty");
				
				
				break ;
				
			}
			
			
		}while(choice!=0) ;
		

	}

}
