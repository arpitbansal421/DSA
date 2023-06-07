package Tcs_digital;

import java.util.*;
public class Football_mtches {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<ArrayList<String>>>ll=new ArrayList<>();
		int total_fixture=n*(n-1)/2;
		
		String[]home=new String[n];
		String[]away=new String[n];
		String []score=new String[n];
		
		for(int i=0;i<n*(n-1)/2;i++) {
			home[i]=sc.next();
			away[i]=sc.next();
			score[i]=sc.next();
		}
		
		
		
	}

}
