package LinkedList;

import java.util.*;
public class reverse_linked_list_by_adress_iteration {
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
	public static void printlist() {
		
		Node temp=head;
		while(temp!=null) {
			
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		
	}
	
	public static void reverselistbyadressiteration() {
		Node temp=head;
		Node prev=null;
		while(temp!=null) {
		
			Node another=temp.next;
			temp.next=prev;
			prev=temp;
			temp=another;
		
		}
		
		Node atemp=head;
		head=tail;
	tail=atemp;
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
		}
		
		reverselistbyadressiteration();
		printlist();
	}
	

}
