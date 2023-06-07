package Competative_programming;

import java.util.*;

public class Lazy_propgation {
	
	
	int[]ar;
	int[]tree;
	int[]lazy;
	
	public Lazy_propgation(int[]arr) {
		this.ar=arr;
		this.tree=new int[4*ar.length];
		this.lazy=new int[4*ar.length];
		
	}
	
	public void build() {
		
		 build(1,0,ar.length-1);
		
	}
	private void build(int node, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end) {
			tree[node]=ar[start];
			return ;
		}else {
			
			int mid=(start+end)/2;
			
			build(node*2,start,mid);
			build(node*2+1,mid+1,end);
			tree[node]=tree[node*2]+tree[node*2+1];
			
		}

	}
	
	public void propogate(int node,int start,int end) {
		if(start==end) {
			tree[node]+=lazy[node];
			lazy[node]=0;
		}else {
			tree[node]+=(end-start+1)*lazy[node];
			tree[node*2]+=lazy[node];
			tree[node*2+1]+=lazy[node];
			lazy[node]=0;
			
		}
	}
	
	public int query(int l,int r) {
		return query(1,0,ar.length-1,l,r);
		
		
		
		
	}
	
	
	private void update(int l,int r,int val) {
		update(1,0,ar.length-1,l,r,val);
		
	}

	public void update(int node, int start, int end, int l, int r,int val) {
		
		//if updation of any subtree is left which not a part of out answer
		propogate(node,start,end);
		//negative base case
		if(end<l || r<start) {
			return;
			
		}
		
		//when the range our range is the sub range of the total range
		if(l<=start && end<=r) {
			lazy[node]+=val;
			propogate(node,start,end);
		}else {
			int mid=(end+start)/2;
			update(node*2,start,mid,l,r,val);
			update(node*2+1,mid+1,end,l,r,val);
			
			tree[node]=tree[node*2]+tree[node*2+1];
		}
		

		
		
	}

	private int query(int node, int start, int end, int l, int r) {
		//propogate(node,start,end);
		// TODO Auto-generated method stub
		
		if(end<l || r<start) {
			return 0;
		}
		
		if(l<=start && end<=r) {
			return tree[node];
		}else {
			int mid=(start+end)/2;
			int left=query(node*2,start,mid,l,r);
			int right=query(node*2+1,mid+1,end,l,r);
			
			return left+right;
		}
		
		
		
		

	}


	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Lazy_propgation tt=new Lazy_propgation(arr);
		tt.build();
		
//		for(int i=0;i<tt.tree.length;i++) {
//			System.out.println(tt.tree[i]+" "+i);
//			
//		}
		
		while(q!=0) {
//			
			int l=sc.nextInt();
			int r=sc.nextInt();
			int val=sc.nextInt();
			int l1=sc.nextInt();
			int r1=sc.nextInt();
			tt.update(l, r, val);
			System.out.println(tt.query(l1, r1));
			q--;

//			
		}
	}

	

}
