package Dynamic_programming;

import java.util.*;
//Given n numbers in a row denoting the cost of each wine
//Each year either you can sale first wine or last wine respectively
//how ever the price of wine increases over rapidly

public class Wine_problem {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int[]wine= {2,3,5,1,4};
		
		int[][]dp=new int[wine.length][wine.length];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(maxprofit(0,wine.length-1,1,wine,dp));
		
		System.out.print(maxprofit_bu(wine));
		
		
		
	}
	
	public static int maxprofit(int i,int j,int year,int[]wine,int[][]dp) {
		
		//base case
		
//		if(i==wine.length || j<0) {
//			return 0;
//			
//		}
		
		if(i>j) {
			return 0;
			
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		
		
		int p1=maxprofit(i+1,j,year+1,wine,dp)+wine[i]*year;
		int p2=maxprofit(i,j-1,year+1,wine,dp)+wine[j]*year;
		
		return dp[i][j]= Math.max(p1, p2);
	}
	
	
	public static int maxprofit_bu(int[]wine) {
		
		int[][]dp=new int[wine.length][wine.length];
		
		//firstly we  will for the last year when only one bottle is remaining
		
		for(int i=0;i<dp.length;i++) {
			dp[i][i]=wine[i]*wine.length;
		}
		
		//now we will fill for each diognal as the no of bottles remaing corrosponds to the diogonal
		
		//for ex 0-1(means two bottles are remaing one for 0 index another for 1th index
		//0-2(means three bottles are remaing 0,1,2 indexes)
		
		int year=wine.length-1;
		for(int slide=1;slide<dp.length;slide++) {
			for(int j=slide;j<dp.length;j++) {
				int i=j-slide;
				
				int p1=wine[i]*year+dp[i+1][j];
				int p2=wine[j]*year+dp[i][j-1];
				dp[i][j]=Math.max(p1, p2);
			}
			
			year--;
		}
		
		
		return dp[0][wine.length-1];
		
		
	}

}
