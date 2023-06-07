package Backtracking;

import java.util.*;

public class different_ways_to_add_parenthesis {
	
	public static void main(String[]args) {
		String str="2*3-4*5";
		ArrayList<Integer>list=new ArrayList<>();
		
		list=different_ways_to_compute(str);
		System.out.println(list);
		
		 
	}

	private static ArrayList<Integer> different_ways_to_compute(String expression) {
		
		//base case (corner case)
		if(expression.indexOf("*")==-1 && expression.indexOf("-")==-1 && expression.indexOf("+")==-1) {
			ArrayList<Integer>bs=new ArrayList<>();
			bs.add(Integer.parseInt(expression));
			return bs;
		}
		
		// TODO Auto-generated method stub
		
		//recursive call===no of operators
		ArrayList<Integer>ans=new ArrayList<>();
		for(int i=0;i<expression.length();i++) {
			if(expression.charAt(i)=='-'|| expression.charAt(i)=='*'|| expression.charAt(i)=='+') {
				char ch=expression.charAt(i);
				ArrayList<Integer>left=different_ways_to_compute(expression.substring(0,i));//left recurrsive call
				ArrayList<Integer>right=different_ways_to_compute(expression.substring(i+1));//right recurssive call
				
				if(ch=='*') {
					for(int val:left) {
						for(int val1: right) {
							ans.add(val*val1);
							
						}
					}
				}
				
				if(ch=='-') {
					for(int val:left) {
						for(int val1: right) {
							ans.add(val-val1);
							
						}
					}
				}
				
				if(ch=='+') {
					for(int val:left) {
						for(int val1: right) {
							ans.add(val+val1);
							
						}
					}
				}
				
				
			}
		}
		return ans;
	}

}
