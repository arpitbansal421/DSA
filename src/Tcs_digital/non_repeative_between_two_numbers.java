package Tcs_digital;

import java.util.*;
public class non_repeative_between_two_numbers {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int k=count(n1,n2);
		System.out.println(k);
	}
	
	public static int count(int n1,int n2) {
		
		int count=0;
		
		for(int i=n1;i<=n2;i++) {
			int nums=i;
			boolean[]isvisted=new boolean[10];//digit ka track karne ke liye
			while(nums>0) {
//				System.out.println("heeeeeeeeeeee");
		
				int rem=nums%10;
//				System.out.println(rem);
				
				if(isvisted[rem]) {
//					System.out.println("hello");
					
					break;
					
				}
	
				isvisted[rem]=true;//Marked
				
				
				
				
				
				nums=nums/10;
				
				if(nums==0) {
					count++;
				}
				
			
			
				
				
			}
		
		}
		
		return count;
	}

}
