package Arrays;

import java.util.*;
/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 
 * 
 * 
 * 
 */
public class Longest_common_prefix {
	  public String longestCommonPrefix(String[] strs) {
	        
	        String ans="";
	        
	        if(strs.length==1){
	            return strs[0];
	        }
	        
	      
	            
	            for(int j=0;j<Math.min(strs[0].length(),strs[1].length());j++){
	                
	                if(strs[0].charAt(j)==strs[1].charAt(j)){
	                    ans+=strs[0].charAt(j);
	                }else{
	                    break;
	                }
	                    
	            }
	        
	        if(ans==""){
	            return "";
	        }
	        
	        for(int i=2;i<strs.length;i++){
	            String curr="";
	            for(int j=0;j<Math.min(ans.length(),strs[i].length());j++){
	                
	                if(ans.charAt(j)==strs[i].charAt(j)){
	                    curr+=ans.charAt(j);
	                }else{
	                    break;
	                }
	            }
	            
	            if(curr==""){
	                return "";
	            }else{
	                ans=curr;
	            }
	        }
	        
	        return ans;
	            
	            
	        
	        
	    }

}
