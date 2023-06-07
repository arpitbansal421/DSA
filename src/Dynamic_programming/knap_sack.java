package Dynamic_programming;
import java.util.*;

public class knap_sack {
	public static void main (String[]args) {
		int val=4;
		int[]wt= {1,2,3,2,2};
		int[]cost= {8,4,0,5,3};
		
		int[][]dp=new int[wt.length][val+1];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
			
		}
		System.out.println(knap_sack_Td(wt,cost,0,val,dp));
		
		System.out.print(knap_sack_Bu(wt,cost,val));
	
		
	}
	
	private static int knap_sack_Td(int[] wt, int[] cost, int i, int val, int[][] dp) {
		if(i==wt.length || val==0 ) {
			return 0;
		}
		
	
		int inc=0;
		int exc=0;
		if(dp[i][val]!=-1) {
			return dp[i][val];
		}
	
		if(val>=wt[i]) {
			val-=wt[i];//do
			inc=knap_sack_Td(wt,cost,i+1,val,dp)+cost[i];
			val+=wt[i];//undo
			
			
		}
		exc=knap_sack_Td(wt,cost,i+1,val,dp);
		
		
		// TODO Auto-generated method stub
		return dp[i][val]=Math.max(inc, exc);
	}

//	public static int knap_sack(int[]wt,int[]cost,int i,int j,int val) {
//		if(val==0||i==wt.length||j==cost.length) {
//			return 0;
//		}
//		//
//		int inc=0;
//		int exc=0;
//		if(val>=wt[i]) {
//			val-=wt[i];//do
//			inc=knap_sack(wt,cost,i+1,j+1,val)+cost[i];
//			val+=wt[i];//undo
//		}
//		exc=knap_sack(wt,cost,i+1,j+1,val);
//		
//		return Math.max(inc, exc);
//		
//		
//	}
	
	//bottom up
	public static int knap_sack_Bu(int[]wt,int[]cost,int val) {
		int[][]dp=new int[val+1][cost.length+1];
//		//filling the base case
//		for(int i=1;i<=val;i++) {
//			dp[0][i]=0;
//			
//		}
//		dp[0][0]=0;
		//two recursive call two loops
		for(int v=1;v<=val;v++) {
			for(int w=1;w<=wt.length;w++) {                  
				
				int inc=0;
				int exc=0;
				if(v>=wt[w-1]) {
					inc=dp[v-wt[w-1]][w-1]+cost[w-1];
				}
				
				exc=dp[v][w-1];
				
				dp[v][w]=Math.max(inc, exc);
			}
		}
		return dp[val][wt.length];
	}
	

}
