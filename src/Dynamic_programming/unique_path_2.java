package Dynamic_programming;

//leetcode 63
//Unique path 3
/*
 * You are given an m x n integer array grid. 
 * There is a robot initially located at the top-left corner (i.e., grid[0][0]). 
 * The robot tries to move to the bottom-right corner (i.e., grid[m-1][n-1]).
 *  The robot can only move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in grid.
 A path that the robot takes cannot include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * 
 * 
 * 
 * 
 */
public class unique_path_2 {
	
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int[][]dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        
        return noofpathsbu(obstacleGrid);
        
    }
    
    public static int noofpaths(int cr,int cc,int[][]grid,int[][]dp){
        //base condition
        if(cr<0 || cc<0 ||cr>=grid.length || cc>=grid[0].length || grid[cr][cc]==1){
            return 0;
        }
        
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        
        if(cr==grid.length-1 && cc==grid[0].length-1){
            return 1;
        }
        
        int bottom=noofpaths(cr+1,cc,grid,dp);
        int left=noofpaths(cr,cc+1,grid,dp);
        
        return dp[cr][cc]=left+bottom;
    }
    
    public static int noofpathsbu(int[][]grid){
        int[][]dp=new int[grid.length][grid[0].length];
        
        if(grid[0][0]==1){
            return 0;
        }
        dp[0][0]=1;
        
        //left row
        for(int i=0;i<dp.length;i++){
            
            if(grid[i][0]==1){
                break;
            }
            if(grid[i][0]!=1 && i-1>=0 && grid[i-1][0]!=1){
                dp[i][0]=1;
            }
        }
        
        //right row
        for(int j=0;j<dp[0].length;j++){
            
            if(grid[0][j]==1){
                break;
            }
            if(grid[0][j]!=1 && j-1>=0 && grid[0][j-1]!=1){
                dp[0][j]=1;
            }
        }
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                int bottom=0; 
                int left=0;
                if(grid[i][j]!=1 && i-1>=0 ){
                    
                    bottom=dp[i-1][j];
                    
                }
                
                if(grid[i][j]!=1 &&j-1>=0 ){
                    left=dp[i][j-1];
                }
                
                dp[i][j]=left+bottom;
                
                
               
            }
            
            
        }
       
        return dp[grid.length-1][dp[0].length-1];
    }

}
