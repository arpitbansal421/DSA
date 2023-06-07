package Tcs_digital;

import java.util.*;
public class Minimum_coin_needed {
	
	public static void main(String[]args) {
		
		int[]coin= {1,2,5};
		int k=minimumcoin(coin,0,13);
		System.out.println(k);
		
	}
	
	
	public static int minimumcoin(int []coin,int i,int amount) {
		

		if(amount==0) {
			
			return 0;
		}
		if(i>=coin.length) {
			return 100000;
		}
		
		int inc=100000;
		int exc=0;
		
		if(coin[i]<=amount) {
			amount-=coin[i];//do
//			System.out.println(amount);
			inc=minimumcoin(coin,i,amount)+1;
			amount+=coin[i];
		}
		exc=minimumcoin(coin,i+1,amount);
		
		
		return Math.min(inc, exc);
		
	};
	
	

}
