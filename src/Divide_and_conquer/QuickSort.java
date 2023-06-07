package Divide_and_conquer;

import java.util.*;
public class QuickSort {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		quicksort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
				
	}
	
	
	public static int pivot_ide(int[]arr,int si,int ei) {
		int pivot=arr[ei];
		int pi=si;//now we are considering the required index of pivot as element
		
		for(int i=si;i<ei;i++) {
			
			if(pivot>=arr[i]) {
				//so we need a swap
				int t=arr[i];
				arr[i]=arr[pi];
				arr[pi]=t;
				pi++;
			}
		}
		
		int t=arr[ei];
		arr[ei]=arr[pi];
		arr[pi]=t;
		
		return pi;
	}
	
	public static void quicksort(int []arr,int si,int ei) {
		if(si>ei) {
			return;
		}
		
		int pi=pivot_ide(arr,0,ei);
		quicksort(arr,si,pi-1);
		quicksort(arr,pi+1,ei);
	}

}
