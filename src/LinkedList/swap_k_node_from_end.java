package LinkedList;

import java.util.*;
public class swap_k_node_from_end {
	static class Node{
		int data;
		Node next;

		public Node(int data){
			this.data=data;
		}

		public Node(){

		}
	}

	public static void printnode(Node head){
		Node t=head;
		while(t!=null){
			
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
    public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Node head=new Node(sc.nextInt());

		Node temp=head;
		for(int i=1;i<n;i++){
			temp.next=new Node(sc.nextInt());
			temp=temp.next;
		}
		
		removeNthFromEnd(head,k);

		
    }
    
 public static void removeNthFromEnd(Node head, int n) {
        
        Node slow=head;
        
        Node fast=head;
        //now we will move our fast node by k
        
        if(head.next==null && n==1){
            printnode(head.next);
            return ;
        }
        for(int i=1;i<=n;i++){
            
            fast=fast.next;
        }
        
        if(fast==null){
            printnode(head.next);
            return;
        }
        while( fast!=null &&fast.next!=null){
            
            fast=fast.next;
            slow=slow.next;
        }
      
        slow.next=slow.next.next;
        
        printnode(head);
        return;

      
}

}
