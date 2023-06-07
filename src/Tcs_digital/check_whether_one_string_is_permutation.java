package Tcs_digital;

import java.util.*;
//given a string 
//and the list of string check whether the list of string is permutation or not

public class check_whether_one_string_is_permutation {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		String[]list=new String[n];
		
		for(int i=0;i<n;i++) {
			list[i]=sc.next();
		}
		
		
	}
	
	public static void compare(String[]list,String ans) {
		int a=0;
		int freq[]=new int[list.length];
		
		for(int j=0;j<list.length;j++) {
			
			for(int i=0;i<list[i].length();i++) {
				a=(int)(list[i]).charAt(i);
				
				
				
				
				
				
			}
			freq[j]=(a)%(list.length);
		}
		
		//pigeon hole
		char []k=ans.toCharArray();
		
		int ques=0;
		for(int i=0;i<k.length;i++) {
			ques=(int)(ans.charAt(i));
			
		}
		
		
		
		
	}

}
