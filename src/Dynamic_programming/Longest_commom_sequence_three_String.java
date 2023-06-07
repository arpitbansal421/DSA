package Dynamic_programming;

import java.util.*;

public class Longest_commom_sequence_three_String {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		
		int[][][]dp=new int[s1.length()][s2.length()][s3.length()];
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				for(int k=0;k<s3.length();k++) {
					dp[i][j][k]=-1;
				}
			}
		}
		System.out.println(LCS(s1,s2,s3,0,0,0,dp));
		
	}

	private static int LCS(String s1, String s2, String s3, int i, int j, int k, int[][][] dp) {
		// TODO Auto-generated method stub
		
		if(i==s1.length()|| j==s2.length() ||k==s3.length()) {
			return 0;
		}
		int ans=0;
		if(dp[i][j][k]!=-1) {
			return dp[i][j][k];
		}
		if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j)==s3.charAt(k)){
			ans=LCS(s1,s2,s3,i+1,j+1,k+1, dp)+1;
			
		}else {
			int fd=LCS(s1,s2,s3,i+1,j,k, dp);
			int sd=LCS(s1,s2,s3,i,j+1,k, dp);
			int td=LCS(s1,s2,s3,i,j,k+1, dp);
			ans=Math.max(ans, Math.max(fd, Math.max(sd, td)));
			
		}
		
		return dp[i][j][k]=ans;
		
		
		
		
	}

}
