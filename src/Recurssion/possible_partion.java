package Recurssion;

public class possible_partion {
	
	public static void main(String[] args) {
		String str="arpit";
		printpossible_part(str,"");
		
	}
	
	public static void printpossible_part(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		for(int i=1;i<=ques.length();i++) {
			String p1=ques.substring(0,i);
			
			String p2=ques.substring(i);
			printpossible_part(p2,ans+p1+"|");
		}
	}
	
	

}
