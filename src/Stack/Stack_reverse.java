package Stack;

import java.util.*;

public class Stack_reverse {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer>s1=new Stack<>();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		System.out.println(s1);
		reverse(s1,0);
		System.out.println(s1);
		
		
	}
	
	public static void reverse(Stack<Integer>s1,int item) {
		//base condition
		if(s1.isEmpty()) {
			return;
		}
		
		item=s1.pop();
		reverse(s1,item); 
		insert_at_bottom(s1,item);
	
//		System.out.println("hi");
//		s1.push(item);
		
	
	

}

	private static void insert_at_bottom(Stack<Integer> s1, int item) {
		
		
		if(s1.isEmpty()) {
			s1.push(item) ;
			return;
		}
		// TODO Auto-generated method stub
		int rev=s1.pop();
		insert_at_bottom(s1,item);
		s1.push(rev);
		
	}
	}
