package Tcs_digital;


import java.util.*;
public class Mix_series_question {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int k=Mixseries(n);
		System.out.println(k);
		
		int l=Mixseries2(n);
		System.out.println(l);
		
		
		
	}
	
	public static  int Mixseries(int n) {
		
		int i=4;//for indes
		int []ans=new int[n+1];
		ans[0]=0;
		ans[1]=0;
		ans[2]=2;
		ans[3]=1;
				
		while(i<=n) {
			if(i%2==0) {
				ans[i]=ans[i-2]+2;
			}else {
				ans[i]=ans[i-2]+1;
			}
			
			i++;
			
			
		}
		
		return ans[n];
		
	}
	
	//concept 2//
	
	public static int  Mixseries2(int n) {
		
		if(n%2==0) {
			return n;
		}
	
	
	return n/2;
}
	}
