package Arrays;
import java.util.*;
/*
 * 567. Permutation in String
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
 * 
 */

public class Permutation_in_string {
	
	   public boolean checkInclusion(String s1, String s2) {
	        int n=s1.length();
	        int m=s2.length();
	        if(m<n){
	            return false;
	        }

	        int[]freqs=new int[26];//s1 string 
	        int[]freqt=new int[26];//s2 string

	        for(int i=0;i<n;i++){
	            freqs[s1.charAt(i)-'a']++;
	        }

	        

	        //now we will create a fixed size window ol length s1 as the required substring
	        /*would be obiviously of length of s1


	        */
	        //now we have created window of length s1
	        for(int i=0;i<n;i++){

	            freqt[s2.charAt(i)-'a']++;
	        }
	        //now we will iterate our window

	        for(int i=n;i<m;i++){

	            if(Arrays.equals(freqs,freqt)){
	                return true;
	            }
	            freqt[s2.charAt(i)-'a']++;
	            freqt[s2.charAt(i-n)-'a']--;

	        }
	        if(Arrays.equals(freqs,freqt)){
	            return true;
	        }

	        return false;

	       
	    }

}
