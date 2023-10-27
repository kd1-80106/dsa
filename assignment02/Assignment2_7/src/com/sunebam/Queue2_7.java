////7. Write program to implement linear queue in which front and rear starts at 0.

package com.sunebam;

public class Queue2_7 {
	
	private int [] arr ;
	private int rear , front ;
	private final int SIZE  ;
	int count = 0  ;
	
	public Queue2_7(int size) {
		SIZE = size ;
		arr = new int[SIZE] ;
		front = 0 ; 
		rear = 0 ;
	}
	
	public void push(int data) {
		rear++ ;
		arr[rear] = data ;
	    count++ ;	
	}
	
	
	public void pop() {
		front++ ;
		count-- ;
	}
	
	public int peek() {
		return arr[front + 1];
	}
	
    public boolean isFull()
    {
    	return count == SIZE -1 ;
    }
    
    public boolean isEmpty() {
    	return count == front ;
    }
	

}
