package Tcs_digital;

import java.util.*;
public class Save_prisnor {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no_of_prisnors=sc.nextInt();
		int no_of_candies=sc.nextInt();
		int start=sc.nextInt();
		
		int k=saveprisnor(no_of_prisnors,no_of_candies,start);
		System.out.println(k);
		
		
		
	}
	
	public static int saveprisnor(int n,int m,int s) {
		
		int r=m%n;
		
		int ans=(r+s-1)%n;
		
		return ans;
	}

}
