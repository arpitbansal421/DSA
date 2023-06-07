package Dynamic_programming;


import java.util.*;
public class Bomb_defuse {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int k=sc.nextInt();
		
		int[]arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		
		
		
		
		
		
		unlock(0,k,arr.length-1,arr);
		
		
		
	
		
	}

	private static void unlock(int i,int k,int j,int []arr) {
		
		
		if(k==0) {
			return;
		}
		
		if(i>j) {
			return;
		}
		
		if(arr[i]<arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			unlock(i,k-1,j-1,arr);
		}
		
		
		// TODO Auto-generated method stub
		
		for(int idx=1;idx<arr.length;idx++) {
			unlock(idx,k,j-1,arr);
		}
		
		
		
		
		
			
			
		}
		
		
	}


