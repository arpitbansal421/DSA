package Dynamic_programming;

import java.util.Arrays;

public class House_Robber {
	//you are a professional robber panning to rob house along a street each house has a 
	//certain amount of money stashed the only constraints stopping you from robbing your house is that adjacent house 
	//has security system it will automatically call the polic if two adjacent houses are robbed simanteneusly
	//each house has money associated with it
	public static void main(String[]args) {
		
		int []nums= {3,2,-9,0};
		System.out.println(rob(nums,0));
		int[]dp=new int[nums.length];
		
		Arrays.fill(dp, -1);
	
		System.out.println(rob_TU(nums, 0, dp));
		System.out.println(rob_BU(nums));
		
		
		
		

}
	public static int rob(int[]arr,int i) {
		if(i>=arr.length) {
			return 0;
		}
		int dorob=rob(arr,i+2)+arr[i];//you will rob this house
		int dontrob=rob(arr,i+1);//you will not rob this house
		return Math.max(dorob, dontrob);
	}
	//by using top down approach
	public static int rob_TU(int []arr,int i,int[]dp) {
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int dorob=rob_TU(arr,i+2,dp)+arr[i];//you will rob this house
		int dontrob=rob_TU(arr,i+1,dp);//you will not rob this house
		return dp[i]=Math.max(dorob, dontrob);

		
	}
	public static int rob_BU(int[]arr) {
		int[]dp=new int[arr.length];
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0], arr[1]);
		for(int i=2;i<dp.length;i++) {
			int do_rob=dp[i-2]+arr[i];
			int dont=dp[i-1];
			dp[i]=Math.max(dont, do_rob);
		}
//		System.out.println(dp[3]);
		
		return dp[arr.length-1];
		
	}
	}

