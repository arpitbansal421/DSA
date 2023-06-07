package Tcs_digital;
import java.util.*;


public class vien_dia {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int p1=sc.nextInt();//who participated in first and second
		int p2=sc.nextInt();//who participated in first and 2nd
		int p3=sc.nextInt();//who participated in 2nd and third
		int q=sc.nextInt();//the candidate who participated in all
		int u=sc.nextInt();//total no of candidates
		int r=sc.nextInt();//the candidates who did not participated
		
		int exactly_one_prob=(u-p1-p2-p3+2*q-r);
		int only_first=(exactly_one_prob/3)+p1+p3-q;
		System.out.println(exactly_one_prob);
//		System.out.println(y);
		System.out.println(only_first);
		
		
	}

}
