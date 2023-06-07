package Arrays;
import java.util.*;
/*
 * leetcode summary ranges
 * You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 * 
 * 
 */

public class summary_ranges {
	
	  public List<String> summaryRanges(int[] nums) {
	        int n=nums.length;
	        List<String>ans=new ArrayList<>();
	        
	        int i=0;
	        while(i<n){
	            String temp="";
	            temp+=nums[i];
	            int curr=nums[i]; 
	            
	            while(i+1<n && nums[i+1]==nums[i]+1){
	              
	                i++;
	            }
	            
	            if(curr!=nums[i]){
	                temp+="->";
	                temp+=nums[i];
	            }
	            ans.add(temp);
	            i++;
	        }
	        
	        return ans;
	        
	    }
	}

}
