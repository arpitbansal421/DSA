package Recurssion;

import java.util.*;

public class lexico_counting{
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		print_all(0,end);
	}

	private static void print_all(int curr, int end) {
		// TODO Auto-generated method stub
		if(curr>end) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		
		
		for(;i<=9;i++) {
			print_all(curr*10+i,end);
			
		}
		
	}
	
	
}
