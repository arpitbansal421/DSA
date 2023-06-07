package Sliding_Window;

//leetcode 560
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

//A subarray is a contiguous non-empty sequence of elements within an array.


 
import java.util.*;
public class subarray_sums_equal_to_k {
	
	 public int subarraySum(int[] arr, int k) {
	        int ei=0;
	        
	        
	        int sum=0;
	        int ans=0;
	        HashMap<Integer,Integer>map=new HashMap<>();
	        
	        map.put(0,1);
	        while(ei<arr.length){
	            
	             sum+=arr[ei];
	            
	            if(map.containsKey(sum-k)){
	                
	                ans+=map.get(sum-k);
	                
	            }
	            
	            if(map.containsKey(sum)){
	                map.put(sum,map.get(sum)+1);
	            }
	            else{
	            map.put(sum,1);
	            }
	            ei++;
	            
	            
	        }
	        
	        return ans;
	       
	        
	        
	        
	   
	}

}
