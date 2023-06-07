package Arrays;

import java.util.*;
/*
 * Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally, 
if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 * 
 * 
 */
public class Triangle {
	
	  public int minimumTotal(List<List<Integer>> triangle) {

	        int max=Integer.MIN_VALUE;

	        for(int i=0;i<triangle.size();i++){
	            max=Math.max(max,triangle.get(i).size());
	        }

	        int[][]dp=new int[max][triangle.size()];
	        for(int[]a:dp){
	            Arrays.fill(a,-10001);
	        }
	        return minimumTotal(triangle,0,0,dp);


	       
	}
	public int minimumTotal(List<List<Integer>>tri,int row,int i,int[][]dp){

	    

	    if(row==tri.size()){
	        return 0;
	    }
	    if(dp[i][row]!=-10001){
	        
	        return dp[i][row];
	    }

	    int f=minimumTotal(tri,row+1,i,dp)+tri.get(row).get(i);
	    int s=minimumTotal(tri,row+1,i+1,dp)+tri.get(row).get(i);

	    return dp[i][row]=Math.min(f,s);
	}



	}


}
