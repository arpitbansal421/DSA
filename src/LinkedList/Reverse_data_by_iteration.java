package LinkedList;
import java.util.*;
public class Reverse_data_by_iteration {
	
	static class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
		
		public Node() {
			
		}
		
		
	}
	
	static Node head;
	static Node tail;
	static int size;
	
	public static Node getnodeatindex(int i ) {
		Node temp=head;
		if(i==0) {                                                                   
			return head;
		}   
		if(i==size-1) {
			return tail;
		}
		
		for(int j=0;j<i;j++) {
			temp=temp.next;
			
		}
		
		return temp;
	}
	public static void printlist(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	public static void reverselistbyiteration(Node head) {
		
		int i=0;
		int j=size-1;
	
		
		while(i<j) {
			
			int temp=getnodeatindex(j).data;
			getnodeatindex(j).data=getnodeatindex(i).data;
			getnodeatindex(i).data=temp;
			i++;
			j--;
			
			
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 head=new Node(sc.nextInt());
	
		tail=head;
		size=size+1;
		for(int i=1;i<n;i++) {
			tail.next=new Node(sc.nextInt());
			tail=tail.next;
			size++;
		}
//		printlist(head);
	
		reverselistbyiteration(head);
		printlist(head);
	
	}

}
