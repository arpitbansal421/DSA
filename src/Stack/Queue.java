package Stack;



import java.util.Stack;

public class Queue {

	private int[] arr;


	protected int front;
	int size;

	public Queue() {
		// TODO Auto-ge//nerated constructor stub
//		System.out.println("in Queue");

		this.arr = new int[5];
		this.front = 0;
		this.size = 0;
	}
	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		this.arr = new int[cap];
		this.front = 0;
		this.size = 0;
	}
	public boolean IS_empty() {
		return this.size == 0;
	}
	public  boolean IS_full() {
		return this.size == this.arr.length;
	}
	public void Enqueue(int item) throws Exception {
		
		
		if(this.IS_full()) {
			throw new Exception("ek baar me smjhnhi aata hai Queue full hogya");
		}
       int idx = (this.front+this.size)%this.arr.length;
		this.arr[idx] = item;
		this.size++;
	}
	public int getFront() throws Exception {
		if(this.IS_empty()) {
			throw new Exception("pgl ho kya , Queue  kahli hai");
		}
		int item = this.arr[this.front];
		return item;
	}
	public int Dequeue() throws Exception {
		
		if(this.IS_empty()) {
			throw new Exception("pgl ho kya , Queue  kahli hai");
		}
		int item = this.arr[this.front];
		this.front=(this.front+1)%arr.length;
		this.size--;
		return item;
	}
	public int size() {
		return this.size;
	}
	
	public void Display() {
		
		for (int i = 0; i <this.size; i++) {
			int idx=(this.front+i)%this.arr.length;
			
			System.out.print(this.arr[idx]+" --> ");
		}
		System.out.println(".");
		
	}

//public class Queue_reverse {
	
	public static void main(String[]args) throws Exception {
		
		Queue q=new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		reverse(q);
		q.Display();
//		q.Dequeue();
		
		
	}
	
	public static void reverse(Queue q) throws Exception {
		Stack<Integer>s1=new Stack<>();
		int size=q.size();
		for(int i=0;i<size;i++) {
			s1.push(q.Dequeue());
		
		}
//		System.out.println(s1);
		for(int i=0;i<size;i++) {
			q.Enqueue(s1.pop());
		}
		
		
	
	}

}
