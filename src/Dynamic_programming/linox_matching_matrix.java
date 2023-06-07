package Dynamic_programming;
//leetcode hard must watch before any interview
/*Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

 
 * 
 * 
 */
import java.util.*;
public class linox_matching_matrix {
	  public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String s=sc.next();
	        String p=sc.next();
	        System.out.println(isMatch(s,p));
	    }
	    
	      public static boolean isMatch(String s,String p){
	       p=" "+p;
	       s=" "+s;
	        boolean[][]dp=new boolean[p.length()][s.length()];
	        
	        for(int i=0;i<dp.length;i++){
	            for(int j=0;j<dp[0].length;j++){
	                
	                if(i==0 && j==0){
	                    dp[i][j]=true;//empty string with empty pattern case
	                }else if(i==0){
	                    //empty patten with string
	                    dp[i][j]=false;
	                    
	                }else if(j==0){
	                    //empty string with patten
	                    if(p.charAt(i)=='*'){
	                        
	                        if( i-2>=0 &&dp[i-2][j]){
	                            dp[i][j]=dp[i-2][j];
	                        }else{
	                            dp[i][j]=false;
	                        }
	                    }else {
	                    	dp[i][j]=false;
	                    }
	                    
	                    
	                }else{
	                    char pt=p.charAt(i);
	                    char st=s.charAt(j);
	                    
	                    if(pt=='*'){
	                       
	                       boolean miss=false;//by leaving star and the preceding character
	                       boolean taken=false;//by replacing star with precending character
	                       if(i-2>=0){
	                           miss=dp[i-2][j];
	                       }
	                       if(p.charAt(i-1)==s.charAt(j)|| p.charAt(i-1)=='.'){
	                           taken=dp[i][j-1];
	                       }
	                       
	                       dp[i][j]=miss||taken;
	                    }else if(pt=='.'){
	                    	//it pattern char is . it means it take any character so we only need to check the previous character
	                        dp[i][j]=dp[i-1][j-1];//only cheching previous string
	                    }else if(pt==st){
	                        dp[i][j]=dp[i-1][j-1];//only string and pattern
	                    }else{
	                        dp[i][j]=false;
	                    }
	                }
	            }
	        }
	        
	 
	        
	        return dp[p.length()-1][s.length()-1];
	        
	       
	    }

}
