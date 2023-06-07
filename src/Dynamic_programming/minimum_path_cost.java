package Dynamic_programming;

import java.util.*;
//leetcode 2304
/*
 * 
 * You are given a 0-indexed m x n integer matrix grid consisting of distinct integers from 0 to m * n - 1. You can move in this matrix from a cell to any other cell in the next row.
 *  That is, if you are in cell (x, y) such that x < m - 1, you can move to any of the cells (x + 1, 0), (x + 1, 1), ..., (x + 1, n - 1). Note that it is not possible to move from cells in the last row.

Each possible move has a cost given by a 0-indexed 2D array moveCost of size (m * n) x n, 
where moveCost[i][j] is the cost of moving from a cell with value i to a cell in column j of the next row. The cost of moving from cells in the last row of grid can be ignored.

The cost of a path in grid is the sum of all values of cells visited plus the sum of costs of all the moves made. 
Return the minimum cost of a path that starts from any cell in the first row and ends at any cell in the last row.
 * 
 * 
 * 
 * 
 */
public class minimum_path_cost {
	
	 public int minPathCost(int[][] grid, int[][] moveCost) {
	        return minpath(grid,moveCost);
	    }
	    
	    public static int minpath(int[][]grid,int[][]moveCost){
	        
	        int[][]dp=new int[grid.length][grid[0].length];
	        
	   
	        
	        for(int i=0;i<grid[0].length;i++){
	            dp[0][i]=grid[0][i];
	        }
	        for(int r=1;r<grid.length;r++){
	            for(int c=0;c<grid[0].length;c++){
	                int totalcost=Integer.MAX_VALUE;
	                //now we calculate the minimum cost for each cell
	                for(int i=0;i<grid[0].length;i++){
	                    totalcost=Math.min(totalcost,moveCost[grid[r-1][i]][c]+dp[r-1][i]);
	                    
	                }
	                                                                                                                   // grid[r][c]=totalcost;
	                dp[r][c]=totalcost+grid[r][c]; 
	                
	             
	            }
	        }
	        int ans=Integer.MAX_VALUE;
	        for(int i=0;i<dp[0].length;i++){
	            ans=Math.min(ans,dp[dp.length-1][i]);
	        }
	        
	        return ans;
	     
	        
	   
	        
	        
	    }
	}

}
