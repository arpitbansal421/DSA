package Trie;
import java.util.*;

//Leetcode 139
//Given a string s and a dictionary of strings wordDict, return true if s can be segmented
	//	into a space-separated sequence of one or more dictionary words.

public class word_break {
	
	 public boolean wordBreak(String s, List<String> wordDict) {
	        int[]dp=new int[s.length()];//it will the freq of the indexex
	    
	        HashSet<String>set=new HashSet<>(wordDict);
	        
	        for(int i=0;i<s.length();i++){
	            
	            for(int j=0;j<=i;j++){
	                
	                String s1=s.substring(j,i+1);
	                
	                if(set.contains(s1)){
	                if(j>0){
	                	
	                	
	                    dp[i]=dp[j-1]+dp[i];
	                }else{
	                    
	                    dp[i]++;
	                }
	            }
	            
	            }
	        }
	        
	        return dp[s.length()-1]>0;
	    }
	}

}


