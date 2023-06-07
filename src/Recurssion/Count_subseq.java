package Recurssion;

import java.util.*;

public class Count_subseq {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.print(count_seq(str));
		
	}

	private static int  count_seq(String str) {
		
		
		
		if(str.length()==0) {
			return 1;
		}
		// TODO Auto-generated method stub
	
		
		int inc=count_seq(str.substring(1));
		int ecx=count_seq(str.substring(1));
		
		return inc+ecx;
		
		
		
		
	}

}