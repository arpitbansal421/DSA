package Dynamic_programming;


//Given two strings str1 and str2 and below operations that can be performed on str1. Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.  
//
//Insert
//Remove
//Replace
//All of the above operations are of equal cost. 

import java.util.*;
public class Edit_distance {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String a=sc.next();
			String b=sc.next();
			
			int[][]dp=new int[a.length()][b.length()];
			for(int[]a1:dp) {
				Arrays.fill(a1, -1);
			}
			int k=EditDistance(a,b,0,0,dp);
			System.out.println(k);
			
//			for(int i=0;i<dp.length;i++) {
//				for(int j=0;j<dp[0].length;j++) {
//					System.out.print(dp[i][j]+" ");
//			}
//			
//		}
		}
		
	}

	private static  int EditDistance(String a, String b, int i, int j,int[][]dp) {
		int ans=0;
		//base case
		if(i==a.length()) {
			return b.length()-j;
		}
		
		//base case 2
		if(j==b.length()) {
			return a.length()-i;
		}
		
		if(dp[i][j]!=-1) {
//			System.out.println("hello");
			return dp[i][j];
		}
		
		if(a.charAt(i)==b.charAt(j)) {
			ans=EditDistance(a,b,i+1,j+1,dp);
		}else {
			int delete=EditDistance(a,b,i+1,j,dp)+1;
			int insert=EditDistance(a,b,i,j+1,dp)+1;
			int replace=EditDistance(a,b,i+1,j+1,dp)+1;
			
			ans=Math.min(replace, Math.min(delete, insert));
			
			
			
		}
		
		
		
		return dp[i][j]=ans;
		// TODO Auto-generated method stub
		
	}
	

}
