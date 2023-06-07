package Dynamic_programming;

import java.util.*;

public class Minimum_path_sum {
	
	public static void main(String[]args) {
		
		int[][]grid= {{1,2,3},{4,5,6}};
		
		int[][]dp=new int[grid.length][grid[0].length];
		for(int[]a:dp) {
			Arrays.fill(a,-1);
		}
		
		System.out.println(minimum_path(grid,0,0,""));
		System.out.println(minimum_path_td(grid,0, 0,dp));
		
	}
	
	
	public static int minimum_path(int[][]grid,int cc,int cr,String str) {
		
		if(cc>=grid.length ||cr>=grid.length) {
			return 10000;
		}
	     
		if(cc==grid.length-1 && cr==grid.length-1) {
			
			return grid[cc][cr];
			
		}
		
		int down=minimum_path(grid,cc,cr+1,str+"V");
		int horizontal=minimum_path(grid,cc+1,cr,str+"H");
		
		return Math.min(horizontal, down)+grid[cc][cr];
	}
	
	public static int minimum_path_td(int[][]grid,int cc,int cr,int[][]dp) {
		
		if(cc>=grid.length ||cr>=grid.length) {
			return 10000;
		}
	     
		if(cc==grid.length-1 && cr==grid.length-1) {
			
			return grid[cc][cr];
			
		}
		
		if(dp[cr][cc]!=-1) {
			
			return dp[cr][cc];
		}
		
		int down=minimum_path_td(grid,cc,cr+1,dp);
		int horizontal=minimum_path_td(grid,cc+1,cr,dp);
		
		return dp[cr][cc]=Math.min(horizontal, down)+grid[cc][cr];
	}
	
	


}
