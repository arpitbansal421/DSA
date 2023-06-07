package Priority_Queue;

import java.util.*;
public class Merge_k_Sorted {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][]arr=new int[n][m];

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
       
	   Merge_k_Sorted mm=new Merge_k_Sorted();
		ArrayList<Integer>ans=mm.margeksorted(arr);
		
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i)+" ");
		}



    }

	public  ArrayList<Integer>margeksorted(int[][]arr){

		PriorityQueue<help>pq=new PriorityQueue<>();

		for(int[]ar:arr){
			pq.add(new help(ar,0));
		}
		ArrayList<Integer>ll=new ArrayList<>();

		while(!pq.isEmpty()){
			help temp=pq.remove();

			ll.add(temp.a[temp.index]);

			if(temp.index<temp.a.length-1){
				pq.add(new help(temp.a,temp.index+1));
			}
		}

		return ll;




	}}

	 class help implements Comparable<help>{
		int[]a;
		int index;

		public help(int[]a,int index){
			this.a=a;
			this.index=index;
		}

		@Override
		public int compareTo(help o){
			return this.a[this.index]-o.a[o.index];
		}

}
