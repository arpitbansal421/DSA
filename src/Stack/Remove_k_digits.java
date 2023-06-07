package Stack;
import java.util.*;

//very importand 
//remove k digits
//leetcode 402

public class Remove_k_digits {
	

	
	    public static void main (String args[]) {

			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			int n=sc.nextInt();
			Remove(str,n);

	    }

		public static void Remove(String str,int n){

			Stack<Integer>st=new Stack<>();

			//all digit have been teaversed 
			for(int i=0;i<str.length();i++){

				while(!st.isEmpty()&& n>0 && st.peek()>str.charAt(i)-'0'){
					st.pop();
					n--;
				}

				st.push(str.charAt(i)-'0');
			}
		
		//now we will handle some corner cases

		//case 1 if k>0
		//if k is greater zero we will simply poop peek digits
		//for ex 123456 k=3
		//456

		while(n>0 && !st.isEmpty()){
			st.pop();
			n--;
		}

		//case 2 //leading zeores our no which will be formed should not having leading zeos
	     
		Stack<Integer>ans=new Stack<>();//no will be reverse leading zeores at front

		while(!st.isEmpty()){
			ans.push(st.pop());
		}
		while(!ans.isEmpty() && ans.peek()==0){
			
			ans.pop();
		}

		StringBuilder sb=new StringBuilder();

		while(!ans.isEmpty()){
			sb.append(ans.pop());
		}


	    String res=sb.toString();
		System.out.println(res);


	}

}
