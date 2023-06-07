package LinkedList;

import java.util.*;

public class reverse_linked_list_by_recurssion_adreess {
	

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
		
		public static void reverselinkedlist() {
			
			Node prev=null;
			Node curr=head;
			reverselinkedlist(prev,curr);
			Node atemp=head;
			head=tail;
			tail=atemp;
			
		}

		private static void reverselinkedlist(Node prev, Node curr) {
			// TODO Auto-generated method stub
			
			if(curr==null) {
				return;
			}
			reverselinkedlist(curr,curr.next);
			curr.next=prev;
			
			
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			head=new Node(sc.nextInt());
			tail=head;
			for(int i=1;i<n;i++) {
				tail.next=new Node(sc.nextInt());
				tail=tail.next;
				
			}
			
			reverselinkedlist();
			printlist();
		}
		
	}
