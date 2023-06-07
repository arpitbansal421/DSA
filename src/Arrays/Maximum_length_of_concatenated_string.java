package Arrays;

/*
 * 1239. Maximum Length of a Concatenated String with Unique Characters
 * You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters.

Return the maximum possible length of s.

A subsequence is an array that can be derived from another array by deleting some or no elements 
without changing the order of the remaining elements.
 * 
 */
import java.util.*;
public class Maximum_length_of_concatenated_string {
	 public static void main (String args[]) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        String[]arr=new String[n];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.next();
	        }

	        System.out.print(maxlength(arr,0,""));

	    }

	     public static int maxlength(String[]arr,int i, String ans){
	        
	        //base case
	        
	        if(i==arr.length){
	            
	            return isunique(ans)==true?ans.length():0;
	        }
	        
	        //case 1
	        //the length of the string should not exceed 26
	        int inc=0;
	        int exc=0;
	 
	        if(ans.length()+arr[i].length()<=26){
	            //inclusion
	            inc=maxlength(arr,i+1,ans+arr[i]);
	            
	        }
	        
	        exc=maxlength(arr,i+1,ans);
	        
	        return  Math.max(inc,exc);
	    }

	    
	    public  static boolean isunique(String s){
	        
	        char[]arr=new char[26];
	     
	        for(int i=0;i<s.length();i++){
	            if(arr[s.charAt(i)-'a']==0){
	                arr[s.charAt(i)-'a']++;
	            }else{
	                return false;
	            }
	            
	        }
	        
	        return true;
	    }
	    

}
