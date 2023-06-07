package Tcs_digital;

import java.util.*;
public class prac {
	
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		boolean[]isp=new boolean[10];
		
		for(int i=0;i<n1;i++) {
			int nums=i;
			if(isp[nums%10]) {
				continue;
			}
			isp[nums%10]=true;
			System.out.print(i);
			
		}
		
	
}

}
