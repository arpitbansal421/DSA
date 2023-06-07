package Recurssion;
import java.util.*;

public class Generate_subseq_rev {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		print_all_sub(str,"");
		
	}

	private static void print_all_sub(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		// TODO Auto-generated method stub
		print_all_sub(ques.substring(1),ans);//no
		print_all_sub(ques.substring(1),ans+ques.charAt(0));
		
	}

}