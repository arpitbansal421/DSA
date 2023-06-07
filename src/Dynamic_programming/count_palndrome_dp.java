package Dynamic_programming;

import java.util.*;
public class count_palndrome_dp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println(count_palindrome(str));
		
		
	}
	//draw the dp table and try to visulize the sgnificance of each letter by assinging the substring
	public static int count_palindrome(String str) {
		
		if(str.length()==0) {
			return 0;
		}
		
		boolean[][]dp=new boolean[str.length()][str.length()];
		
		
		//now filling the the dp table 
		int count=0;
		for(int g=0;g<str.length();g++) {
			for(int i=0,j=g;i<str.length()&& j<str.length();i++,j++) {
				//first digonal
				if(g==0) {
					dp[i][j]=true;
					
				}else if(g==1) {
					if(str.charAt(i)==str.charAt(j)) {
						dp[i][j]=true;
					}
				}
				
				else {
					
					if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]) {
						dp[i][j]=true;
						
						
					}else {
						dp[i][j]=false;
					}
				}
				
				if(dp[i][j]) {
					count++;
				}
				
			}
		}
		
		return count;
	}

}
