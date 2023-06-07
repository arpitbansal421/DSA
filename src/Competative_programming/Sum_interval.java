package Competative_programming;

import java.util.*;

public class Sum_interval {
	
	int[]ar;
	int []tree;
	
	public Sum_interval(int[]arr) {
		this.ar=arr;
		this.tree=new int[4*arr.length];
		
		
	}
	
	
	public void build() {
		build(1,0,ar.length-1);
	}
	
	public void build(int node,int start,int end) {
		
		if(end==start) {
			tree[node]=ar[start];
			
		}else {
			int mid=(end+start)/2;
			build(node*2,start,mid);
			build(node*2+1,mid+1,end);
			tree[node]=tree[node*2]+tree[node*2+1];
		}
	}
	
	public void update(int pos,int val) {
		update(1,0,ar.length-1,pos,val);
	}


	private void update(int node, int start, int end, int pos, int val) {
		// TODO Auto-generated method stub
		
		if(start==end) {
			ar[start]=val;
			tree[node]=val;
		}else {
			int mid=(start+end)/2;
			if(pos<=mid && start<=pos) {
				update(node*2,start,mid,pos,val);
			}else {
				update(node*2+1,mid+1,end,pos,val);
			}
			
			tree[node]=tree[node*2]+tree[node*2+1];
		}
		
	}
	
	public int query(int l,int r) {
		return query(1,l,r,0,ar.length-1);
	}


	private int query(int node, int l, int r, int start, int end) {
		
		if(end<l ||r<start) {
			return 0;
		}
		
		if(start==end) {
			return tree[node];
		}
		// TODO Auto-generated method stub
		else if(start<=l && end<=r) {
			return tree[node];
		}else {
			int mid=(start+end)/2;
			
			int left=query(node*2,l,r,start,mid);
			int right=query(node*2+1,l,r,mid+1,end);
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
		Sum_interval tt=new Sum_interval(arr);
		tt.build();
		while(q!=0) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int pos=sc.nextInt();
			int val=sc.nextInt();
			tt.update(pos, val);
			System.out.println(tt.query(l, r));
			q--;
		}
		
		
	}

}
