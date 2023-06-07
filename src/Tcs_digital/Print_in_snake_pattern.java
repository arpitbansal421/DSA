package Tcs_digital;

import java.util.*;
public class Print_in_snake_pattern {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][]matrix=new int[m][n];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j]=sc.nextInt();
			}
			
		}
		
		print(matrix);
		
		
	}
	
	public static void print(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				//print from first
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			
			else {
				
				for(int j=arr.length-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	

}
