package LinkedList;

import java.util.*;

public class reverse_linked_list_recurrsion_iteration {

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
	
	static class heapmover{
		Node move;
		
		public heapmover(Node move) {
			this.move=move;
		}
		public heapmover() {
			
		}
	}
	
	public static void reverselinkedlist() {
		heapmover mover=new heapmover(head);
//		reverselinkedlist
		
		
		
	}
}
