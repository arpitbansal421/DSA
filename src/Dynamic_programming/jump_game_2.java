package Dynamic_programming;

//leetcode 55
/*
 * 
 * You are given an integer array nums. You are initially positioned at the array's first index, 
 * and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 
 * 
 * 
 * 
 */
public class jump_game_2 {
	
	 public boolean canJump(int[] nums) {
	        
	        int maxreach=0;
	        if(nums.length==1){
	            return true;
	        }
	        
	        if(nums.length!=1 && nums[0]==0){
	            return false;
	        }
	        
	    
	        
	        for(int i=0;i<nums.length-1;i++){
	            
	            if(maxreach<i){
	                return false;
	            }
	            //basically we are only thinking a way by which across the valley some 
	            maxreach=Math.max(maxreach,nums[i]+i);
	            
	            if(maxreach>=nums.length-1){
	                return true;
	            }
	        }
	    
	        return false;
	    }

}
