package Dynamic_programming;

import java.util.*;

/*Leetcode 474 Ones zeroes
 * You are given an array of binary strings strs and two integers m and n.

Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.

A set x is a subset of a set y if all elements of x are also elements of 
 * 
 * 
 */

public class Ones_zero {
	 public int findMaxForm(String[] strs, int m, int n) {

	        int[][][]dp=new int[m+1][n+1][strs.length];

	        

	        return findMaxForm(strs,m,n,0,dp);
	        
	    }

	    
	    //recurssive code
	    public int findMaxForm(String[]strs,int m,int n,int i,int[][][]dp){

	        if(i==strs.length){
	            return 0;
	        }

	       

	       
	       int c0=count(strs[i]);
	       int c1=strs[i].length()-c0;

	       if(dp[m][n][i]!=0){
	           return dp[m][n][i];
	       }

	       int inc=0;
	       int exc=0;

	       if(c0<=m &&c1<=n){

	           inc=findMaxForm(strs,m-c0,n-c1,i+1,dp)+1;

	       }

	       exc=findMaxForm(strs,m,n,i+1,dp);

	       return dp[m][n][i]=Math.max(inc,exc);

	    }





}
