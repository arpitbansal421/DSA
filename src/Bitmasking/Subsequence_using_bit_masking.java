package Bitmasking;

//very important
public class Subsequence_using_bit_masking {
	public static void main(String[] args) {
		
		print_subs("abc");
		
		
	}
	
	public static void print_subs(String str) {
		
		for(int i=0;i<(1<<str.length());i++) {
			String q="";
			int pos=0;
			int no=i;
			
			while(no>0 && pos<str.length()) {
				if((no&1)==1) {
					q+=str.charAt(pos);
					
				}
				
				pos++;
				no=no>>1;
				
			}
			pos=0;
			System.out.println(q);
			
			
		}
		return;
	}

}
