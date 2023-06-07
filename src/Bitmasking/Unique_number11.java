package Bitmasking;

import java.util.*;
//We are given an array containg n numbers.
//All the numbers are present twice except for two numbers which are present only once. 
//Find the unique numbers in linear time without using any extra space. ( Hint - Use Bitwise )
public class Unique_number11 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];aQA  S
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		unique(arr);
		
	}
	
	public static void unique(int []arr) {
		
		int ans=0;
		int a=0;
		for(int i=0;i<arr.length;i++) {
			ans=ans^arr[i];//after xor will get answer of xor of two numbers which are uniquie
			
		
		}
		int mask=(ans&(~(ans-1)));// by ans&(ans-1) we usully unset are first set bit
		
		// by ~(ans-1) all bits remaing are fist set will became zeo
		//now we are unique will eithei give zeo by xor or 1 by xor vice versa
		//zero group
		
		//nonzero group
		for(int i=0;i<arr.length;i++) {
		
			if((arr[i]&mask)!=0) {
				a^=arr[i];
			}
		}
		
		int b=ans^a;//11^3^3;
	
		System.out.println(a+" "+b);
		
	}

}
