package Priority_Queue;
import java.util.*;

//given an array of element n return its minimum sum pair 
//for ex [1,2,3,4]
//1+2=3 [3,3,4]
//3+3=6 [6,4]
//6+4   [10]
public class Min_sum_pair {
	public static void main(String[] args) {
		int[]arr= {2,2,3,3,4};
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);//nlogn
		}
		int sum=0;
		while(pq.size()>1) {
			int r1=pq.remove();
			int r2=pq.remove();
			pq.add(r1+r2);
			sum+=r1+r2;
			
		}
		System.out.println(sum);
		
		
	}

}
