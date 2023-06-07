package Tcs_digital;

import java.util.*;
public class prac4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []res=new int[10000];
		
		
		int k=minimumvalue(n,res);
		
		if(k==0) {
			System.out.println("Not possible!");
		}else {
			
			for(int i=res.length-1;i>=0;i--) {
				if(res[i]!=0) {
					System.out.print(res[i]);
				}
			}
		}
			
		}
		
		
	
	
	public static int minimumvalue(int n,int []res) {

		int j=0;
		int ans=0;
		int mul=1;

//		boolean visited=false;
		
		//case 1
		if(n<10) {
			return 10+n;
		}
		
		

		//case 2
		//iterating 9 to 2
		for(int i=9;i>=2;i--) {
			
			while(n%i==0) {
				n=n/i;
				res[j]=i;
			
			
			
				j++;
				
				
				
				
			}
			
		}
		
		//case 3
		if(n>10) {
			return 0;
		}
		
		
		
	
		return 1;
	}

}
