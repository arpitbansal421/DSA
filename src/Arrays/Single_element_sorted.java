package Arrays;

import java.util.*;
/*Leetcode 540
 * 
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 
 * 
 * 
 * 
 */
	public class Single_element_sorted {
	
		public int singleNonDuplicate(int[] nums) {
	        /*we knew that array is sorted and we have to find the non repeating element in log(n)
	time complexity so obiviously we have to use binary search
	//firsly we will find our mid element and check whether it is similar to left and right side
	or not 
	and similar elements will always appers right side so will total element including mid and the right most element because if the count is not their will no unique element as 
	 1 1 2 2
	 1 2
	 so their can be two more unique element not one
	
	*/
	
	//boundary cases
	
	if(nums.length==1){
	    return nums[0];
	}
	if(nums[0]!=nums[1]){
	    return nums[0];
	}
	int n=nums.length-1;
	if(nums[n]!=nums[n-1]){
	    return nums[n];
	}
	
	
	
	int lo=0;
	int hi=n;
	
	while(lo<=hi){
	    
	    int mid=lo+(hi-lo)/2;
	   
	    //when our middle element is non duplicate element
	    if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
	        return nums[mid];
	    }
	    
	    //left side check
	    
	    if(nums[mid]==nums[mid-1]){
	        int lc=mid-lo+1;
	      
	        //if left is of even lenght so it impossible to non duplicate element on left
	        if(lc%2==0){
	            lo=mid+1;
	        }else{
	            hi=mid-2;
	        }
	    }else if(nums[mid]==nums[mid+1]){
	        int rc=hi-mid+1;
	        if(rc%2==0){
	            hi=mid-1;
	        }else{
	            lo=mid+2;
	        }
	    }
	}
	
	return -1;
	
	
	
	}

}
