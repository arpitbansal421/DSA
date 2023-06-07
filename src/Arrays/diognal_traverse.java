package Arrays;

import java.util.*;

public class diognal_traverse {
	public static void main(String[] args) {
		int[][]arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		int[]k=diognal_traverse(arr);
		
		for(int i=0;i<k.length;i++) {
			System.out.print(k[i]+" ");
		}
	
	

}

	private static int[] diognal_traverse(int[][] arr) {
		
		int n=arr.length;//rows 
		int m=arr[0].length;//diogonal
		int[]ans=new int[m*n];//answer array 
		
		for(int d=0;d<m+n-1;d++) {
			int r=0;
			int c=0;
			
		}
		
				
		return null;
	
		
	}
		// TODO Auto-generated method stub
	
	
		
	}
