package Arrays;

import java.util.*;
public class Diognal_traversal_reverse {
	
	public static void main(String[] args) {
		int[][]matrix= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		printele(matrix);
	}
	
	
	public static void printele(int[][]arr) {
		
		int c=0;
		int r=0;
		
		int m=arr.length;
		int n=arr[0].length;
		
		for(int d=0;d<=m+n-1;d++) {
			
		
			
			if(d>=n) {
			
				r+=1;
	
				c=n-1;
				int r2=r;
				int c2=c;
		
				while(r2<m && c2>=0) {
					System.out.print(arr[r2][c2]+" ");
					r2++;
					c2--;
				}
				
				
			}else {
				
				int r1=0;
				int c1=d;
				
				while(r1<m && c1>=0) {
					System.out.print(arr[r1][c1]+" ");
					r1++;
					c1--;
				}
			}
			
			System.out.println();
		}
	}

}
