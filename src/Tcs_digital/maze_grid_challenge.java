package Tcs_digital;


import java.util.*;
public class maze_grid_challenge {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]grid=new int[n][n];
		
		//entering the value in the grid
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				grid[i][j]=sc.nextInt();
			}
			
		}
		
		int[][]dp=new int[n][n];
		
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		int k=mazegrid(grid,0,0,1,dp);
		System.out.println(k);
		
}
	
	
	public static int mazegrid(int[][]grid,int i,int j,int curr, int[][] dp) {
		//negative base case 
		if(i>=grid.length||j>=grid[0].length) {
			return 100000;
		}
//		int ans=10000000;
		
		//answer condition
		if(dp[i][j]!=-1) {
		
			return dp[i][j];
		}
		if(i==grid.length-1 && j==grid[0].length-1) {
			
			return grid[i][j];	
			
		}
		
		
		
		int top=mazegrid(grid,i+1,j,grid[i][j], dp);
		int bottom=mazegrid(grid,i,j+1,grid[i][j], dp);
		return dp[i][j]= Math.max(Math.min(top, bottom), grid[i][j]);
		
		

		 
	
		
		
		
	}

}

/*
 1 8 21 7
19 17 10 20
2 18 23 22
14 25 4 13

*/
