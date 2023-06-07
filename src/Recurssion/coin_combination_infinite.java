package Recurssion;

import java.util.*;
public class coin_combination_infinite {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int amount=sc.nextInt();
		
		int[]coin=new int[n];
		for(int i=0;i<n;i++) {
			coin[i]=sc.nextInt();
		}
		Arrays.sort(coin);
		coinpermutation(coin,amount,"");
		
	}
	
	public static void coinpermutation(int[]coin,int amount,String ans) {
		//base condition
		if(amount==0) {
			
			System.out.print(ans+"  ");
			return;
		}
		
		for(int i=0;i<coin.length;i++) {
//			System.out.println("asdfghjkjhgf");
			if(amount>=coin[i]) {
				amount-=coin[i];
				coinpermutation(coin,amount,ans+coin[i]);
				amount+=coin[i];
				
			}
			
		}
		
		return;
	}

}
