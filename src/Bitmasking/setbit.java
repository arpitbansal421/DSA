package Bitmasking;

import java.util.*;
//it ith bit is 0 will make it 1 and if it is 1 make it zero
public class setbit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=sc.nextInt();
		int mask=(i<<1);
		System.out.println((n|mask));
		
		
	}
	
	

}
