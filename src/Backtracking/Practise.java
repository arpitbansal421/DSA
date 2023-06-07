package Backtracking;
import java.io.InputStream;
import java.util.*;

public class Practise {
	private static final int Integer_MAX_VALUE = 0;
	private static final int Integer_MIN_VALUE = 0;

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		
		int k=minimum_product_of_digit(n,0,0);
		if(k!=0) {
			System.out.println(k);
		}else {
			System.out.println("Not possible");
		}
		
		
	}

	private static int minimum_product_of_digit(int n, int f_n, int s_n) {
		
		int ans=0;
		int no=0;
		
		for(int i=9;i>1;i--) {
			if(n%i==0) {
//				System.out.println("hi");
				no=i;
				break;
				
				
				
					
					
				
			}
			
		}
		if(no!=0) {
			s_n=n/no;
			ans=s_n*10+no;
			
			
		}
		
		return ans;
		// TODO Auto-generated method stub
		
	}

	

}
