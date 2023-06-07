package HashMap;
import java.util.*;

//in this question we have to find the longest common sequence so 
//we look for a starting point 

public class Longest_Consecutive_Sequence {
	
	public static void main(String[] args) {
		
		int[]nums= {0,0,0,0};
		
		Longestsequence(nums);
		
		
	}

	private static void Longestsequence(int[] nums) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Boolean>map=new HashMap<>();
		//putting our element into the map
//		for(int i=0;i<nums.length;i++) {
//			map.put(nums[i], false);
//		
//			
//		}
		
		//checking our first element
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i]-1)) {
				map.put(nums[i], false);
			}else {
				map.put(nums[i], true);
			}
			
			if(map.containsKey(nums[i]+1)) {
				
				map.put(nums[i]+1, false);
			}
		}
		int ans=-1;
		int sum=0;
		
		for(int key:map.keySet()) {
			if(map.get(key)) {
				sum=1;
				while(map.containsKey(key+1) && !map.get(key+1)) {
				
					key++;
					sum++;
				}
				ans=Math.max(ans, sum);
				
			}
			
		}
		
		System.out.println(ans);
	
			
			
		
		
		
	}

}
