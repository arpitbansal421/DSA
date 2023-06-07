package LinkedList;
//leetcode 25
/*
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. 

If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.
 * 
 * 
 * 
 */
import java.util.*;
public class Reverse_nodes_in_k_groups {
	
	 public class ListNode {
		      int val;
		      ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode start=head;
        ListNode end=head;
        for(int i=0;i<k-1;i++){
            end=end.next;
            
            if(end==null){
                return head;
            }
        }
        
        ListNode nexthead=reverseKGroup(end.next,k);
        reverse(start,end);
        
        start.next=nexthead;
        return end;
        
        
        
        
    }
    
    public void reverse(ListNode start,ListNode end){
        ListNode prev=null;
        ListNode curr=start;
        while(prev!=end){
            
            ListNode another=curr.next;
            curr.next=prev;
            prev=curr;
            curr=another;
        }

}}
