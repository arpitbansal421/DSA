package Sliding_Window;

import java.util.*;
//given a string find its longest k unique character in the string
//ex--aaaabbbccc
//a,b,c are unique character are 3 unique character

public class Longest_K_Unique_Character {
	
	public static void main(String[] args) {
		String str="aaaaaaaabcdeefggggggggggggggggg";
		int k=3;
		int k1=Longest_string(str,k);
		System.out.println(k1);
		
	}

	private static int Longest_string(String str, int k) {
		// TODO Auto-generated method stub
		if(k>str.length()) {
			return -1;
		}
		int[]freqs=new int[256];//window maintain 
	
		int si=0;
		int ei=0;
		int ws=-1;
		int count=0;
		int start=-1;
		while(ei<str.length()) {
//			System.out.println("hello");
			char ch=str.charAt(ei);
			if(freqs[ch]==0) {
				count++;
				
				
			}
			freqs[ch]++;
			
			//window shrink
			while(count>k  && si<=ei) {
				
				freqs[str.charAt(si)]--;
				if(freqs[str.charAt(si)]==0) {
					count--;
				}
				si++;
				
			}
			
			
			
			//answer update
			if(count==k) {
				if(ws<ei-si+1) {
					start=si;
					ws=ei-si+1;

					
				}
				
				
				
			}
			ei++;
		}
		
		System.out.println(str.substring(start,start+ws));
		return ws;
	}

}
