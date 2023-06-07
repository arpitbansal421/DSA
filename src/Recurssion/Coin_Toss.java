package Recurssion;

import java.util.*;

public class Coin_Toss {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int item=sc.nextInt();
		
		printallpermutation(item,"");
		
	}

	private static void printallpermutation(int item, String ans) {
		// TODO Auto-generated method stub
		
		//Base case
		
		if(item==0) {
			System.out.print(ans+" ");
			return;
		}
		
		printallpermutation(item-1,ans+"H");//Head call
		printallpermutation(item-1,ans+"T");//No head call
		
	}

}

