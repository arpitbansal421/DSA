package Arrays;

import java.util.*;
/*//leetcode 2488
 * You are given an array nums of size n consisting of distinct integers from 1 to n and a positive integer k.

Return the number of non-empty subarrays in nums that have a median equal to k.

Note:

The median of an array is the middle element after sorting the array in ascending order. If the array is of even length, the median is the left middle element.
For example, the median of [2,3,1,4] is 2, and the median of [8,4,3,5,1] is 4.
A subarray is a contiguous part of an array.
 * 
 * 
 */

public class Count_subarray_with_median_k {
	
	 public int countSubarrays(int[] nums, int k) {
	        HashMap<Integer,Integer>map=new HashMap<>();
	        map.put(0,1);

	        boolean found=false;
	        int sum=0;
	        int ans=0;
	        for(int i:nums){

	            if(i<k){
	                sum--;
	            }else if(i>k){
	                sum++;
	            }
	            else{
	                found=true;
	            }

	            if(found){
	                ans+=map.getOrDefault(sum,0)+map.getOrDefault(sum-1,0);

	            }else{
	                map.put(sum,map.getOrDefault(sum,0)+1);

	                
	            }

	        }

	        return ans;
	    }

}
