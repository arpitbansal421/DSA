package Tcs_digital;

import java.util.*;
public class Next_greater_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		permutation(Integer.toString(a)," ");
//		
//		System.out.println(set);
////		
//		String str="25";
//		
//		set.add(Integer.parseInt(str));
		System.out.println(set);
//		
	
	
	}
	
	static TreeSet<Integer>set=new TreeSet<>();
	public static void permutation(String ques,String ans) {
		
		if(ques.length()==0) {
//			System.out.println("hello");
			if(ans.length()!=0) {
				
				set.add(Integer.parseInt(ans));
			}
			return ;
		}
		
		
		for(int i=0;i<ques.length();i++){
			String part1=ques.substring(0,i);
			String part2=ques.substring(i+1);
			permutation(part1+part2,ans+ques.charAt(i));
		}
		return;
	}
	

}
