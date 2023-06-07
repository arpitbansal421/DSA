package Stack;

import java.util.*;
//
//Kartik Bhaiya, mentor at Coding Blocks, organized a party for their interns at Coding Blocks. 
//In a party of N people, only one person is known to everyone. Such a person may be present in the party, 
//if yes, she/he doesn’t know anyone in the party. We can only ask questions like “does A know B? “.
//Find the stranger (celebrity) in minimum number of questions.

public class Clebraty_problem {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[][]people=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				people[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println(clebratity(people));
	}

	private static int clebratity(int[][] people) {
		// TODO Auto-generated method stub
		
		Stack<Integer>s=new Stack<>();
		//pushing the element into the stack
		for(int i=0;i<people.length;i++) {
			s.push(i);
		}
		
		//checking the most apporopiate candidate for our celebraty
		while(s.size()!=1) {
			int a=s.pop();
			int b=s.pop();
			if(people[a][b]==1) {
				//that means a knows b so a cant be celeb
				s.push(b);
			}else {
				s.push(a);
			}
		}
		
		//checking whether the most appopiate candidate is celeb or not
		
		int idx=s.pop();
//		System.out.println(idx);
		for(int i=0;i<people.length;i++) {
			if(i!=idx &&(people[i][idx]==0|| people[idx][i]==1)) {
				System.out.println("hi");
				return -1;
			}
		}
		
		return idx;
		
		
	}
	
	

}
