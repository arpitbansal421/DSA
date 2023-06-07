package Competative_programming;

public class Number_of_adjacent {
	class Solution {
	    public int[] colorTheArray(int n, int[][] queries) {
	            int[] nums = new int[n];
	            int []ans=new int[queries.length];
	            
	           if(n==1){
	               return ans;
	           }
	        int adj=0;
	        
	        for(int i=0;i<queries.length;i++ ){
	            int idx=queries[i][0];
	            int color=queries[i][1];
	            
	            if(idx>0 && nums[idx]!=0 && nums[idx]==nums[idx-1]){
	                adj--;
	            }
	            if(idx<nums.length-1 && nums[idx]!=0 && nums[idx]==nums[idx+1]){
	                adj--;
	            }
	            //add 
	            nums[idx]=color;
	             if(idx>0 && nums[idx]!=0 &&  nums[idx]==nums[idx-1]){
	                adj++;
	            }
	            if(idx<nums.length-1 &&  nums[idx]!=0 && nums[idx]==nums[idx+1]){
	                adj++;
	            }
	            ans[i]=adj;
	        }
	            
	            
	           
	        
	        

	        return ans;
	    }
	}

}
