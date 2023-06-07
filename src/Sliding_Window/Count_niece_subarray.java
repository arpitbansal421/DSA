package Sliding_Window;

import java.util.*;
//Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

//Return the number of nice sub-arrays.
//Now we will convert every element of array to which they are divisible by to 2 to 0 and not divisible by two to 1
//so that we can break the question to longest divisible subarray
public class Count_niece_subarray {
	
	public int numberOfSubarrays(int[] nums, int k) {
        
        
        int ei=0;

       int sum=0;

       int ans=0;
       
       for(int i=0;i<nums.length;i++){
           
           if(nums[i]%2!=0){
               nums[i]=1;
           }else{
               nums[i]=0;
           }
       }
       
       HashMap<Integer,Integer>map=new HashMap<>();
       
       
        map.put(0,1);
       while(ei<nums.length){
           
            sum+=nums[ei];
           
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
