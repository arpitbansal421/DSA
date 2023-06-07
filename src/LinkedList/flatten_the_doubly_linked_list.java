package LinkedList;
import java.util.*;

//leetcode 430
//flatten the linked list
/*
 * You are given a doubly linked list, which contains nodes that have a next pointer,
 *  a previous pointer, and an additional child pointer. This child pointer may or may 
 *  not point to a separate doubly linked list, also containing these special nodes. 
 *  These child lists may have one or more children of their own, 
 * and so on, to produce a multilevel data structure as shown in the example below.
 * 
 * 
 * 
 * 
 */


public class flatten_the_doubly_linked_list{
	
	class Node {
	    public int val;
	    public Node prev;
	    public Node next;
	    public Node child;
	}
	 public Node flatten(Node head) {
	       Node curr=head;
	        Node tail=curr;
	        Stack<Node>ss=new Stack<>();
	        while(curr!=null){
	            
	            if(curr.child!=null){
	                Node child=curr.child;
	                
	                if(curr.next!=null){
	                    ss.push(curr.next);
	                    curr.next.prev=null;
	                }
	                
	                curr.next=child;
	                child.prev=curr;
	                curr.child=null;
	                
	            }
	            tail=curr;
	            curr=curr.next;
	            
	        }
	        
	        while(!ss.isEmpty()){
	            
	            Node link=ss.pop();
	            
	            tail.next=link;
	            link.prev=tail;
	            while(link!=null){
	                tail=link;
	                link=link.next;
	            }
	           
	        }
	        
	        return head;
	        
	        
	    }
}