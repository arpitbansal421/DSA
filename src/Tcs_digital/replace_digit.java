package Tcs_digital;

import java.util.*;
public class replace_digit {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>10000000 || n<0) {
			System.out.println("Wrong answer");
		}
		
		int k=Replace(n);
		System.out.println(k);
		
		

	}

	private static int Replace(int ques) {
		// TODO Auto-generated method stub
		int ans=0;
		int mul=0;
		int k=ques;
		boolean isp=false;
		String str=Integer.toString(k);
		System.out.println(str.length());
		if(str.charAt(0)=='0') {
			isp=true;
			
		}
		
		while(ques>0) {
			int rem=ques%10;
			ans+=(9-rem)*(Math.pow(10,mul));
			mul++;
			ques=ques/10;
			
			
			
			


		
		
		}
		
		if(isp) {
			System.out.print("hello");
			ans+=(9)*(Math.pow(10,mul));
		}
		return ans;

		
		
		
		
		
		
		
		
	}
	
	
	

}
