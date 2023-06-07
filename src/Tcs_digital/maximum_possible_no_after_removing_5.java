package Tcs_digital;
import java.util.*;

public class maximum_possible_no_after_removing_5 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=Integer.toString(n);
		int k=Integer.toString(n).length();
//		System.out.println(k);
		
		System.out.println(maximum_no(str,k-1));
		
		
	}
	public static int maximum_no(String str,int i) {
		if(i<0) {
			
			return Integer.parseInt(str);
		}
	
		if(i>0 && i<str.length()&&str.charAt(i)=='5') {
	
			return Integer.parseInt(str.substring(0,i)+str.substring(i+1));
		}
	
			return maximum_no(str,i-1);
			
			
			
		}
		
	}


