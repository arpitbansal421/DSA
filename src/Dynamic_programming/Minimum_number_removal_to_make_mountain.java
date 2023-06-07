package Dynamic_programming;

import java.util.*;
public class Minimum_number_removal_to_make_mountain {
	//basically if we remove the largest mountain from our mountain array only the minimum non participating element would be left
	//and we find our largest mountain by using bitonic subsequence
	//and subtract the largest mountain from our length of array
	public int minimumMountainRemovals(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        
              return nums.length-bitonicsequence(nums);                                                                              
        
    }
    
    public int bitonicsequence(int[]nums){
        int[]left=new int[nums.length];
        int[]right=new int[nums.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        //we will fill our left array
        
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    left[i]=Math.max(left[i],left[j]+1);
                }
            }
        }
        
        for(int i=nums.length-2;i>=0;i--){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]>nums[j]){
                    right[i]=Math.max(right[i],right[j]+1);
                }
            }
        }
        
        int ans=0;
        for(int i=0;i<left.length;i++){
            if(left[i]!=1 && right[i]!=1){
            ans=Math.max(ans,left[i]+right[i]-1);}
        }
        
        return ans;
    }

}
