package Recurssion;

import java.util.*;

public class Board_path {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		
		print_all_path(amount,0,"");
		
	}

	private static void print_all_path(int end,int curr, String ans) {
		
		//neagative base condition
		if(curr>end) {
			return;
		}
		
		//base condition
		if(curr==end) {
			System.out.println(ans);
			return;
		}
		
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) {
			
			print_all_path(end,curr+i,ans+i);
		}
//		print_all_path(end,curr+2,ans+"2");
//		print_all_path(end,curr+3,ans+"3");
//		print_all_path(end,curr+4,ans+"4");
//		print_all_path(end,curr+5,ans+"5");
//		print_all_path(end,curr+6,ans+"6");
		
	}

}