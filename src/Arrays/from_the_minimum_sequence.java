package Arrays;

import java.util.*;

public class from_the_minimum_sequence {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			
			String str=sc.next();
			
			minimum_sequence(str);
		}
		
	}

	private static void minimum_sequence(String str) {
		// TODO Auto-generated method stub
		
		int[]ans=new int[str.length()+1];
		int count=1;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() ||str.charAt(i)=='I') {
				ans[i]=count;
				count++;
				for(int j=i-1;j>=0&&str.charAt(j)!='I';j--) {
					ans[j]=count;
					count++;
				}
			}
			
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]);
		}
		System.out.println();
		
	}

}
