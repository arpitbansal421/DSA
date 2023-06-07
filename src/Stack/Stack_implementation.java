package Stack;

import java.util.*;
public class Stack_implementation {
	
	int[]arr;
	int top;
	
	public Stack_implementation(int cap) {
		this.arr=new int[cap];
		this.top=0;
	}
	
	public Stack_implementation() {
		this.arr=new int[10];
		this.top=0;
	}
	int size;
	
	public boolean isfull() {
		return this.top==this.arr.length;
	}
	
	public boolean isempty() {
		return this.top==0;
	}
	
	public void push(int item) throws Exception {
		if(this.isfull()) {
			throw new Exception("Stack is full");
			
		}else {
			this.arr[top]=item;
			this.top++;
			this.size++;
		}
	}
	
	public int pop() throws Exception {
		if(this.isempty()) {
			throw new Exception("Stack is Empty()");
		}
		else {
			this.top--;
			int rv=arr[this.top];
			arr[top]=0;
			this.size--;
			return rv;
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public int peek() throws Exception {
		if(this.isempty()) {
			throw new Exception("Stack is Empty");
		}
		else {
			return this.arr[top-1];
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Stack_implementation ss=new Stack_implementation();
		ss.push(0);
//		ss.push(10);
//		ss.push(15)
//		;ss.push(3);
//		ss.push(7);
//		ss.push(9);
//		ss.push(11);
//		ss.pop();
		ss.pop();
		ss.pop();
		System.out.println(ss.peek());
		
		
	}
	

}
