package Recurssion;

import java.util.*;

public class Generate_Subsequence {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		printsub(str,"");
		
		
	}

	private static void printsub(String ques,String ans) {
		// TODO Auto-generated method stub
		//base case
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		printsub(ques.substring(1),ans+ques.charAt(0));//yes
		printsub(ques.substring(1),ans);//no
		
		
		
	}

}
