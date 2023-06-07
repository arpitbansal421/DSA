package Dynamic_programming;
//leetcode 62

/*
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). 
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 *  The robot can only move either down or right at any point in time.

Given the two integers m and n, 
return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * 
 * 
 * 
 * 
 */
import java.util.*;
public class unique_path_1 {
	 public int uniquePaths(int m, int n) {
	        
	        int[][]dp=new int[m][n];
	        for(int[]a:dp){
	            Arrays.fill(a,-1);
	        }
	        return uniquePaths(m,n,0,0,dp);
	    }
	    
	    public int uniquePaths(int m,int n,int cr,int cc,int[][]dp){
	        if(m==cr||n==cc){
	            
	            return 0;
	        }
	        
	        if(m-1==cr && n-1==cc){
	            return 1;
	        }
	        
	        if(dp[cr][cc]!=-1){
	            return dp[cr][cc];
	        }
	        
	        int top=uniquePaths(m,n,cr+1,cc,dp);
	        int down=uniquePaths(m,n,cr,cc+1,dp);
	        
	        return dp[cr][cc]=top+down;
	    }

}
