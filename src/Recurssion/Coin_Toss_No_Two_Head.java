package Recurssion;

import java.util.*;

public class Coin_Toss_No_Two_Head {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		coin_toss(n,"",false);
		
	}

	private static void coin_toss(int n, String string, boolean b) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.print(string+" ");
			return;
		}
		if(!b) {
			coin_toss(n-1,string+"H",true);
		}
		coin_toss(n-1,string+"T",false);
		
		
	}

}