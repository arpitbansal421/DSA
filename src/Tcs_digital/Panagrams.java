package Tcs_digital;

import java.util.*;
public class Panagrams {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	    String str = sc.nextLine();
	    str = str.replaceAll("\\s+", "");
	    
	    int[]freq=new int[26];//for tracking the freq of the words
	    
	    for(int i=0;i<str.length();i++) {
	    	char ch=str.charAt(i);
//	    	System.out.println((int)ch);
	    	if(65<=(int)ch&&(int)ch<=90) {
	    		freq[ch-'A']++;

	    	}else {
	    		
	    		freq[ch-'a']++;
	    	}

	    
	
//		System.out.print(str);
//		
	}
	    boolean possible=true;
	    for(int i=0;i<freq.length;i++) {
	    	if(freq[i]==0) {
	    		possible=false;
	    		break;
	    	}
	    
	    }
	    
	    if(possible) {
	    	System.out.println("Pangrams");
	    }else {
	    	System.out.println("Not a Pangrams");
	    }
	    
	

}
	}
