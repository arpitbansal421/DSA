package Recurssion;
import java.util.*;

public class Generate_subseq_link {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ArrayList<String>li=new ArrayList<>();
		
		printallsub(str,"",li);
		System.out.print(li);
		
	}

	private static void printallsub(String ques, String ans,ArrayList<String>li) {
		if(ques.length()==0) {
			li.add(ans);
			return;
			
		}
		// TODO Auto-generated method stub
		printallsub(ques.substring(1),ans+ques.charAt(0),li);//yes
		printallsub(ques.substring(1),ans,li);//no
		
		   
	}

}