package Recurssion;

import java.util.*;
public class find_all_indexes_after_sorting_array {
	
  public static void main(String[] args) {
	
	  find_all_indexes_after_sorting_array tt=new find_all_indexes_after_sorting_array();
	  int[]arr= {1,2,5,2,3};
	  int []ans=(tt.targetIndices(arr, 2));
	  
	  for(int i=0;i<ans.length;i++) {
		  System.out.print(ans[i]+" ");
	  }
	  
	  
}
	
	  public int[] targetIndices(int[] nums, int target) {
		  
		  
		return targetIndices(nums,target,0,0);
	        
	    }

	private int[] targetIndices(int[] nums, int target, int i, int count) {
		// TODO Auto-generated method stub
		
		if(i==nums.length) {
			
			return new int[count];
		}
		
		if(target==nums[i]) {
			count++;
			
		}
		
		int[]arr=targetIndices(nums,target,i+1,count);
		
		if(nums[i]==target) {
			arr[count-1]=i;
		}
		return arr;
	}

}

