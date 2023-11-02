package com.sunbeam;

public class DescStack {
	
	private int arr[] ;
	private int top ;
	private final int SIZE ;
	
	public DescStack(int size){
		SIZE = size ;
		top = SIZE ;
		arr = new int[SIZE] ;
		
	}
	
	public void push(int data) {
	   top-- ;
	   arr[top] = data ;
	}
	
	public int pop() {
		int data = arr[top] ;
		top-- ;
		return data ;
	}

	
	public int peek() {
		return arr[top] ;
	}
	
	public boolean  isFull() {
		return  top == 0 ;
	}
	
	public boolean isEmpty() {
	   return	top == SIZE ;
	}
}
