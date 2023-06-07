package Recurssion;

import java.util.*;

public class Generate_parenthesis {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList<String>li=new ArrayList<>();
		Print_parenthesis(n,"",0,0,li);
		System.out.print(li);
		
	}

	private static void Print_parenthesis(int n, String ans,int open,int close,ArrayList<String>li) {
		// TODO Auto-generated method stub
		//base condition
		if(open==n && close==n) {
			li.add(ans);
			return;
			
			
		}
		
		//condition for opening
		
		if(open<n) {
			Print_parenthesis(n,ans+"(",open+1,close,li);
		}
		
		//condition for closing
		if(close<open) {
			Print_parenthesis(n,ans+")",open,close+1,li);
		}
		
		
		
		
		
	}

}