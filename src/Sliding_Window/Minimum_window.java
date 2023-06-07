package Sliding_Window;

import java.util.*;

//Given two Strings s and t of length m and n respectively return the minimum window of the substring
//such that every character in t is included in window
//if no such window exist return empty string


public class Minimum_window {
	public static void main(String[] args) {
		String s="AAAAAAAAAADOBECODEBAANC";
		String t="ABC";
		System.out.println(MinimumWindow(s,t));
	}
	
	public static String MinimumWindow(String s,String t) {
		//frequency array for t
		int[]freqs=new int[256];//frequency array of s
		int[]freqt=new int[256];//frequency array of t
		
		for(int i=0;i<t.length();i++) {
			char ch=t.charAt(i);
			freqt[ch]++;//ABC filled
			
		}
		int si=0;//start pointer
		int ei=0;//end pointer
		int ws=Integer.MAX_VALUE;
		int count=0;
		int start=-1;
		while(ei<s.length()) {
			//window maintain
			char ch=s.charAt(ei);
			freqs[ch]++;
			if(freqt[ch]>=freqs[ch]) {
				count++;
			}
			//window shrink
			if(count==t.length()) {
				while(freqs[s.charAt(si)]>freqt[s.charAt(si)] && si<=ei) 
				{
					
					freqs[s.charAt(si)]--;
					si++;
				}
				if(ws>ei-si+1) {
					ws=ei-si+1;
					start=si;
				}
			}
			
			ei++;
			
			
		}
		if(start==-1) {
			return "";
		}
		
		return s.substring(start,start+ws);


}}
