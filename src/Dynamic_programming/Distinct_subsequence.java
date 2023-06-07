package Dynamic_programming;

import java.util.Arrays;

//given two strings s and t we have to generate different subsequence of s which matches t

public class Distinct_subsequence {

	public static void main(String[]args) {
		String s="Rabbbit";
		String t="Rabbit";
		int k=Distinct(s,t,0,0);
		int[][]dp=new int[s.length()][t.length()];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Distinct_TD(s,t,dp,0,0));
		System.out.println(Distinct_BU(s,t));
		System.out.println(k);
	}
	
	public static int Distinct(String s,String t,int i,int j) {
		
		int inc=0;
		int exc=0;
		//base case 
		if(j==t.length()) {
			return 1;
		}
		if(i==s.length()) {
			return 0;
		}
		if(s.charAt(i)==t.charAt(j)) {
			inc=Distinct(s,t,i+1,j+1);
			
		}
		
		exc=Distinct(s,t,i+1,j);
		return inc +exc;
		
	}
	
	//top down approach
	//we are here making 2d dp because are in our recurssion both thttps://leetcode.com/arpitbansal421/he values of i and j are changing
	public static int Distinct_TD(String s,String t,int[][]dp,int i ,int j) {
		
		
		int inc=0;
		int exc=0;
		if(j==t.length()) {
			return 1;
		}
		if(i==s.length()) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			
			return dp[i][j];
		}
		
		
		if(s.charAt(i)==t.charAt(j)) {
			inc=Distinct_TD(s,t,dp,i+1,j+1);
		}
		
		exc=Distinct_TD(s,t,dp,i+1,j);
		return dp[i][j]=inc+exc;

		
	}
	
	
	public static int Distinct_BU(String s,String t) {
		int[][]dp=new int[s.length()+1][t.length()+1];
		for(int i=0;i<s.length();i++) {
			dp[i][0]=1;
		}
		dp[0][0]=1;
		for(int i=1;i<=s.length();i++) {
			for(int j=1;j<=t.length();j++) {
				int inc=0;
				int exc=0;
				if(s.charAt(i-1)==t.charAt(j-1)) {
					inc=dp[i-1][j-1];
				}
				exc=dp[i-1][j];
				
				dp[i][j]=inc+exc;
			}
		}
		return dp[s.length()][t.length()];
	}
			
	
}
