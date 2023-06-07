package binary_search;
import java.util.*;
/*
 * 410. Split Array Largest Sum
 * Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.
 * 
 */
public class Spilt_array {
	  public int splitArray(int[] nums, int k) {

	        int t=0;
	        //   Arrays.sort(nums);
	        for(int i=0;i<nums.length;i++){
	            t+=nums[i];
	        }
	       
	       int lo=nums[0];
	       int hi=t;
	       int ans=0;
	       while(lo<=hi){
	           int mid=lo+(hi-lo)/2;

	           if(isitpossible(nums,mid,k)){
	               ans=mid;
	               hi=mid-1;

	           }else{
	               lo=mid+1;
	           }
	       }

	       return ans;
	        
	    }

	    public boolean isitpossible(int[]nums,int mid,int k){
	    
	        int s=1;

	        int i=0;
	        int total=0;
	        while(i<nums.length){

	            if(total+nums[i]<=mid){
	                total+=nums[i];
	                i++;
	            }else{
	                total=0;
	                s++;

	            }

	            if(s>k){
	                return false;
	            }
	            
	            
	            
	        }

	        return true;

	}

}
