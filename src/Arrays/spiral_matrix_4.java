package Arrays;

/*
 * 
 * Leetcode 2326 spiral matrix 4
 * You are given two integers m and n, which represent the dimensions of a matrix.

You are also given the head of a linked list of integers.

Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.

Return the generated matrix.
 */

import java.util.*;
public class spiral_matrix_4 {
	public static void printmatrix(int[][]arr) {
		int t=(arr.length)*(arr[0].length);
		
		int k=0;
		int rstart=0;
		int rend=arr.length-1;
		int cstart=0;
		int cend=arr[0].length-1;
		
		while(k<t) {
			
			for(int i=cstart;i<=cend &&k<t;i++) {
				
				System.out.print(arr[rstart][i]+" ");
				k++;
			}
			rstart++;
			for(int i=rstart;i<=rend&& k<t;i++) {

				System.out.print(arr[i][cend]+" ");
				k++;
			}
			cend--;
			
			for(int i=cend;i>=cstart&& k<t;i--) {
			
				System.out.print(arr[rend][i]+" ");
				k++;
			}
			rend--;
			
			for(int i=rend;i>=rstart&& k<t;i--) {
				System.out.print(arr[i][cstart]+" ");
				k++;
			}
			cstart++;
			
		}
	}


}
