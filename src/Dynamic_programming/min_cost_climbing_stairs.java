package Dynamic_programming;

import java.util.Arrays;

public class min_cost_climbing_stairs {
	public static void main(String[]args) {
		int[]cost = {10,15,20};
		int[]dp=new int[cost.length];
		Arrays.fill(dp,-1);
		int i=0;
		
		
			
		int ans=Math.min(min_cost_BU(cost,i),min_cost_BU(cost, i+1));
		System.out.println(ans);
			
		
	}

	private static int min_cost(int[] cost, int i,int[]dp) {
		
		if(i>=cost.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int f1=min_cost(cost,i+1,dp)+cost[i];
		int f2=min_cost(cost,i+2,dp)+cost[i];
		
		dp[i]= Math.min(f1, f2);
		return dp[i];
		
		
		
	
		
		
	}
	
	public static int min_cost_BU(int[]cost,int i) {
		int[]dp=new int[cost.length];
		dp[0]=cost[0];
		dp[1]=Math.min(cost[0], cost[1]);
		
		for(int idx=i+2;idx<dp.length;idx++) {
			int s1=dp[idx-1]+cost[idx];
			int s2=dp[idx-2]+cost[idx];
			dp[idx]=Math.min(s1, s2);
			
			
		}
		
		
		return dp[cost.length-1];
		
	}

}
