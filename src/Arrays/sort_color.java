package Arrays;

import java.util.*;
/*
 * Leetcode 75
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
 * 
 * 
 */
public class sort_color {
	 public void sortcolor_bucket(int[]nums){
	        
	        int c1=0;//count for 0
	        int c2=0;//count for 1
	        int c3=0;//count for 2
	        
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==0){
	                c1++;
	            }else if(nums[i]==1){
	                c2++;
	            }else{
	                c3++;
	            }
	        }
	        
	        //now we while place zero ,one and two in their respectve order
	   
	        int i=0;
	        while(i<nums.length){
	            
	            while(c1>0){
	                nums[i]=0;
	                i++;
	                c1--;
	            }
	            
	            while(c2>0){
	                nums[i]=1;
	                i++;
	                c2--;
	            }
	            while(c3>0){
	                nums[i]=2;
	                i++;
	                c3--;
	            }
	        }
	        
	        
	    }
	    
	    public void sort_color_three_pointer(int[]nums){
	        
	        int left=0;
	        int right=nums.length-1;
	        
	        int curr=0;
	        while(curr<=right){
	            
	            if(nums[curr]==0){
	                int temp=nums[curr];
	                nums[curr]=nums[left];
	                nums[left]=temp;
	                left++;
	                curr++;
	                
	            }
	            else if(nums[curr]==2){
	               
	                int temp=nums[curr];
	                nums[curr]=nums[right];
	                nums[right]=temp;
	                right--; 
	                //here we not moving curr because we can again encounter a 2 on the curr
	               // for ex 2 0 1 2
	            }else{
	                curr++;
	            }
	              
	            
	        }
	    }

}
