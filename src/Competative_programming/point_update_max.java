package Competative_programming;

import java.util.*;

public class point_update_max {
	
	
	int[]ar;
	int[]tree;
	
	public point_update_max(int[]arr) {
		this.ar=arr;
		this.tree=new int[4*ar.length];
		
		
	}
	
	public void build() {
		
		 build(1,0,ar.length-1);
	}
	
	private void build(int node, int start, int end) {
		
		if(start==end) {
			tree[node]=ar[start];
		}
		
		else {
			int mid=(start+end)/2;
			
			build(node*2,start,mid);
			build(node*2+1,mid+1,end);
			
			tree[node]=Math.max(tree[node*2], tree[node*2+1]);
		}
		// TODO Auto-generated method stub
		return ;
		
		
	}
	
	
	public void update(int l,int r,int pos,int val) {
		 update(1,0,ar.length-1,pos, val);
		
	}

	private void update(int node, int start, int end, int pos,int val) {
		
		if(start==end) {
			
			tree[node]=val;
			ar[start]=val;
			
		}
		
		else {
			int mid=(start+end)/2;
			
			if(pos<=mid) {
				update(node*2,start,mid,pos,val);
			}else {
				update(node*2+1,mid+1,end,pos,val);
			}
			tree[node]=Math.max(tree[node*2], tree[node*2+1]);
		}
		
	
	
		
		// TODO Auto-generated method stub
		return ;
	}
	
	
	public int query(int l,int r) {
		return query(1,0,ar.length-1,l,r);
	}
	
  private int query(int node, int start, int end,int l,int r) {
  if (end < l || r < start) {
      return Integer.MIN_VALUE;
  } else if (l <= start && end <= r) {
      return tree[node];
  } else {
      int mid = (start + end) / 2;
      int left = query(2 * node, start, mid, l, r);
      int right = query(2 * node + 1, mid + 1, end, l, r);
      return Math.max(left, right);
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
		point_update_max mm=new point_update_max(arr);
		mm.build();
		while(q!=0) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int pos=sc.nextInt();
			int val=sc.nextInt();
			mm.update(l, r, pos, val);
			System.out.println(mm.query(l,r));
			q--;
			
		}
		
	}

}
