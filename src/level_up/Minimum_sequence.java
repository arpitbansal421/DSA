package level_up;

import java.util.*;
//your given the string whre d denotes decreasing and i denotes increasing 
//from the minimum number from the string

public class Minimum_sequence {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		minimum_sequence(str);
		
		
	}
	
	public static void minimum_sequence(String str) {
		
		Stack<Integer>ss=new Stack<>();
		int[]ans=new int[str.length()+1];
		int c=1;
		
		for(int i=0;i<=str.length();i++) {
			if(i==str.length()||str.charAt(i)=='I') {
				ans[i]=c;
				c++;
				
				while(!ss.isEmpty()) {
					ans[ss.pop()]=c;
					c++;
				}
			}else {
				ss.push(i);
			}
			
			
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
	}

}
