package Recurssion;
import java.util.*;

public class Tricky_permutation {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print_all(str,"");
	}

	private static void print_all(String que, String ans) {
		// TODO Auto-generated method stub
//		System.out.println("hi");
		
		//base case
		if(que.length()==0) {
			System.out.print(ans+" ");
//			System.out.println("hi");
			return;
			
		}
		
		for(int i=0;i<que.length();i++) {
			char ch=que.charAt(i);
				boolean isp=false;
			for(int j=i+1;j<que.length();j++) {
				if(ch==que.charAt(j)) {
					isp=true;
					break;
				}
				
			}                                                                                                                                                    
			if(isp==false) {
				String part1=que.substring(0,i);
				String part2=que.substring(i+1);
				print_all(part1+part2,ans+que.charAt(i));
			}
		}
		}}
		
		
	
	
//	public static void PrintAllPermutation(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.println(ans);
//			return;
//		}
//
//		for (int i = 0; i < ques.length(); i++) {
//			char ch = ques.charAt(i);
//			boolean isp = false;
//			for (int j = i + 1; j < ques.length(); j++) {
//				if (ch == ques.charAt(j)) {
//					isp = true;
//					break;
//				}
//			}
//			if (isp==false) {
//				String part1 = ques.substring(0, i);
//				String part2 = ques.substring(i + 1);
//
//				PrintAllPermutation(part1 + part2, ans + ch);
//			}
//
//		}
//
//	}
//
//}
