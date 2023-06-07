package Stack;

import Stack.Queue;
public class Queue_reverse_without_Stack {
	public static void main(String[]args) throws Exception {
		Queue q=new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
//		q.Enqueue(10);
		q.Display();
		reverse(q,0);
		q.Display();
		
		
	}

	private static void reverse(Queue q,int item) throws Exception {
		// TODO Auto-generated method stub
		
		if(q.IS_empty()) {
			return;
		}
		int rv=q.Dequeue();
		reverse(q,rv);
		q.Enqueue(rv);
		
	}

}
