package Dynamic_programming;
/*
 * 
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

 
 * 
 * 
 */

import java.util.*;
public class Coin_change_leetcode_322 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        int[]dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;//for amount 0 we need 0 coins

        for(int am=1;am<dp.length;am++){

            for(int c=0;c<coins.length;c++){

                if(am<coins[c]){
                    break;
                }

                int rem=am-coins[c];
                if(rem==0){
                    dp[am]=1;
                }else{
                    if(dp[rem]!=Integer.MAX_VALUE){
                        dp[am]=Math.min(dp[am],dp[rem]+1);
                    }
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];

        }

}
