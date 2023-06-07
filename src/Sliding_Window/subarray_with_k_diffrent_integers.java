package Sliding_Window;

import java.util.*;
//leetcode 992

///You are given an integer array nums and an integer threshold.

//Find any subarray of nums of length k such that every element in the subarray is greater than threshold / k.

//Return the size of any such subarray. If there is no such subarray, return -1
public class subarray_with_k_diffrent_integers {
	 public int subarraysWithKDistinct(int[] nums, int k) {
	        
         return ok(nums,k)-ok(nums,k-1);
       
     
       }
   
   private static int ok(int []nums,int k){
       
       int si=0;
       int ei=0;
       int total=0;
       int count=0;
       HashMap<Integer,Integer>map=new HashMap<>();
       
       while(ei<nums.length){
           
           if(!map.containsKey(nums[ei]) || (map.containsKey(nums[ei])&& map.get(nums[ei])==0 )){
               count++;
           }
           
           if(map.containsKey(nums[ei])){
               
               map.put(nums[ei],map.get(nums[ei])+1);
           }else{
               map.put(nums[ei],1);
           }
           
           while(count>k && si<=ei){
               
               if(map.get(nums[si])==1){
                   count--;
                   map.put(nums[si],0);
               }else{
                   map.put(nums[si],map.get(nums[si])-1);
               }
               
               si++;
           }
           
           if(count<=k){
              
               total+=ei-si+1;
           }
           ei++;
       }
       
       return total;
   }
       
      

}
