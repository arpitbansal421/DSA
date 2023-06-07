package HashMap;

import java.util.*;
//leetcode 217
//duplicate element1
public class contains_duplicate {
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
