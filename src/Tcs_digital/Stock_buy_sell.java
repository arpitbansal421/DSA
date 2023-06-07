package Tcs_digital;

import java.util.*;
//you hve to earn maximum profit from buying and selling the stock
//you can buy and sell the stock n number of times
public class Stock_buy_sell {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		//adding element to the stock array
		
		int profit=0;
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>a[i-1]) {
				profit+=a[i]-a[i-1];
				
			}
		}
		
		System.out.println(profit);
	}

}
