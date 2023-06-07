package Stack;

import java.util.*;
/*leetcode 862
 * 
 * 862. Shortest Subarray with Sum at Least K
 * Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums with a sum of at least k. If there is no such subarray, return -1.

A subarray is a contiguous part of an array.

*/
public class sub_array_sum_atlest_equal_k {
	
	 public int shortestSubarray(int[] nums, int k) {
	        Deque<Pair>dq=new LinkedList<>();
	        
	        dq.addLast(new Pair(0,-1));
	        int sum=0;
	        int ans=Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++){
	            
	            sum+=nums[i];  
	            //case 1
	            //when peek sum of the dequeue is greater than the sum
	            while(!dq.isEmpty()&& dq.peekLast().sum>=sum){
	              
	                dq.pollLast();
	            }
	            
	            //when our current sum is equal to the target sum
	            while(!dq.isEmpty()&& sum-dq.peekFirst().sum>=k){
	               
	                int len=i-dq.peekFirst().idx;
	                
	                ans=Math.min(ans,len);
	                dq.pollFirst();
	                if(!dq.isEmpty()){
	                // sum-=dq.peekFirst().sum;
	                
	                }
	                
	                
	            }
	            
	            dq.addLast(new Pair(sum,i));
	            
	            
	            
	        }
	        
	        return ans==Integer.MAX_VALUE?-1:ans;
	        
	        
	    }
	    
	    class Pair{
	        
	        int sum;
	        int idx;
	        public Pair(int sum,int idx){
	            this.sum=sum;
	            this.idx=idx;
	        }
	        
	        public Pair(){
	            
	        }
	    }

}
