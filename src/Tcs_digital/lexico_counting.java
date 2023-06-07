package Tcs_digital;

import java.util.*;
public class lexico_counting {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		
		lexicocounting(0,100);
	}
	
	public static void lexicocounting(int curr,int target) {
		
		int i=0;
		if(curr>target) {
			
			
			return;
			
		}
		System.out.print(curr+" ");
		if(curr==0) {
			i=1;
		}
		
		//iteration
		for(;i<=9;i++) {
			lexicocounting(curr*10+i,target);
			
		}
		return;
	}

}
