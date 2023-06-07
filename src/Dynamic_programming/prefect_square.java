package Dynamic_programming;
import java.util.*;
//leetcode 279
/*
 * 
 * Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, 
it is the product of some integer with itself. For example, 1, 4, 9, and
 16 are perfect squares while 3 and 11 are not.

 
 * 
 */
public class prefect_square {
	 public int numSquares(int n) {
	        
//       int[]dp=new int[n+1];
      
//       Arrays.fill(dp,Integer.MAX_VALUE);
      
      return min(n);
      
  }
  
  public int numSquares(int n,int[]dp){
      
      if(n==0 ||n<0){
          return 0;
      }
      
      if(dp[n]!=Integer.MAX_VALUE){
          return dp[n];
      }
      
      int ans=Integer.MAX_VALUE;
      for(int i=1;i*i<=n;i++){
          
          
          ans=Math.min(ans,numSquares(n-i*i,dp));
      }
      
      return dp[n]=ans+1;
      
      
      
      
  }
  
  public int min(int n){
      
      int[]dp=new int[n+1];
      
      dp[0]=0;
      
      for(int i=1;i<dp.length;i++){
          int ans=Integer.MAX_VALUE;
          for(int j=1;j*j<=i;j++){
              
            
              ans=Math.min(ans,dp[i-j*j]);
                  
          }
          
          dp[i]=ans+1;
      }
      
      return dp[n];
  }

}
