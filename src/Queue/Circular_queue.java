package Queue;

//the normal queue has not of space wastage
import java.util.*;
public class Circular_queue {
	int[]arr;
	int front;
	
	public Circular_queue(int cap) {
		this.arr=new int[cap];
		this.front=0;
	}
	
	public Circular_queue() {
		this.arr=new int[10];
		this.front=0;
	}
	
	int size=0;
	public boolean isempty() {
		
		return this.size==0;
	}
	
	public boolean isfull() {
		return this.size==this.arr.length;
	}
	
	public void enqueue(int item) throws Exception {
		
		if(this.isfull()) {
			throw new Exception("Queue is full");
		}
		
		this.arr[(this.size+this.front)%arr.length]=item;
		this.size++;
	}
	
	public int dequeue() throws Exception {
		if(this.isempty()) {
			throw new Exception("Queue is Empty");
		}
		int item=this.arr[this.front];
		
		this.front=(this.front+1)%this.arr.length;
		
		this.size--;
		
		return item;
	}
	
	public int getFront() throws Exception {
		if(this.isempty()) {
			throw new Exception("pgl ho kya , Queue  kahli hai");
		}
		int item = this.arr[this.front];
		return item;
	}
	
	public void Display() {
		
		for (int i = 0; i <this.size; i++) {
			int idx=(this.front+i)%this.arr.length;
			
			System.out.print(this.arr[idx]+" --> ");
		}
		System.out.println(".");
		
	}
	
	public static void main(String[] args) throws Exception {
		Circular_queue qq=new Circular_queue();
		qq.enqueue(10);
		
		qq.enqueue(5);
		qq.enqueue(6);
		qq.enqueue(7);
		qq.enqueue(90);
		qq.enqueue(8);
		qq.dequeue();
		qq.enqueue(0);
		
		qq.Display();
		
	}

	
}
