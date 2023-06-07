package Dynamic_programming;

/*
 * Given two strings text1 and text2, return the length of their longest common subsequence. 
 * If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters 
(can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
 * 
 * 
 */
import java.util.*;
public class longest_bu_dp {
	public static int lcs_bu(String s1,String s2){
		 
        int[][]dp=new int[s1.length()+1][s2.length()+1];

        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){

                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

                }
            }
        }

        return dp[s1.length()][s2.length()];

    }
    

	
}
