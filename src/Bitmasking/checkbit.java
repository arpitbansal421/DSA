package Bitmasking;

//the check bit -means we have to check whether ith bit is 1 or not

import java.util.*;
public class checkbit {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkibit(n,5));
	}
	
	public static boolean checkibit(int n,int i) {
		int mask=(1<<i);
		System.out.println(mask);
		
		if((n&mask)==0) {
			return false;
		}
		
		return true;
		
	}

}
