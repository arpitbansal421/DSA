/package Divide_and_conquer;

import java.util.*;
public class Merge_sort {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[]ans=sort(arr,0,arr.length-1);
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
	}
	
	public static int []sort(int []arr,int si,int ei){
		
		//base case for only one element
		if(si==ei) {
			int[]bs=new int[1];
			
			bs[0]=arr[si];
			return bs;
		}
		
		int mid=(si+ei)/2;
		int[]l=sort(arr,si,mid);
		int[]r=sort(arr,mid+1,ei);
		
		
		return mergesortedarray(l,r);
	}

	private static int[] mergesortedarray(int[] l, int[] r) {
		// TODO Auto-generated method stub
		
		int i=0;//starting pointer for first array
		int j=0;//starting pointer for the second array
		int k=0;//it will keep track for no of element added into the array
//		System.out.println("kjhgfd");
		int[]ans=new int[l.length+r.length];
		while(i<l.length && j<r.length) {
//			System.out.println("kjhgfd");
			if(l[i]<r[j]) {
				ans[k]=l[i];
		
				k++;
				i++;
			}
			
			
			else {
				ans[k]=r[j];
				k++;
				j++;
			}
		}
		
		while(i<l.length) {
			ans[k]=l[i];
			i++;
			k++;
		}
		
		while(j<r.length) {
			ans[k]=r[j];
			j++;
			k++;
		}
		return ans;
	}
	

}
