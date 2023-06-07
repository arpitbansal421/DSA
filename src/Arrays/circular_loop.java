package Arrays;

import java.util.*;
/*
 * Leetcode 457
 * You are playing a game involving a circular array of non-zero integers nums. Each nums[i] denotes the number of indices forward/backward you must move if you are located at index i:

If nums[i] is positive, move nums[i] steps forward, and
If nums[i] is negative, move nums[i] steps backward.
Since the array is circular, you may assume that moving forward from the last element puts you on the first element, and moving backwards from the first element puts you on the last element.

A cycle in the array consists of a sequence of indices seq of length k where:

Following the movement rules above results in the repeating index sequence seq[0] -> seq[1] -> ... -> seq[k - 1] -> seq[0] -> ...
Every nums[seq[j]] is either all positive or all negative.
k > 1
Return true if there is a cycle in nums, or false otherwise.
 * 
 * 
 * 
 * 
 */
public class circular_loop {
	
	 public boolean circularArrayLoop(int[] arr) {
	        
	        if(arr.length<=1){
	            return false;
	        }
	        for(int i=0;i<arr.length;i++){
	            int slow,fast;
	             fast=slow=i;
	            boolean dir=arr[i]>0;
	            
	            //infinite loop
	            while(true){
	                slow=nextindex(arr,slow,dir);
	                
	                if(slow==-1){
	                    break;
	            }
	                
	                fast=nextindex(arr,fast,dir);
	                
	                if(fast==-1){
	                    break;
	                    
	                }
	                
	                fast=nextindex(arr,fast,dir);
	                
	                if(fast==-1){
	                    break;
	                }
	                if(slow==fast){
	                    return true;
	                }
	                
	            }
	        }
	        
	        return false;
	    }
	    
	    
	    public int nextindex(int[]arr,int idx,boolean dir){
	        
	        boolean currdir=arr[idx]>=0;
	        
	        //cycle should be in same clock direction
	        if(dir!=currdir){
	            return -1;
	        }                    
	        
	        int next=(arr[idx]+idx)%arr.length;
	        
	        if(next<0){
	            next=(next+arr.length);
	        }
	        
	        //the cycle should greater than of length 1
	        if(next==idx){
	            return -1;
	        }
	        
	        return next;
	        
	    }
	}

}
