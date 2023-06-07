package level_up;
//leetcode 44
//in this question we are given two string string s1 and string s2
//so basically we have to match those strings
//but we are also given ? and *
//* for the sequence of character and for empty string
import java.util.*;
public class WildCharacter_matching {
	
	public static void main(String[] args) {
		String s="baabab";
		String p="b*?ab";
		int[][]dp=new int[s.length()][p.length()];
		
		System.out.println(isMatch(s,p,0,0,dp));
	}
	
	
	 public static  boolean isMatch(String s,String p,int i,int j,int[][]dp){
	        boolean ans;
	        if(i==s.length()){
	            
	                if(j!=p.length()){
	                for(int j2=j;j2<p.length();j2++){
	                    if(p.charAt(j2)!='*'){
	                        return false;//for the case  ***
	                    }
	                    
	                }
	                
	                }
	                
	                
	            
	            
	            return true;
	        }
	        
	        if(j==p.length()){
	            return false;
	        }
	        
	        if(dp[i][j]!=0){
	            
	            return dp[i][j]==1?true:false;
	        }
	        

	        
	        if(s.charAt(i)==p.charAt(j)|| p.charAt(j)=='?'){
	            ans=isMatch(s,p,i+1,j+1,dp);//here we are basically replacing the character with ? 
	        }else if(p.charAt(j)=='*'){
	            
	            boolean DoMatch=isMatch(s,p,i+1,j,dp);//in our first call we matching our first character but we
	            //have match the sequence of the character so we are not moving our j
	            boolean DontMatch=isMatch(s,p,i,j+1,dp);//we are not matching our character means we just consider our *
	            //as empty string
	            ans=DoMatch||DontMatch;
	            
	        }else{
	            ans=false;
	        }
	        
	        if(ans){
	            dp[i][j]=1;
	        }else{
	            dp[i][j]=2;
	        }
	        
	        return ans;
	    }

}
