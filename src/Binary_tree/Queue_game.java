package Binary_tree;
//The Game is as follows You have given a binary array, 
//where 1 denotes push operation and 0 denotes a pop operation in a queue. 
//The task is to check if the possible set of operations are valid or not.
//Print Valid if the set of Operations are Valid Otherwise Print Invalid.
import java.util.*;
public class Queue_game {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[]queue=new int[n];
			for(int i=0;i<n;i++) {
				queue[i]=sc.nextInt();
			}
			LinkedList<Integer>ll=new LinkedList<>();
			boolean isp=false;
			for(int i=0;i<queue.length;i++) {
				if(queue[i]==0 && ll.isEmpty()) {
					isp=true;
					System.out.print("Invalid ");
					break;
					
				}else if(queue[i]==0){
						ll.remove();
				}
				if(queue[i]==1) {
					ll.addFirst(queue[i]);
				}
				
				
				
			}
			if(!isp) {
				System.out.print("Valid");
			}
//			System.out.println();
		}
	}

	

}
