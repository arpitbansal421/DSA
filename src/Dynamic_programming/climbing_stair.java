package Dynamic_programming;

import java.util.*;
//leetcode 70
/*You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * 
 * 
 * 
 */
public class climbing_stair {
public int climbStairs(int n) {
        
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        
        return climbingstair(n,dp);
        
        
    }
    
    
    public int climbingstair(int n,int[]dp){
        
        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n]; 
        }
        return dp[n]=climbingstair(n-1,dp)+climbingstair(n-2,dp);
    }
    public int climbingstairs(int n){
        int[]dp=new int[n+1];
       
        
        
       dp[0]=1;
        dp[1]=1;
        
       for(int i=2;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];
       }
        
        return dp[n];
    }

}
