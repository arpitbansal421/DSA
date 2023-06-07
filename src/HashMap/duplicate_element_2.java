package HashMap;
import java.util.*;
//leetcode 217

/*
 * 
 * Given an integer array nums, return true if any value appears
 *  at least twice in the array, and return false if every element is distinct.
 * 
 * 
 */
public class duplicate_element_2 {
	 public boolean containsDuplicate(int[] nums) {
	        
			

			HashMap<Integer,Integer>map=new HashMap<>();
			map.put(nums[0],0);
			boolean isp=false;
			for(int i=1;i<nums.length;i++){
				if(map.containsKey(nums[i])){
					return true;
					
				}else{
					map.put(nums[i],0);
				}
			}

			return false;
	    }

	
}
