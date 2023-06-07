package HashMap;

import java.util.*;
//leetcode 1027
/*
 * Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.

Recall that a subsequence of an array nums is a list nums[i1], nums[i2], ..., nums[ik] with 0 <= i1 < i2 < ...
 < ik <= nums.length - 1, 
and that a sequence seq is arithmetic if seq[i+1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).
 * 
 * 
 * 
 * 
 * 
 */
public class longest_arithmatic_sequence {
public int longestArithSeqLength(int[] nums) {
        
        if(nums.length<=2){
            return 2;
        }
        
        HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
        
        map.put(0,new HashMap<>());
        map.get(0).put(nums[0],1);
        
        
        
        //now we will the hashmap
        int ans=2;
        for(int i=1;i<nums.length;i++){
            HashMap<Integer,Integer>curr=new HashMap<>();
            for(int j=0;j<i;j++){
                
                HashMap<Integer,Integer>prevmap=map.get(j);
                
                int differ=nums[i]-nums[j];
                curr.put(differ,2);
                if(prevmap.containsKey(differ)){
                    
                    int len=prevmap.get(differ);
                    curr.put(differ,len+1);
                    
                    
                    
                    
                    
                }
                
                ans=Math.max(ans,curr.get(differ));
            }
       
            map.put(i,curr);
        }
        
        return ans;
        
        
    }

}
