package Arrays;


import java.util.*;
public class Spiralmatrix1 {
	public static void main(String[] args) {
		int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		printmatrix(arr);
		
	}
	
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
