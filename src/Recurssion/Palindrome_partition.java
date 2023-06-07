package Recurssion;

import java.util.*;
//very very important

public class Palindrome_partition {
	
	
	
	public static  void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		partioning(str,"");
	}

	private static void partioning(String ques, String ans) {
//		System.out.println("hi");
//		System.out.println(ques.length());         
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		
		// TODO Auto-generated method stub
		
		//now we iterate through the length of string
		for(int i=1;i<=ques.length();i++) {//Ques=nitin
			String p1=ques.substring(0,i);//n|
			
				
				String p2=ques.substring(i);//itin|
				partioning(p2,ans+p1+"|");
			
			
		}
		
	}
	
	public static boolean ispalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}
	
	

}
