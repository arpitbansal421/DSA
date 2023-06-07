package level_up;
//Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

//In other words, return true if one of s1's permutations is the substring of s2.
import java.util.*;
public class Permutation_in_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(checkInclusion(s1,s2));
				
		
	}
	
	   public static boolean checkInclusion(String s1, String s2) {
	        
	        
	        //by using these two arrays we will compare the frequency of both string
	        int[]frep=new int[26];//it will note the frequency of p
	        int[]freq=new int[26];//it will not the frequency of s
	        
	        //now we have note frequency p in the array
	        for(int i=0;i<s1.length();i++){
	            
	            frep[s1.charAt(i)-'a']++;
	        }
	        int si=0;
	        int ei=0;
	        //now we will slide the window in 
	        while(ei<s2.length()){
	            //window maintain ke
	            freq[s2.charAt(ei)-'a']++;
	            
	             //window shrink  
	            while(ei-si+1>s1.length()){
	                
	                freq[s2.charAt(si)-'a']--;
	                si++;
	            }
	            
	            //ans update
	            if(ei-si+1==s1.length()){
	                
	                if(compare(frep,freq)){
	                    
	                    return true;
	                }
	            }
	                
	            
	            
	           
	            ei++;     
	            
	        }
	        
	        
	        return false;
	        
	           
	        
	    }
	   
	   
	   
	   public static  boolean compare(int[]frep,int[]freqs){
           
           for(int i=0;i<frep.length;i++){
               
               if(frep[i]!=freqs[i]){
                   return false;
               }
           }
       return true;
       } 
   

}
