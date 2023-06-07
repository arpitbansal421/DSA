package Dynamic_programming;

import java.util.Arrays;

public class longest_common_subsequence {
	
	public static void main(String[]args) {
		String t="aeced";
		String s="aehhhhh";
//		System.out.println(lcs(t,s,0,0));
		int[][]dp=new int[t.length()][s.length()];
		for(int []a:dp) {
			Arrays.fill(a,-1);
		}
		System.out.println(lcs_td(t,s,0,0,dp));
		
		System.out.println(lcs_bu(s,t));
		
		
		
	}

//	private static int lcs(String s, String t, int i, int j) {
//		// TODO Auto-generated method stub
//		
//		if(i==t.length() ||j==s.length()) {
//			return 0;
//		}
//		
//		int ans=0;
//		if(t.charAt(i)==s.charAt(j)) {
//			
//			 ans=lcs(t,s,i+1,j+1)+1;//if both letters are equal so we got a substring lenth 1
//		}
//		else {
//			int fs=lcs(t,s,i+1,j);//removing the first letter
//			int sc=lcs(t,s,i,j+1);//removing the second letter
//			ans=Math.max(fs,sc);
//			
//			
//		}
//		return ans;
//
//		
//		
//	
//	}  
	
	private static int lcs_td(String s,String t,int i,int j,int[][]dp) {
		int ans=0;
		
		if(i==s.length()||j==t.length()) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
			
		if(s.charAt(i)==t.charAt(j)) {
			
			ans=lcs_td(s,t,i+1,j+1,dp)+1;
		}
		//here we are using else
		//because of simple logic bhai jo do character mil rhe the unko hi maine hata diya
		//to maximum ans kaise milega
		else {
			int fs=lcs_td(s,t,i+1,j,dp);
			int sc=lcs_td(s,t,i,j+1,dp);
			ans=Math.max(fs, sc);
		}
		
		return dp[i][j]=ans;
		
	}
	
	//bottom up approach
	
	public static int lcs_bu(String s,String t) {
		int[][]dp=new int[s.length()+1][t.length()+1];
		
		for(int i=1;i<=s.length();i++) {
			
			for(int j=1;j<=t.length();j++) {
				int ans=0;
				int inc=0;
				int exc=0;
				if(s.charAt(i-1)==t.charAt(j-1)) {
					ans=dp[i-1][j-1]+1;
					
				}else {
					ans=Math.max(dp[i][j-1],dp[i-1][j]);
					
				}
				dp[i][j]=ans;
				
			}
		}
		return dp[s.length()][t.length()];
		
	}

}
