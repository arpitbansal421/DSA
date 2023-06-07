package Queue;
/*
 *in queue we basically follow FIfo operation first in first out
 * 
 * 
 * 
 * 
 */
import java.util.*;

public class Queue {
	int[]arr;
	int front;//it will keep track of front element entering in the queue
	int rear; //it will keep track of the element entering in the end of the queue
	
	public Queue(int cap) {
		this.arr=new int[cap];
		this.front=0;
		this.rear=0;
		
	}
	
	public Queue() {
		this.arr=new int[10];
		this.front=0;
		this.rear=0;
	}
	
	int size=0;
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public boolean isfull() {
		return this.rear==this.arr.length;
	}
	
	public void enqueue(int item) throws Exception {
		
		if(isfull()) {
			throw new Exception("Your queue is full");
		}else {
			this.arr[this.rear]=item;
			this.rear++;
			this.size++;
		}
		
		
	}
	
	public int deque() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Your queue is full");
		}else {
			int item1=arr[this.front];
			arr[this.front]=0;
			this.front++;
			this.size--;
			return item1;
		}
	}
	
	public int getfront() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Your queue is Empty");
		}
		
		return arr[this.front];
		
		
	}
	
	public void display() {
		int s=this.front;
		int e=this.rear;
		for(int i=s;i<e;i++) {
			System.out.print(arr[i]+"-->");
		}
		
		System.out.println(".");
	}
	
	public static void main(String[] args) throws Exception {
		Queue qq=new Queue(10);
		qq.enqueue(10);
		qq.enqueue(19);
		qq.enqueue(6);
		qq.enqueue(5);
		qq.enqueue(3);
		qq.enqueue(4);
		qq.deque();
		qq.display();
		
		
	}

}
