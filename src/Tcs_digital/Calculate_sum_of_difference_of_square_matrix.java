package Tcs_digital;

import java.util.*;

public class Calculate_sum_of_difference_of_square_matrix {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]square=new int[n][n];
		for(int i=0;i<square.length;i++) {
			for(int j=0;j<square[0].length;j++) {
				square[i][j]=sc.nextInt();
			}
		}
		System.out.println(calculate_sum(square));
	}
	
	public static int calculate_sum(int[][]arr) {
		int left_dio=0;
		int right_dio=0;
		//calcuating the sum of left diognal
		for(int i=0;i<arr.length;i++) {
			
				left_dio+=arr[i][i];
			}
		System.out.println(left_dio);
		//calculating the sum of rigth dio
		for(int i=0;i<arr.length;i++) {
			right_dio+=arr[i][arr.length-1-i];
		}
		System.out.println(right_dio);
		return Math.abs(right_dio-left_dio);
		}
	

}
