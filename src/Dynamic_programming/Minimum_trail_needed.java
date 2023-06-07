package Dynamic_programming;

import java.util.*;
public class Minimum_trail_needed {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int p=sc.nextInt();
			int f=sc.nextInt();
			
			int[][]dp=new int[p+1][f+1];
			
			for(int[]a:dp) {
				Arrays.fill(a, -1);
			}
//			dp[0][0]=0;
//			for(int i=0;i<=p;i++) {
//				dp[i][1]=1;
//			}
//			
//			for(int i=0;i<=f;i++) {
//				dp[1][i]=i;
//			}
			
			
			int k=minimumtrail(p,f,dp);
			
			

			
			System.out.println(k);
			
			
		}
	}
	
	public static int minimumtrail(int egg,int floor,int[][] dp) {
		
		
		
		//base case

		
		if(floor==0||floor==1) {
			return 1;
		}
		
		if(egg<=1) {
			return floor;
		}
		if(dp[egg][floor]!=-1) {
	
			return dp[egg][floor];
		}
		
		
		//no of recurssive call equal to no of floor
		int ans=100000000;
		for(int i=1;i<=floor;i++) {
			
			int brek=minimumtrail(egg-1,i-1,dp);
			int dontbreak=minimumtrail(egg,floor-i,dp);
		    ans=Math.min(Math.max(brek, dontbreak)+1,ans);
			
			
		}
		
		return dp[egg][floor]=ans;
		
		
		
	
	}
	
	
	
		
		public static int minimumtrail_1(int egg,int floor,int[][] dp) {
			
			
			
			//base case
			if(floor==0 || floor==1) {
				return floor;
			}
			
			// if(floor==1) {
			// 	return 1;
			// }
			if(egg==1){
	            return floor;
	        }
			if(dp[egg][floor]!=-1) {
				
				return dp[egg][floor];
			}
			// if(egg==1) {
			// 	return floor;
			// }
			
			
			//no of recurssive call equal to no of floor
			int ans=10000000;
			for(int i=1;i<=floor;i++) {
			//	int k=floor;
				int brek=minimumtrail(egg-1,i-1,dp);
				int dontbreak=minimumtrail(egg,floor-i,dp);
			    ans=Math.min(1+Math.max(brek, dontbreak),ans);
				
				
			}
			
			return dp[egg][floor]=ans;
			
			
			
		
		}

	}


